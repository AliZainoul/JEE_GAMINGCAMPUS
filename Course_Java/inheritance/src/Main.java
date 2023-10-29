package src;

public class Main
{
  static void printLine() { System.out.println("----------------------------"); }
  public static void main(String[] args)
  {
    System.out.println("-------------TEST CLASS A---------------");
    //ClassA ca = new ClassA(1, 2, 3, 4);
    ClassA ca = new ClassA(1, 2, 3, 4);
    
    printLine();
    System.out.println("Call to my public Method:");
    ca.publicMethod();
    System.out.println("Call to my public Member:" + ca.publicintA );
    System.out.println("Call to my public Member with getter:" + ca.getpublicint());
    printLine();

    printLine();
    System.out.println("Call to my default Method:");
    ca.defaultMethod();
    System.out.println("Call to my default Member:" + ca.defaultintA );
    System.out.println("Call to my default Member with getter:" + ca.getdefaultint());
    printLine();

    printLine();
    System.out.println("Call to my protected Method:");
    ca.protectedMethod();
    System.out.println("Call to my protected Member:" + ca.protectedintA );
    System.out.println("Call to my protected Member with getter:" + ca.getprotectedint());
    printLine();
    
    printLine();
    System.out.println("Call to my private Method:");
    ca.publicMethod(); // WHEREAS HERE IT WORKS, CAUSE THE CALL IS INDIRECT AND VIA A PUBLIC METHOD
    ca.protectedMethod(); // WHEREAS HERE IT WORKS, CAUSE THE CALL IS INDIRECT AND VIA A PROCTED METHOD 
    // ca.privateMethod(); // WILL CAUSE AN ERROR EVERY SINGLE TIME, CAUSE THE METHOD IS SIMPLY PRIVATE!
    // System.out.println("Call to my private Member:" + ca.privateintA );
    System.out.println("Call to my private Member with getter:" + ca.getprivateint());
    printLine();
    
    ClassB cb = new ClassB(1,2,3,4,5,6,7,8);
    System.out.println("-------------TEST CLASS B---------------");
    printLine();
    System.out.println("Call to my public Method:");
    cb.publicMethod();
    System.out.println("Call to my public Member:" + cb.publicintB );
    System.out.println("Call to my public Member with getter:" + cb.getpublicint());
    printLine();

    printLine();
    System.out.println("Call to my default Method:");
    cb.defaultMethod();
    System.out.println("Call to my default Member:" + cb.defaultintB);
    System.out.println("Call to my default Member with getter:" + cb.getdefaultint());
    printLine();

    printLine();
    System.out.println("Call to my protected Method:");
    cb.protectedMethod();
    System.out.println("Call to my protected Member:" + cb.protectedintB);
    System.out.println("Call to my protected Member with getter:" + cb.getprotectedint());
    printLine();
    
    printLine();
    System.out.println("Call to my private Method:");
    cb.publicMethod(); // WHEREAS HERE IT WORKS, CAUSE THE CALL IS INDIRECT AND VIA A PUBLIC METHOD
    cb.protectedMethod(); // WHEREAS HERE IT WORKS, CAUSE THE CALL IS INDIRECT AND VIA A PROCTED METHOD 
    // ca.privateMethod(); // WILL CAUSE AN ERROR EVERY SINGLE TIME, CAUSE THE METHOD IS SIMPLY PRIVATE!
    // System.out.println("Call to my private Member:" + cb.privateintA );
    System.out.println("Call to my private Member with getter:" + cb.getprivateint());
    printLine();



    /* 
    System.out.println("-------------TEST CLASS B après UPCASTING---------------");
    System.out.println("----------------------------");
    System.out.println("Call to my protected Method:");
    ((ClassA) cb).protectedMethod();
    System.out.println("----------------------------");
    System.out.println("Call to my public Method:");
    ((ClassA) cb).publicMethod();
    System.out.println("----------------------------");
    System.out.println("Call to my default Method:");
    ((ClassA) cb).defaultMethod();
    */
    

    
    /*
    System.out.println("-------------TEST CLASS A après DOWNCASTING---------------");
    printLine();
    System.out.println("Call to my protected Method:");
    ((ClassB) ca).protectedMethod();
    printLine();
    System.out.println("Call to my public Method:");
    ((ClassB) ca).publicMethod();
    printLine();
    System.out.println("Call to my default Method:");
    ((ClassB) ca).defaultMethod();
    */

    
  }
}



// TO COMPILE:
/*
  javac -d bin src/*.java
  java -cp bin src.Main
*/ 
