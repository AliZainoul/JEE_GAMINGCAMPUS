package src;

public class ClassA {
  // Members
  private int privateintA;
  protected int protectedintA;
  public int publicintA;
  int defaultintA;
  // Constructors
  public ClassA(int _privateintA, int _protectedintA, int _publicintA, int _defaultintA){
    this.privateintA = _privateintA;
    this.protectedintA = _protectedintA;
    this.publicintA = _publicintA;
    this.defaultintA = _defaultintA;
  }
  // Methods
  private void privateMethod(){
    System.out.println("This is class A, I am private Method");
  }
  protected void protectedMethod(){
    System.out.println("This is class A, I am protected Method");
    this.privateMethod();

  }
  public void publicMethod(){
    System.out.println("This is class A, I am public Method");
    this.privateMethod();
  }
  void defaultMethod(){
    System.out.println("This is class A, I am default Method");
  }
  // Getters
  public int getprivateint(){ return privateintA;}
  public int getpublicint(){ return publicintA;}
  public int getdefaultint(){ return defaultintA;}
  public int getprotectedint(){ return protectedintA;}
}