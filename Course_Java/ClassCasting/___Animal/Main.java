// Down casting

// Create a class named "Animal" representing a generic animal.
class Animal {
  public void sound() {
    System.out.println("Animal making a sound");
  }
}

// Create a class named "Cat" that extends the "Animal" class, inheriting its behavior.
class Cat extends Animal {
  // Override the "sound" method to provide a specific implementation for a cat's sound.
  public void sound() {
    System.out.println("Cat making a sound");
    super.sound(); // Call the "sound" method of the parent class (Animal).
  }
}

// Create a class named "Dog" that extends the "Animal" class, inheriting its behavior.
class Dog extends Animal {
  // Override the "sound" method to provide a specific implementation for a dog's sound.
  public void sound() {
    System.out.println("Dog making a sound");
    super.sound(); // Call the "sound" method of the parent class (Animal).
  }
}

// Create the main class named "Main" for program execution.
public class Main {
  public static void main(String[] args) {
    // Create an instance of "Cat" and assign it to an "Animal" reference (upcasting).
    Animal animal = new Cat();
    
    // Check if the object referred to by "animal" is an instance of "Cat" before downcasting.
    if (animal instanceof Cat) {
      // Downcast the "animal" reference to a "Cat" reference.
      Cat cat = (Cat) animal;
      // Call the "sound" method of the "Cat" class.
      cat.sound();
      // Call the "sound" method of the "Animal" class using the "animal" reference.
      animal.sound();
    }

    // Create an instance of "Dog" and assign it to an "Animal" reference (upcasting).
    Animal animal1 = new Dog();
    
    // Check if the object referred to by "animal1" is an instance of "Dog" before downcasting.
    if (animal1 instanceof Dog) {
      // Downcast the "animal1" reference to a "Dog" reference.
      Dog dog = (Dog) animal1;
      // Call the "sound" method of the "Dog" class.
      dog.sound();
      // Call the "sound" method of the "Animal" class using the "animal1" reference.
      animal1.sound();
    }

    // Create instances of "Cat" and "Dog" classes.
    Cat cat = new Cat();
    Dog dog = new Dog();
    
    // Call the "sound" method on instances of "Animal," "Cat," and "Dog" classes.
    animal.sound();
    cat.sound();
    dog.sound();
  }
}
