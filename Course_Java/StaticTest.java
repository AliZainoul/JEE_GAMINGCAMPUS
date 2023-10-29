import java.util.ArrayList;

public class StaticTest {

    // Static member
    public static int staticCounter;

    // Non-static member
    private int nonStaticCounter;

    // Constructor
    StaticTest() {
        staticCounter++;
        nonStaticCounter++;
    }

    public static void printLine() {
        System.out.println("----------------------");
    }

    public int getStaticCounter() {
        return staticCounter;
    }

    public int getNonStaticCounter() {
        return nonStaticCounter;
    }

    public static void main(String[] args) {
        printLine();

        // Create an ArrayList to store StaticTest objects
        ArrayList<StaticTest> testObjects = new ArrayList<>();

        // Use a loop to instantiate the objects and add them to the ArrayList
        for (int i = 0; i < 10; i++) {
            StaticTest testObject = new StaticTest();
            testObjects.add(testObject);
        }

        printLine();
        System.out.println("Number of static objects created: " + staticCounter);
        printLine();

        // Access the non-static counter for each instance in the ArrayList
        for (int i = 0; i < testObjects.size(); i++) {
            System.out.println("Non-static counter for object " + i + ": " + testObjects.get(i).getNonStaticCounter());
        }
    }
}
