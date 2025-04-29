package com.Generics;


// Step 1: Create a generic interface
interface Processor<T> {
    /**
     * Process data of type T and return the result.
     * @param input The data to be processed.
     * @return The processed result.
     */
    T process(T input);
}

// Step 2: Implement the generic interface for String processing
class StringProcessor implements Processor<String> {
    @Override
    public String process(String input) {
        // Reverse the input string
        StringBuilder reversed = new StringBuilder(input).reverse();
        return reversed.toString();
    }
}

// Step 3: Implement the generic interface for Integer processing
class IntegerProcessor implements Processor<Integer> {
    @Override
    public Integer process(Integer input) {
        // Calculate the square of the input integer
        return input * input;
    }
}

// Step 4: Test class to demonstrate the usage
public class GenericInterface {
    public static void main(String[] args) {
        // Create an instance of StringProcessor
        Processor<String> stringProcessor = new StringProcessor();
        String originalString = "Hello";
        String processedString = stringProcessor.process(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Processed String: " + processedString);

        // Create an instance of IntegerProcessor
        Processor<Integer> integerProcessor = new IntegerProcessor();
        Integer originalInteger = 5;
        Integer processedInteger = integerProcessor.process(originalInteger);
        System.out.println("Original Integer: " + originalInteger);
        System.out.println("Processed Integer: " + processedInteger);
    }
}

