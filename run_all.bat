@echo off
echo Running all API clients...

start cmd /c "cd Api_java && javac api_java.java && java api_java"
start cmd /c "cd Api_python && python api_python.py"
start cmd /c "cd Api_C && dotnet run"

echo All launched. Check individual windows for output.
