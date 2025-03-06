public class HelloWorld {

    // Main method
    public static void main(String[] args) {
        // Print "Hello, World!" to the console
        System.out.println("Hello, World!");

        // Define two numbers
        int num1 = 5;
        int num2 = 10;

        // Call the addNumbers function and store the result
        int result = addNumbers(num1, num2);

        // Print the result to the console
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + result);
    }

    // Function to add two numbers
    public static int addNumbers(int a, int b) {
        // Return the sum of a and b
        return a + b;
    }
}