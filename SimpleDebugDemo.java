/**
 * SimpleDebugDemo - A focused Java program for demonstrating debugging checkpoints
 * Contains intentional bugs that can be found using strategic breakpoints
 */
public class SimpleDebugDemo {
    public static void main(String[] args) {
        System.out.println("Starting Simple Debug Demo...");

        // BUG: Incorrect calculation logic
        calculationBugDemo();

        // BUG: Improper string handling
        stringBugDemo();

        // BUG: Array index out of bounds
        arrayBugDemo();

        System.out.println("Debug Demo completed.");
    }

    /**
     * Calculation Bug Demo - Demonstrates logical calculation errors
     * CHECKPOINT 2: Place breakpoint at line with comment "BREAKPOINT HERE"
     */
    private static void calculationBugDemo() {
        System.out.println("\n=== Calculation Bug Demo ===");

        int total = 0;

        // BUG: Summation logic error - adds incorrect values
        // BREAKPOINT HERE - Watch the values of 'i' and 'total'
        for (int i = 1; i <= 5; i++) {
            // Should add i, but mistakenly adds i*2
            total += i * 2;  // Incorrect logic
        }

        System.out.println("Sum of numbers from 1 to 5: " + total);
        System.out.println("Expected result: 15");  // 1+2+3+4+5 = 15
    }

    /**
     * String Bug Demo - Demonstrates string handling issues
     * CHECKPOINT 3: Place breakpoint at line with comment "BREAKPOINT HERE"
     */
    private static void stringBugDemo() {
        System.out.println("\n=== String Bug Demo ===");

        String input = "Hello World";
        String result = "";

        // BUG: Incorrect string reversal logic
        // BREAKPOINT HERE - Watch the values of 'i' and 'result'
        for (int i = 0; i < input.length(); i++) {
            // Should be input.charAt(input.length() - 1 - i)
            result = result + input.charAt(i);  // This builds the string forward, not backward
        }

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + result);
        System.out.println("Expected result: dlroW olleH");
    }

    /**
     * Array Bug Demo - Demonstrates array index issues
     * CHECKPOINT 1: Place breakpoint at line with comment "BREAKPOINT HERE"
     */
    private static void arrayBugDemo() {
        System.out.println("\n=== Array Bug Demo ===");

        int[] numbers = new int[5]; // Array with 5 elements (indices 0-4)

        // Initialize array with values
        for (int i = 0; i < 5; i++) {
            numbers[i] = i * 10;
        }

        // BUG: Trying to access the 6th element (index 5) of a 5-element array
        // BREAKPOINT HERE - Watch the value of 'i' and array bounds
        for (int i = 0; i <= 5; i++) {  // <= should be <
            System.out.println("Accessing element at index " + i);
            System.out.println("Value: " + numbers[i]);  // Will throw exception at i=5
        }
    }
}

