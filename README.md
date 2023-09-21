# Console Calculator Application

Welcome to the Console Calculator Application! This is a straightforward and user-friendly calculator that operates right from your console.

## Features

Basic Arithmetic Operations: Supports addition, subtraction, multiplication, and division.

Freeform Input: Allows users to input expressions in the format a + b, a-b, etc.

Immediate Feedback: Instantly receive feedback on invalid inputs or calculation results.

Exit Anytime: Simply type "exit" to safely close the application.

## How to Use

Starting the Application: Run the CalculatorApp class in your IDE or through the command line.

Entering Expressions: At the prompt, type in your arithmetic expression. For example:

For addition: 12 + 5

For multiplication: 6.5 * 3

Make sure there is a space between the numbers and the operation symbol.

Exiting the Application: If you wish to exit, simply type exit at the prompt and hit Enter.

### Troubleshooting

Invalid Expression: If you receive an "Invalid expression" message, ensure your input is in the correct format and try again.
NumberFormatException: Ensure you're entering valid numbers and not any other characters.

## Development

The main components of this application are:

InputHandler: Handles user inputs and displays prompts.

Operation: An enum representing the arithmetic operations.

Addition, Subtraction, Multiplication, Division: Classes representing the arithmetic functions.

Extending the Application

Adding More Operations: To add more operations, update the Operation enum and modify the switch case in the main application logic.
Testing

The application has been tested for various inputs. For specific tests, refer to the test directory.

Contributing

Feel free to fork this repository and contribute. Pull requests are welcome.

License
MIT License