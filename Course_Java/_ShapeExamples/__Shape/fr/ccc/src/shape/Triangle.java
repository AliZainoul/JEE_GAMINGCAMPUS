package fr.ccc.src.shape;

public class Triangle extends Shape {
  // Members
  private double a;
  private double b;
  private double c;

  // Constructors
  // Default Constructor
  public Triangle() {
    super("");
    this.a = 0.0;
    this.b = 0.0;
    this.c = 0.0;
  }

  // Default Constructor 2
  public Triangle(String _name) {
    super(_name);
  }

  // Initializer Constructor
  public Triangle(double _a, double _b, double _c, String _name) {
    super(_name);
    if (_a >= 0 && _b >= 0 && _c >= 0 && isTriangleValid(_a, _b, _c)) {
        this.a = _a;
        this.b = _b;
        this.c = _c;
    }
  }

  // Methods
  @Override
  public double calculateArea() {
    // HERON FORMULAE
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  // Getters
  public double getA() { return a; }
  public double getB() { return b; }
  public double getC() { return c; }

  // Setters
  public void setA(double _a) {
    if (isTriangleValid(_a, b, c)) {
        this.a = _a;
    }
  }

  public void setB(double _b) {
    if (isTriangleValid(a, _b, c)) {
        this.b = _b;
    }
  }

  public void setC(double _c) {
    if (isTriangleValid(a, b, _c)) {
        this.c = _c;
    }
  }

  // Helper method to check if side lengths can form a valid triangle
  private static boolean isTriangleValid(double a, double b, double c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
  }

  @Override
  public void printShape() {
    System.out.println(
      "-------------------------------------------------- \n"
      + "Name of Triangle: " + this.getName() + "\n"
      + ", Vertexes = (" + this.getA() + ", " + this.getB() + ", " + this.getC() + ")" + "\n"
      + "Area of my Triangle = " + this.calculateArea() + "\n"
      + "--------------------------------------------------" + "\n"
    );
  }
}
