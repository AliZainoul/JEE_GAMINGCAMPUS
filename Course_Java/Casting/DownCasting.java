// Define a Java class named DownCasting
public class DownCasting {

    // Define constant variables for bit masking and example values
    private static final int BYTE_MASK = 0xFF;
    private static final int EXAMPLE_1_VALUE = 1000000;
    private static final int EXAMPLE_2_VALUE = 253;
    private static final int EXAMPLE_3_VALUE = 130;
    private static final int CHAR_A = 'A';

    // The main method, the entry point of the program
    public static void main(String[] args) {
        // Create an instance of the DownCasting class
        DownCasting downCasting = new DownCasting();
        
        // Call various test methods to demonstrate type conversions
        downCasting.testIntToShort();
        downCasting.testShortToByte();
        downCasting.testIntToByte();
        downCasting.testOtherCasts();
    }

    // Method to test integer to short conversion
    public void testIntToShort() {
        // Assign an integer value to a variable
        int intValue = EXAMPLE_1_VALUE;
        
        // Print the integer value
        printLine("int: " + intValue);
        
        // Print the binary representation of the integer value
        printBinary("Binary Representation (int): ", intValue);
        
        // Print a separator line
        printLine("------------------------------------------------");

        // Explicitly cast the integer to a short
        short shortValue = (short) intValue;
        
        // Print the short value
        printLine("short: " + shortValue);
        
        // Print the binary representation of the short value
        printBinary("Binary Representation (short): ", shortValue);
        
        // Print a separator line
        printLine("------------------------------------------------");
    }

    // Method to test short to byte conversion
    public void testShortToByte() {
        // Assign a short value to a variable
        short shortValue = EXAMPLE_2_VALUE;
        
        // Print the short value
        printLine("short: " + shortValue);
        
        // Print the binary representation of the short value
        printBinary("Binary Representation (short): ", shortValue);
        
        // Explain the conversion process
        // explainConversion("short");

        // Invert (flip) all the bits of the short value and apply a byte mask
        int invertedValue = ~shortValue & BYTE_MASK;
        
        // Explicitly cast the inverted value to a byte
        byte byteValue = (byte) invertedValue;
        
        // Print the byte value
        printLine("byte: " + byteValue);
        
        // Print the binary representation of the byte value
        printBinary("Binary Representation (byte): ", byteValue);

        // Calculate the expected byte value by explicitly casting the short value to a byte
        byte expectedByteValue = (byte) shortValue;
        
        // Print the binary representation of the expected byte value
        printBinary("Binary Representation of number (-3): ", expectedByteValue);
        
        // Print a separator line
        printLine("------------------------------------------------");
    }

    // Method to test integer to byte conversion
    public void testIntToByte() {
        // Assign an integer value to a variable
        int intValue = EXAMPLE_3_VALUE;
        
        // Print the integer value
        printLine("int: " + intValue);
        
        // Print the binary representation of the integer value
        printBinary("Binary Representation (int): ", intValue);
        
        // Explain the conversion process
        // explainConversion("int");

        // Invert (flip) all the bits of the integer value and apply a byte mask
        int invertedIntValue = ~intValue & BYTE_MASK;
        
        // Explicitly cast the inverted integer value to a byte
        byte byteValue = (byte) invertedIntValue;
        
        // Print the byte value
        printLine("byte: " + byteValue);
        
        // Print the binary representation of the byte value
        printBinary("Binary Representation (byte): ", byteValue);

        // Calculate the expected byte value by explicitly casting the inverted integer value to a byte
        byte expectedByteValue = (byte) invertedIntValue;
        
        // Print the binary representation of the expected byte value
        printBinary("Binary Representation of number (-126): ", expectedByteValue);
        
        // Print a separator line
        printLine("------------------------------------------------");
    }

    // Method to test other type casts
    public void testOtherCasts() {
        // Assign a double value to a variable
        double doubleValue = 123.45;
        
        // Print the double value
        printLine("double: " + doubleValue);

        // Explicitly cast the double value to a float
        float floatValue = (float) doubleValue;
        
        // Print the float value
        printLine("float: " + floatValue);

        // Assign a character 'A' to a variable
        char charValue = (char) CHAR_A;
        
        // Print the character value
        printLine("char: " + charValue);
        
        // Print the binary representation of the character value
        printBinary("Binary Representation (char): ", charValue);
        
        // Print the integer representation of the character value
        printLine("int (char to int): " + (int) charValue);
        
        // Print the binary representation of the integer value obtained from the character
        printBinary("Binary Representation (int from char): ", (int) charValue);
    }

    // Method to explain the conversion process
    private void explainConversion(String type) {
        printLine("In two's complement representation, negative numbers are indicated by the leftmost bit (most significant bit) being 1,");
        printLine("which makes the number negative. When converting a negative number to a smaller data type, such as from " + type + ",");
        printLine("we need to follow specific steps to ensure the correct representation.");
        printLine("Explicit casting to byte");
    }

    // Method to print a line of text
    private void printLine(String text) {
        System.out.println(text);
    }

    // Method to print binary representation and compare it with the expected binary
    private void printBinary(String label, int value) {
        // Get the binary representation of the value
        String binary = Integer.toBinaryString(value);
        
        // Remove leading zeros in the binary representation
        String truncatedBinary = getBinaryRepresentation(value);
        
        // Print the label and truncated binary representation
        printLine(label + truncatedBinary);
        
        // Compare the truncated binary with the original binary
        compareBinaryStrings(truncatedBinary, binary);
    }

    // Method to obtain the binary representation without leading zeros
    private String getBinaryRepresentation(int value) {
        String binary = Integer.toBinaryString(value);
        return removeLeadingZeros(binary);
        // OR similalry, one may use regex:
        // Remove leading zeros using a regular expression
        // return binary.replaceFirst("^0+(?!$)", "");
    }

    // Method to remove leading zeros from a binary string
    private String removeLeadingZeros(String binary) {
        int startIndex = 0;
        while (startIndex < binary.length() && binary.charAt(startIndex) == '0') {
            startIndex++;
        }
        return binary.substring(startIndex);
    }
    // Method to compare two binary strings and print the result
    private void compareBinaryStrings(String expected, String actual) {
        // Check if the expected and actual binary representations are equal
        if (expected.equals(actual)) {
            printLine("Binary Representation Matched: " + actual);
        } else {
            // Print a message indicating a mismatch
            printLine("Binary Representation Mismatch! Actual: " + actual + ", Expected: " + expected);
        }
    }
}
