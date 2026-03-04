 # Calculator TestNG Demo – SEPQM Assignment

## Project Overview
This repository demonstrates the use of the TestNG testing framework to improve software quality through automated testing.  
The project was developed as part of the Software Engineering Process and Quality Management (SEPQM) module.

The objective of this project is to show how TestNG features such as Assertions, Fixtures, Data-driven testing, and Test Reporting can be used in real-world software development to ensure reliability and maintainability.

The project implements a simple Calculator application and a set of automated test cases using TestNG.

---

## Technology Stack

| Technology | Purpose |
|-----------|--------|
| Java | Programming language |
| TestNG | Testing framework |
| Maven | Dependency management and build automation |
| IntelliJ IDEA | Development environment |
| GitHub | Version control and collaboration |

---

## Project Structure

calculator-testng-demo  
│  
├── src  
│   ├── main  
│   │   └── java/com/sepqm  
│   │        ├── App.java  
│   │        └── Calculator.java  
│   │  
│   └── test  
│       └── java/com/sepqm/tests  
│            ├── CalculatorAssertionsTest.java  
│            ├── CalculatorFixturesTest.java  
│            ├── CalculatorDataProviderTest.java  
│            └── CalculatorReportDemoTest.java  
│  
├── testng.xml  
├── pom.xml  
└── README.md  

---

## Implemented TestNG Features

This project demonstrates several important features of TestNG.

| Member | Feature Demonstrated | Description |
|------|----------------------|-------------|
| Member 1 | Assertions | Used Assert.assertEquals, assertTrue, and exception assertions to verify expected outputs. |
| Member 2 | Fixtures (Setup/Teardown) | Used @BeforeMethod and @AfterMethod to create a clean test environment before each test. |
| Member 3 | DataProvider | Used @DataProvider to execute the same test with multiple input values. |
| Member 4 | Test Reporting | Generated HTML reports showing test execution results. |

These features help improve test reliability, coverage, and maintainability.

---

## Calculator Functions Tested

The following operations of the Calculator class are tested:

- Addition  
- Subtraction  
- Multiplication  
- Division  
- Division by zero exception handling  

Example method:

public int add(int a, int b) {
    return a + b;
}

---

## Running the Tests

### Method 1 – Using IntelliJ (Recommended)

1. Open the project in IntelliJ IDEA  
2. Open the Maven Tool Window  
3. Navigate to: Lifecycle → test  
4. Double-click **test**

This will execute all TestNG test cases.

---

### Method 2 – Running TestNG Suite

Run the TestNG suite file `testng.xml`.

Right-click the file and select:

Run 'Calculator Test Suite'

---

## Test Execution Result

After running the tests, TestNG generates an HTML report that summarizes the results.

Report location:

target/surefire-reports/index.html

The report contains:

- Total number of tests executed  
- Passed / Failed test results  
- Execution time  
- Test method details  

---

## Example Test Report

Example output:

Tests run: 10  
Passed: 10  
Failures: 0  
Skipped: 0  

This helps developers quickly identify defects and verify software quality.

---

## Benefits of Using TestNG

Using TestNG provides several advantages in software testing:

- Supports powerful assertions  
- Provides flexible test configuration  
- Enables data-driven testing  
- Supports parallel test execution  
- Generates detailed test reports  
- Easily integrates with CI/CD pipelines  

These features make TestNG suitable for enterprise-level test automation.

---

## Learning Outcome

Through this project we learned:

- How automated testing improves software quality  
- How TestNG structures test cases efficiently  
- How to organize tests using fixtures and data providers  
- How automated reports help track testing results  
- How testing integrates into modern software development workflows  

---

## Contributors

This project was developed collaboratively as part of the SEPQM assignment.

| Member | Responsibility |
|------|----------------|
| Member 1 | Assertions Implementation |
| Member 2 | Fixtures Implementation |
| Member 3 | Data-driven Testing |
| Member 4 | Test Reporting Demonstration |

---

## License

This project is developed for educational purposes as part of the Software Engineering Process and Quality Management module.

---

## Repository

GitHub Repository:

https://github.com/migarasliit/calculator-testng-demo

---

## Final Note

Automated testing frameworks like TestNG play a critical role in modern software engineering by improving code quality, reducing defects, and enabling faster development cycles.
