public class UpCasting {

    public static void main(String[] args) {
        UpCasting upCasting = new UpCasting();
        upCasting.testUpCasting();
    }

    // Method to demonstrate upcasting
    public void testUpCasting() {
        // Example 1: byte to short, int, and long
        byte b = 127; // Binary: 01111111
        printLine("byte: " + b);
        printLine("Binary Representation (byte): " + formatBinaryString(b, 8));
        compareBinaryStrings(formatBinaryString(b, 8), "01111111");
        printLine("------------------------------------------------");

        // Explicit casting from byte to short
        short s1 = (short) b; // Binary: 01111111
        printLine("short: " + s1);
        printLine("Binary Representation (short): " + formatBinaryString(s1, 16));
        compareBinaryStrings(formatBinaryString(s1, 16), "0000000001111111");
        printLine("------------------------------------------------");

        // Implicit casting from byte to int
        int i1 = b; // Binary: 01111111
        printLine("int: " + i1);
        printLine("Binary Representation (int): " + formatBinaryString(i1, 32));
        compareBinaryStrings(formatBinaryString(i1, 32), "00000000000000000000000001111111");
        printLine("------------------------------------------------");

        // Implicit casting from byte to long
        long l1 = b; // Binary: 01111111
        printLine("long: " + l1);
        printLine("Binary Representation (long): " + formatBinaryString(l1, 64));
        compareBinaryStrings(formatBinaryString(l1, 64), "0000000000000000000000000000000000000000000000000000000001111111");
        printLine("------------------------------------------------");

        // Example 2: char to int
        char c = 'A'; // Binary: 01000001
        printLine("char: " + c);
        printLine("Binary Representation (char): " + formatBinaryString(c, 16));
        compareBinaryStrings(formatBinaryString(c, 16), "0000000001000001");
        printLine("------------------------------------------------");

        // Implicit casting from char to int
        int i2 = c; // Binary: 01000001
        printLine("int (char to int): " + i2);
        printLine("Binary Representation  (int from char): " + formatBinaryString(i2, 32));
        compareBinaryStrings(formatBinaryString(i2, 32), "00000000000000000000000001000001");
        printLine("------------------------------------------------");
    }

    // Method to format a long value as a binary string with a specified length
    private String formatBinaryString(long value, int length) {
        String binaryString = Long.toBinaryString(value);
        // Pad the binary string with leading zeros to the specified length
        while (binaryString.length() < length) {
            binaryString = "0" + binaryString;
        }
        return binaryString;
    }

    // Method to compare two binary strings and print the result
    private void compareBinaryStrings(String actual, String expected) {
        if (actual.equals(expected)) {
            printLine("Binary Representation Matched: " + actual);
        } else {
            printLine("Binary Representation Mismatch! Actual: " + actual + ", Expected: " + expected);
        }
    }

    // Method to print a line of text
    private void printLine(String text) {
        System.out.println(text);
    }
}
