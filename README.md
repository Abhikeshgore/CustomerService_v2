# Customer Service Application

This repository is for Customer Service Application. This application exposes REST services to access customer resource.

## Built With

* 	[Maven 4.0.0](https://maven.apache.org/) - Dependency Management
* 	[JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) - Java™ Platform, Standard Edition Development Kit
* 	[Spring Boot 3.1.3](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[H2](https://www.h2database.com/html/main.html) - The Java SQL in-memory database
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[JUnit5](https://junit.org/junit5/) - A simple framework to write repeatable tests.
* 	[Swagger 2](https://swagger.io/) - Interactive API documentation

## Running The Application Locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com/customerservice/CustomerServiceApplication.java` class from your IDE.

* 	Download the zip or clone the Git repository.
* 	Unzip the zip file (if you downloaded one)
* 	Open Command Prompt and Change directory (cd) to folder containing pom.xml
* 	Open IntelliJ IDEA
	* File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
	* Select the project
* 	Choose the Spring Boot Application file (search for @SpringBootApplication)
* 	Right Click on the file and Run as Java Application
Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

Note: Please make sure you have JDK 17 installed on your system as default runtime environment is set to Java 17. 
If you have any other version installed(should be higher than JDK 17), please make sure you change `java.version` property in pom.xml.

## Unit Testing


## Request Details:

| Method        | URL           | Request  | 
| ------------- |:-------------:|-------------  |
| POST      | http://localhost:8080/customers |{"firstName": "Abhay","lastName": "Gore","age": 23,"gender":"OTHER","currentAddress":[{ "houseNumber":"asdcs","street": "sdvfs","city": "sdcwfc","province": "knvifv","country": "sdvksk", "pincode": "sdcvjwad"},{"houseNumber": "anotherHouseNumber","street": "anotherStreet","city": "anotherCity","province": "anotherProvince","country": "anotherCountry","pincode": "anotherPincode"}]}| 
| GET |http://localhost:8080/customers/{externalId}     | externalId = id of the customer   |

## Future Changes:


## Swagger API:




