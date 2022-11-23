# App Setup

In order to run the app, you need to follow the installation instructions using this [link](https://github.com/andela-technology/qe-coding-challenge/blob/master/setup.md).

# Test automation Framework

## About this project
* The project holds automation tests for *GitHub repositories search program*.
* This Cucumber BDD testing framework is written in Java using Selenium WebDriver and JUnit.
* The project is built using Maven.
* The project is using Page Object Model design pattern.
* The project is using JUnit for test assertions.
* The project is using Cucumber html report for reporting.


## Framework setup

1. Clone the project from [here](https://github.com/afilipchuk/qe-coding-challenge-testing/).
2. Open the project in your IDE.
3. Install Cucumber for Java plugin in your IDE.
4. Install Gherkin plugin in your IDE.
5. Run the following command in the terminal to install the dependencies, run the tests and generate the report:
```
mvn clean install
```
The tests can be also executed from TestRunner class by providing a desired tag or directly from the applicationTesting.feature file.
```
/qe-coding-challenge-testing/src/test/resources/features/applicationTesting.feature
```
6. The report will be generated in the following path:
```
/qe-coding-challenge-testing/target/cucumber.html
```
7. Open the report in your browser.




