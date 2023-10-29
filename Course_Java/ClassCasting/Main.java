class Animal {
  public void speak() {
    System.out.println("Animal speaks");
  }
}

class Dog extends Animal {
  public void speak() {
    System.out.println("Dog barks");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Dog();
    animal.speak();
    if (animal instanceof Dog) {
      Dog dog = (Dog) animal; // Downcasting
      dog.speak(); // Output: "Dog barks"
    }
  }
}