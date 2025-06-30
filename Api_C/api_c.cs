using System;
using System.IO;
using System.Net.Http;
using System.Threading.Tasks;

class api_c
{
    static async Task Main()
    {
        string url = "https://pokeapi.co";

        try
        {
            using HttpClient client = new HttpClient();
            var response = await client.GetAsync(url);

            if (response.IsSuccessStatusCode)
            {
                var json = await response.Content.ReadAsStringAsync();
                string filePath = "api_c_response.csv";

                using StreamWriter writer = new StreamWriter(filePath);
                writer.WriteLine("\"response\"");
                writer.WriteLine("\"" + json.Replace("\"", "\"\"") + "\"");

                Console.WriteLine("Response saved to: " + filePath);
            }
            else
            {
                Console.WriteLine("API returned status: " + (int)response.StatusCode);
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine("Request failed: " + ex.Message);
        }
    }
}
