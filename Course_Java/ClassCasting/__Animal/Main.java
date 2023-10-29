// Up casting
class Animal {
  public void sound() {
    System.out.println("Animal making a sound");
  }
}

// The Animal class is the parent class, and Cat and Dog are its child classes.
class Cat extends Animal {
  public void sound() {
    System.out.println("Cat making a sound");
    super.sound(); // Calls the sound() method of the parent class (Animal).
  }
}

class Dog extends Animal {
  public void sound() {
    System.out.println("Dog making a sound");
    super.sound(); // Calls the sound() method of the parent class (Animal).
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal(); // Create an instance of the Animal class.
    Cat cat = new Cat(); // Create an instance of the Cat class.
    Animal catAnimal = cat; // Upcasting: Assign a Cat object to an Animal reference.
    Dog dog = new Dog(); // Create an instance of the Dog class.
    Animal dogAnimal = dog; // Upcasting: Assign a Dog object to an Animal reference.

    // Call the sound() method on instances of Animal, Cat, and Dog classes.
    animal.sound(); // Output: "Animal making a sound"
    cat.sound(); // Output: "Cat making a sound" followed by "Animal making a sound"
    dog.sound(); // Output: "Dog making a sound" followed by "Animal making a sound"
    catAnimal.sound(); // Output: "Cat making a sound" followed by "Animal making a sound"
    dogAnimal.sound(); // Output: "Dog making a sound" followed by "Animal making a sound"
  }
}
