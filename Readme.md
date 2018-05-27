***************************************************
        EriBank Application Testing
****************************************************
System Requirements:
--------------------
1.Install java jdk1.8
2.Install Appium
3.Install Eclipse
4.Install Maven
5. Install TestNG
6. Set the path in system environment variables
7. Download Eribank apk file from the link https://code.google.com/archive/p/eribank/downloads
8. Connect the android mobile device to computer and install the downloaded apk file.

Automation Excersie project is created to test the below 5 scenarios
-----------------------------------------------------------------------

1. Verification of Eribank Login Screen
2. Verification of Payment Screen
3. Verification of Make Payment
4. Verification of Cancel Payment
5. Verification of Logout

This project is developed using Maven build tool and TestNG framework

POM.XML - All the dependencies of jar files are included in POM.XML file
Data.java _ All the input data are stored in Data.java file

Executing the above mentioned five scenarios
----------------------------------------------
Execution.xml file is created to run a suite together.

A batch file named as run.bat is created to execute all the scenarios together

Update the required input in Data.java file
Double click the run.bat after the device is connected to laptop.
