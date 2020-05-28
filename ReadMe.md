##

[Reference Link](https://www.youtube.com/watch?v=CnwOEkIYSUk&t=259s)

GitHub Link: https://github.com/microsoft/WinAppDriver

https://github.com/Microsoft/WinAppDriver/releases

## Steps

1.  Download Windows Application Driver installer from  [https://github.com/Microsoft/WinAppDriver/releases](https://github.com/Microsoft/WinAppDriver/releases)
> Download the the msi file

2.  Run the installer on a Windows 10 machine where your application under test is installed and will be tested
> Here I am taking Notepad Application

3.  Enable  [Developer Mode](https://docs.microsoft.com/en-us/windows/uwp/get-started/enable-your-device-for-development)  in Windows settings
> Windows key search for developer setting > turn on > close it

4.  Run  `WinAppDriver.exe`  from the installation directory (E.g.  `C:\Program Files (x86)\Windows Application Driver`)
> Start  driver C:\Program Files (x86)\Windows Application Driver\WinAppDriver.exe  - then minimise it

## For Inspecting Element ??
[windows-10-sdk](https://developer.microsoft.com/en-us/windows/downloads/windows-10-sdk/)
> Download The Installer
> Start Installing
> Install only Few things (attached)
> Check and Open Inspect application 
> >C:\Program Files (x86)\Windows Kits\10\bin\10.0.19041.0\x64\inspect.exe
> Click on this items for better understanding (Attached)