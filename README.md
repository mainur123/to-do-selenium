## Key Features:
**Singleton Design Pattern:** Ensures only one instance of essential classes like UserApi, RegisterPage, TodoPage, and ConfigUtils exists during the test execution, promoting resource efficiency and consistent behavior across tests.

**Page Object Model (POM):** Encapsulates the web elements and actions for each page of the application in separate classes (e.g., RegisterPage, NewtodoPage, TodoPage). This separation of concerns makes the tests more maintainable and readable by isolating test logic from UI structure.

**Factory Design Pattern:** The DriverFactory class centralizes WebDriver creation, allowing easy management and extension for different browser types, ensuring flexibility and consistency in test execution.

**ConfigUtils:** Manages application configurations through a singleton class that reads from a properties file, centralizing the configuration logic and making it easier to switch between environments.

**TestNG Integration:** The framework is built on top of TestNG, facilitating robust test execution with annotations like @BeforeMethod and @AfterMethod for setup and teardown, and assertions to validate expected outcomes.

**DRY Principle:** The framework avoids code duplication by reusing instances and centralizing configuration, ensuring easier maintenance and reducing the risk of errors. It supports modular testing, allowing for the reuse of components across different test cases.

Overall, this framework is designed to be modular, reusable, and easily extendable, making it a strong foundation for UI test automation in any web application.

## Project Structure:
**Models:** Contains classes like User, which represent the data structures used in the application.

**Pages:** Includes page object classes like RegisterPage, NewtodoPage, and TodoPage that encapsulate the UI interactions for specific pages.

**Factories:** The DriverFactory class is responsible for WebDriver instantiation, supporting multiple browsers.

**Tests:** Test classes such as TodoTest and UserTest define the test scenarios and validate the application's behavior.

**Utils:** Utility classes like ConfigUtils manage configuration settings and other helper functionalities.

## Purpose:
By following industry best practices and design patterns, it ensures that the test suite is easy to maintain, extend, and scale. Whether testing simple forms or complex workflows, this framework is designed to handle various testing scenarios efficiently.
