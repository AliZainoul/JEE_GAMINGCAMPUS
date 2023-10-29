class Animal{
  public void sound(){
    System.out.println("Animal making a sound");
  }
}

class Cat extends Animal{
  public void sound(){
    System.out.println("Cat making a sound");
    super.sound();
  }
}

class Dog extends Animal{
  public void sound(){
    System.out.println("Dog making a sound");
    super.sound();
  }
}

public class Main{
  public static void main(String [] args){
    Animal animal = new Animal();
    Cat cat = new Cat();
    Dog dog = new Dog();
    animal.sound();
    cat.sound();
    dog.sound();
  }
}