public class Circle extends Shape {
  // Members
  private double radius;

  // Constructors
  // Default Constructor
  public Circle(String _name){ super(_name);}

  // Constructor

  // Initializer Constructor
  public Circle(double _radius, String _name)
  {
    super(_name);
    this.radius = _radius;
  }

  // Methods
  @Override
  public double calculateArea()
  {
    final double PI = 3.14 ;
    return (PI) * (this.getRadius()) * (this.getRadius());
  }

  // Getters
  public double getRadius() {return radius;}
  public double getDiameter() {return (radius * 2);}
  //public String getName() {return name;}

  // Setters
  public void setRadius(double _radius) { this.radius = _radius;}
  public void setDiameter(double _diameter) { this.radius = _diameter / 2;}
  //public void setName(String _name) {this.name = _name;}

  // Helpers
  @Override
  public void printShape()
  {
    System.out.println(
    "--------------------------------------------------" + "\n" 
    + "Name of circle: "  + this.getName() + "\n" 
    + ", radius = " + this.getRadius() + "\n" 
    + "Area of my Circle = " + this.calculateArea()  + "\n" 
    + "--------------------------------------------------" + "\n" 
    );
  }
}
