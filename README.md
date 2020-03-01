# Selenium-ui-tests

The purpose of the project is to present a structure with basic functionalities for automated tests:

* Page Object Pattern
* Chain of Responsibility Pattern
* Factory Pattern
* Extent Report
* Selenium Grid
* Parallel Execution with ThreadLocal

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

* Use _-Dsuite=XmlSuiteName_ to call the suite

````bash
mvn clean test -Dsuite=smoke
````

## Selenium Grid

in the **src/main/resources** directory are the files for creating the Grid using the **elgalu/selenium** image. After Docker is running, just run the _start-grid_ file:

````bash
sh start-grid.sh
````

## Contribute! :beers:

...