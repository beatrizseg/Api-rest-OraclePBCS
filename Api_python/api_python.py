import requests
import csv

def main():
    url = "https://pokeapi.co"

    try:
        response = requests.get(url)
        response.raise_for_status()
        json_data = response.text

        with open("api_py_response.csv", "w", newline='', encoding='utf-8') as csvfile:
            writer = csv.writer(csvfile, quoting=csv.QUOTE_ALL)
            writer.writerow(["response"])
            writer.writerow([json_data])
            print("Response saved to: api_py_response.csv")

    except requests.exceptions.RequestException as e:
        print(f"Request failed: {e}")

if __name__ == "__main__":
    main()
