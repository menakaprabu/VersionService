# VersionService
Prerequisite:
You must have java 1.8 or above installed on your machine.
To install java:
Download java 1.8 from the below URL based on your machine(MAC or Windows) https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html
Install the downloaded JDK.
Set the java path in the environmental variable.

GitBash to clone and run the application to your local machine.
Download from git bash based on your machine(MAC or Windows)
https://git-scm.com/downloads

Steps to download the jar.

Go to git repo using the URL. https://github.com/menakaprabu/VersionService.git
Launch gitbash and go to the directory in which you want to download the application.
Clone the application using: git clone https://github.com/menakaprabu/VersionService.git
Run the clean build command to build the jar file ./gradlew clean build
If you do not have permission to gradlew, provide permission using chmod 777 gradlew
./gradlew clean build would have generated versionService-0.0.1-SNAPSHOT.jar under cd /build/libs from your current project path.
Try ls to see the .jar file. It should be versionService-0.0.1-SNAPSHOT.jar
Run the jar file using java -jar versionService-0.0.1-SNAPSHOT.jar from yourApplicationPath/build/libs

Endpoint/Functionality validation:
The application is running on the default 8080 port.
Hit the below URL
http://localhost:8080/versionCheck/1.0.1/1.0.1

You can change the values and validate all the version values.
