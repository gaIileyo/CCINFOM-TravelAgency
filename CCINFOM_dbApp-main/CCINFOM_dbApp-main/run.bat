@echo off
REM Compile and run HomestayBooking application
cd /d "%~dp0"

if not defined DB_HOST (
    set /p DB_HOST=DB Host [localhost]: 
    if "%DB_HOST%"=="" set "DB_HOST=localhost"
)

if not defined DB_PORT (
    set /p DB_PORT=DB Port [3306]: 
    if "%DB_PORT%"=="" set "DB_PORT=3306"
)

if not defined DB_NAME (
    set /p DB_NAME=DB Name [homestay_tour_system]: 
    if "%DB_NAME%"=="" set "DB_NAME=homestay_tour_system"
)

if not defined DB_USER (
    set /p DB_USER=DB User [root]: 
    if "%DB_USER%"=="" set "DB_USER=root"
)

if not defined DB_PASSWORD (
    set /p DB_PASSWORD=DB Password [blank if none]: 
)

echo Compiling HomestayBooking...
javac -cp lib/mysql-connector-j-9.5.0.jar HomestayBooking.java

if %ERRORLEVEL% NEQ 0 (
    echo Compilation failed!
    pause
    exit /b 1
)

echo Running HomestayBooking...
java -cp .;lib/mysql-connector-j-9.5.0.jar HomestayBooking

pause
