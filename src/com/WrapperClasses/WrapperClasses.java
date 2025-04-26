package com.WrapperClasses;

public class WrapperClasses {

    // Method to demonstrate the Integer wrapper class
    public void integerWrapper() {
        Integer intObj = Integer.valueOf(10); // Boxing
        int intPrimitive = intObj.intValue(); // Unboxing

        System.out.println("Integer Wrapper Class:");
        System.out.println("Boxing: " + intObj);
        System.out.println("Unboxing: " + intPrimitive);
    }

    // Method to demonstrate the Double wrapper class
    public void doubleWrapper() {
        Double doubleObj = Double.valueOf(3.14); // Boxing
        double doublePrimitive = doubleObj.doubleValue(); // Unboxing

        System.out.println("Double Wrapper Class:");
        System.out.println("Boxing: " + doubleObj);
        System.out.println("Unboxing: " + doublePrimitive);
    }

    // Method to demonstrate the Character wrapper class
    public void characterWrapper() {
        Character charObj = Character.valueOf('A'); // Boxing
        char charPrimitive = charObj.charValue(); // Unboxing

        System.out.println("Character Wrapper Class:");
        System.out.println("Boxing: " + charObj);
        System.out.println("Unboxing: " + charPrimitive);
    }

    // Method to demonstrate the Boolean wrapper class
    public void booleanWrapper() {
        Boolean boolObj = Boolean.valueOf(true); // Boxing
        boolean boolPrimitive = boolObj.booleanValue(); // Unboxing

        System.out.println("Boolean Wrapper Class:");
        System.out.println("Boxing: " + boolObj);
        System.out.println("Unboxing: " + boolPrimitive);
    }

    // Method to demonstrate the Byte wrapper class
    public void byteWrapper() {
        Byte byteObj = Byte.valueOf((byte) 127); // Boxing
        byte bytePrimitive = byteObj.byteValue(); // Unboxing

        System.out.println("Byte Wrapper Class:");
        System.out.println("Boxing: " + byteObj);
        System.out.println("Unboxing: " + bytePrimitive);
    }

    // Method to demonstrate the Short wrapper class
    public void shortWrapper() {
        Short shortObj = Short.valueOf((short) 32767); // Boxing
        short shortPrimitive = shortObj.shortValue(); // Unboxing

        System.out.println("Short Wrapper Class:");
        System.out.println("Boxing: " + shortObj);
        System.out.println("Unboxing: " + shortPrimitive);
    }

    // Method to demonstrate the Long wrapper class
    public void longWrapper() {
        Long longObj = Long.valueOf(9223372036854775807L); // Boxing
        long longPrimitive = longObj.longValue(); // Unboxing

        System.out.println("Long Wrapper Class:");
        System.out.println("Boxing: " + longObj);
        System.out.println("Unboxing: " + longPrimitive);
    }

    // Method to demonstrate the Float wrapper class
    public void floatWrapper() {
        Float floatObj = Float.valueOf(3.14f); // Boxing
        float floatPrimitive = floatObj.floatValue(); // Unboxing

        System.out.println("Float Wrapper Class:");
        System.out.println("Boxing: " + floatObj);
        System.out.println("Unboxing: " + floatPrimitive);
    }

    public static void main(String[] args) {
        WrapperClasses wrapperClasses = new WrapperClasses();
        wrapperClasses.integerWrapper();
        wrapperClasses.doubleWrapper();
        wrapperClasses.characterWrapper();
        wrapperClasses.booleanWrapper();
        wrapperClasses.byteWrapper();
        wrapperClasses.shortWrapper();
        wrapperClasses.longWrapper();
        wrapperClasses.floatWrapper();
    }
}
