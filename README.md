# API Public Client (Java, Python, C#)

Este proyecto contiene tres implementaciones independientes para consumir datos de la API pública de **[PokeAPI](https://pokeapi.co)** utilizando los lenguajes **Java**, **Python** y **C#**. Cada uno realiza una consulta a un endpoint determinado y guarda la respuesta en un archivo `.csv` plano con formato texto.

---

## Objetivo

- Consumir un endpoint de la PokeAPI desde cada lenguaje.
- Guardar el JSON de la respuesta como texto plano en un archivo `.csv`.
- Cada lenguaje genera su propio archivo en su carpeta correspondiente.

---

## Estructura de carpetas

| Carpeta      | Lenguaje | Archivo principal       | Archivo de salida          |
|--------------|----------|-------------------------|-----------------------------|
| `Api_java/`  | Java     | `api_java.java`         | `api_java_response.csv`     |
| `Api_python/`| Python   | `api_python.py`         | `api_py_response.csv`       |
| `Api_C/`     | C#       | `api_c.cs`              | `api_c_response.csv`        |

---
## Ejecutar con orquestador
### Windows
```bash
.\run_all.bat
```

## Cómo ejecutar individualmente

### Java (`Api_java/`)

```bash
cd Api_java
javac api_java.java
java api_java
```

### Python (`Api_python/`)
```bash
cd Api_python
python api_python.py
```

### C# (`Api_C/`)
```bash
cd Api_C
dotnet build
dotnet run
```