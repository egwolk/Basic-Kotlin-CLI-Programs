@echo off
java -version >nul 2>&1
if %ERRORLEVEL% neq 0 (
    echo Can't run program. Please install the JDK first.
    pause
    exit /b
)
java -jar out/artifacts/Prog3_NumbersToWords_jar/Prog3_NumbersToWords.jar
pause