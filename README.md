# Selenium-ui-tests

The purpose of the project is to present a structure with basic functionalities for automated tests:

* Page Object Pattern
* Chain of Responsibility Pattern
* Driver Manager
* Extent Report
* Selenium Grid
* Parallel Execution

## Language and frameworks

* Java 13
* Selenium WebDriver
* WebDriver Manager
* TestNG
* Lombok

## Command line execution

Using the build plugin **maven-surefire-plugin** and configuring it with the _suiteXmlFiles_ tag:

```xml
<configuration>
   <suiteXmlFiles>
      <suiteXmlFile>src/test/resources/suites/${suite}.xml</suiteXmlFile>
   </suiteXmlFiles>
</configuration>
```

* Use **-Dsuite=XmlSuiteName** to call the suite

````bash
mvn clean test -Dsuite=smoke
````