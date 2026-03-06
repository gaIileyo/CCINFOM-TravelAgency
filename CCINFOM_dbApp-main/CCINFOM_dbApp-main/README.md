# HomestayBooking (Java + MySQL)

## Run the app

From the project root:

- PowerShell: `./run.ps1`
- CMD: `run.bat`

Both scripts now prompt for DB settings only if the environment variables are not already set.

## Database environment variables

- `DB_HOST` (default: `localhost`)
- `DB_PORT` (default: `3306`)
- `DB_NAME` (default: `homestay_tour_system`)
- `DB_USER` (default: `root`)
- `DB_PASSWORD` (default: blank)

## One-time examples

### PowerShell (current session)

```powershell
$env:DB_HOST="localhost"
$env:DB_PORT="3306"
$env:DB_NAME="homestay_tour_system"
$env:DB_USER="root"
$env:DB_PASSWORD="your_password"
./run.ps1
```

### CMD (current session)

```bat
set DB_HOST=localhost
set DB_PORT=3306
set DB_NAME=homestay_tour_system
set DB_USER=root
set DB_PASSWORD=your_password
run.bat
```

## JVM property alternative

You can also pass values as JVM system properties:

```bash
java -Ddb.host=localhost -Ddb.port=3306 -Ddb.name=homestay_tour_system -Ddb.user=root -Ddb.password=your_password -cp .;lib/mysql-connector-j-9.5.0.jar HomestayBooking
```
