#!/usr/bin/env powershell
# Compile and run HomestayBooking application

Set-Location $PSScriptRoot

if (-not $env:DB_HOST -or [string]::IsNullOrWhiteSpace($env:DB_HOST)) {
    $inputHost = Read-Host "DB Host (default: localhost)"
    $env:DB_HOST = if ([string]::IsNullOrWhiteSpace($inputHost)) { "localhost" } else { $inputHost }
}

if (-not $env:DB_PORT -or [string]::IsNullOrWhiteSpace($env:DB_PORT)) {
    $inputPort = Read-Host "DB Port (default: 3306)"
    $env:DB_PORT = if ([string]::IsNullOrWhiteSpace($inputPort)) { "3306" } else { $inputPort }
}

if (-not $env:DB_NAME -or [string]::IsNullOrWhiteSpace($env:DB_NAME)) {
    $inputName = Read-Host "DB Name (default: homestay_tour_system)"
    $env:DB_NAME = if ([string]::IsNullOrWhiteSpace($inputName)) { "homestay_tour_system" } else { $inputName }
}

if (-not $env:DB_USER -or [string]::IsNullOrWhiteSpace($env:DB_USER)) {
    $inputUser = Read-Host "DB User (default: root)"
    $env:DB_USER = if ([string]::IsNullOrWhiteSpace($inputUser)) { "root" } else { $inputUser }
}

if ($null -eq $env:DB_PASSWORD) {
    $env:DB_PASSWORD = Read-Host "DB Password (leave blank if none)"
}

Write-Host "Compiling HomestayBooking..." -ForegroundColor Yellow
& "C:\Program Files\Microsoft\jdk-21.0.8.9-hotspot\bin\javac.exe" -cp "lib/mysql-connector-j-9.5.0.jar" HomestayBooking.java

if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    Read-Host "Press Enter to exit"
    exit 1
}

Write-Host "Running HomestayBooking..." -ForegroundColor Yellow
& "C:\Program Files\Microsoft\jdk-21.0.8.9-hotspot\bin\java.exe" -cp ".;lib/mysql-connector-j-9.5.0.jar" HomestayBooking

Read-Host "Press Enter to exit"
