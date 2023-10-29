//package src;

import linearalgebra.src.*;

// Main
public class main {
  public static void main(String[] args) {

    // TEST VECTOR
    vector v1 = new vector();
    System.out.println("Printing vector 1");
    System.out.println("------------------");
    System.out.println("is null? "+(v1 == null));
    System.out.println("Size = "+v1.getSize());
    // v1.printVector();

    vector v2 = new vector(3);
    System.out.println("Printing vector 2");
    System.out.println("------------------");
    System.out.println("is null? "+(v2 == null));
    System.out.println("Size = "+v2.getSize());
    // v2.printVector();

    vector v3 = new vector(10, 2);
    System.out.println("Printing vector 3");
    System.out.println("------------------");
    System.out.println("is null? "+(v3 == null));
    System.out.println("Size = "+v3.getSize());
    // v3.printVector();

    vector v4 = new vector(10, 3);
    System.out.println("Printing vector 4");
    System.out.println("------------------");
    System.out.println("is null? "+(v4 == null));
    System.out.println("Size = "+v4.getSize());
    // v4.printVector();

    // double result_dot_product = v3.dotProduct(v4);
    // System.out.println(result_dot_product);

    vector v5 = new vector();
    v5 = v3.add(v4);
    System.out.println("Printing vector 5");
    System.out.println("------------------");
    System.out.println("is null? "+(v5 == null));
    System.out.println("Size = "+v5.getSize());
    // v5.printVector();


    // TEST MATRIX
    matrix m1 = new matrix(999, 2);
    matrix m2 = new matrix(999, 3);

    long startTimepS = System.nanoTime();
    matrix m3 = new matrix(m1.productStrassen(m2));
    long endTimepS = System.nanoTime();
    long totalTimepS = startTimepS - endTimepS;
    System.out.println("totalTimepS" + totalTimepS);

    long startTimenP = System.nanoTime();
    matrix m4 = new matrix(m1.product(m2));
    long endTimenP = System.nanoTime();
    long totalTimenP = startTimenP - endTimenP;
    System.out.println("totalTimenP" + totalTimenP);

    /*
    System.out.println("Printing matrix m1: ");
    System.out.println("----------------------");
    (m1).printMatrix();

    System.out.println("Printing matrix m2: ");
    System.out.println("----------------------");
    (m2).printMatrix();

    System.out.println("Printing matrix m3: ");
    System.out.println("----------productStrassen----------");
    (m3).printMatrix();

    System.out.println("Printing matrix m4: ");
    System.out.println("----------naiveProduct----------");
    (m4).printMatrix();
    */
  }
}
