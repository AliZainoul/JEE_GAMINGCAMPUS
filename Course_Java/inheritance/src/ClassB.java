package src;

// Afin de faire hériter B de A, il faut rajouter le mot clé: extends
// Ainsi: B héritera de la classe A.
// A va être la classe mère et B la classe fille.
public class ClassB extends ClassA {
  // Members
  private int privateintB;
  protected int protectedintB;
  public int publicintB;
  int defaultintB;

  public ClassB(
    int _privateintA, int _protectedintA,
    int _publicintA, int _defaultintA,
    int _privateintB, int _protectedintB,
    int _publicintB, int _defaultintB)
  {
  // On va appeler notre constructeur de classe A grâce au mot-clé super.
    super(_privateintA, _protectedintA, _publicintA, _defaultintA);
    this.privateintB = _privateintB;
    this.protectedintB = _protectedintB;
    this.publicintB = _publicintB;
    this.defaultintB = _defaultintB;
  }
  // Methods
  // Getters
  public int getprivateint(){ return privateintB;}
  public int getprotectedint(){ return protectedintB;}
  public int getpublicint(){ return publicintB;}
  public int getdefaultint(){ return defaultintB;}

  private void privateMethod(){
    System.out.println("This is class B, I am private Method");
  }
  protected void protectedMethod(){
    System.out.println("This is class B, I am protected Method");
    this.privateMethod();

  }
  public void publicMethod(){
    System.out.println("This is class B, I am public Method");
    this.privateMethod();
  }
  void defaultMethod(){
    System.out.println("This is class B, I am default Method");
    //this.privateMethod();

  }
}
/*
  En créant une instance de classe B (comme B hérite de A),
  on crée automatiquement une instance de classe A aussi.
*/
