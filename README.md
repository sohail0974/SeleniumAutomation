# Selenium Testing

This is a Selenium-based test automation project for the AutomationExercise application, designed using the Page Object Model (POM) with TestNG.

## Key Features

- **Data-Driven Testing**: Implemented for login functionality using TestNG's `DataProvider` and external data sources.
- **Cross-Browser Execution**: Supports running tests across multiple browsers like Chrome, Firefox, and Edge.
- **Test Grouping**: Organizes test cases into logical groups (e.g., Sanity, Regression) for flexible test execution.
- **Advanced Reporting**: Generates detailed Extent Reports for clear and concise test results visualization.
- **Page Object Model (POM)**: Ensures maintainable and scalable test code by separating UI logic from test cases.

## Project Structure

```
├── src/
│   ├── main/          # Main application source code
│   └── test/
│       ├── java/
│       │   ├── pageObjects/    # Page Object Model (POM) classes
│       │   ├── testBase/       # Base test classes
│       │   ├── testCases/      # Test case classes
│       │   └── utilities/      # Utility classes
│       └── resources/          # Test resources (log4j2.xml, etc.)
├── testdata/          # Test data files
├── logs/              # Log files (generated at runtime)
├── screenshots/       # Screenshot captures (generated at runtime)
├── reports/           # Test reports (generated at runtime)
├── test-output/       # TestNG output (generated at runtime)
└── pom.xml            # Maven configuration
```

## Prerequisites

- Java JDK 8 or higher
- Maven 3.6+
- WebDriver (ChromeDriver, GeckoDriver, etc.)

## Dependencies

- **Selenium WebDriver** 4.41.0 - Web browser automation
- **Apache POI** 5.5.1 - Excel file handling
- **Log4j 2** 2.25.3+ - Logging framework
- **TestNG** - Test framework
- **Commons IO** - Utility library

## Setup & Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd OpenCart_Automation
```

2. Install dependencies:
```bash
mvn clean install
```

3. Download WebDriver(s) and place them in your system PATH or specify the path in the test configuration.

## Running Tests

Run all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=SignUp
```

Run specific test groups:
```bash
mvn test -Dgroups=Sanity
```

Run with specific TestNG configuration:
```bash
mvn test -Dtestng.xml=testng.xml
```

## Test Reports

After running tests, reports are generated in:
- `reports/` - Detailed Extent HTML reports
- `test-output/` - Default TestNG HTML reports
- `logs/` - Application logs
- `screenshots/` - Failure screenshots

Open `reports/index.html` to view the detailed Extent report.

## Page Objects Included

- **HomePage** - Main page interactions
- **User_Signup** - User signup page
- **SignUp_Info** - Signup information page

## Configuration

Logging is configured in `src/test/resources/log4j2.xml`

## Contributing

1. Create a feature branch
2. Make your changes
3. Commit with descriptive messages
4. Push to branch
5. Create a Pull Request

## License

This project is licensed under the MIT License - see LICENSE file for details.

## Author

Automation Test Team

## Support

For issues and questions, please open an issue in the repository.
