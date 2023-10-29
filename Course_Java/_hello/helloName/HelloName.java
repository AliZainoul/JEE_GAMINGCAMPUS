import java.util.Scanner;

public class HelloName {
  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Please enter your name: ");
      String name = input.nextLine();
      System.out.println("Hello " + name + "!");
    }
  }
}