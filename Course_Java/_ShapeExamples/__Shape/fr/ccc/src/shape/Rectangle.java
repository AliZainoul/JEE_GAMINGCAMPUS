package fr.ccc.src.shape;

public class Rectangle extends Shape {
  // Members
  double width;
  double heigth;
  // String name

  // Constructors
  // Default Constructor
  //public Rectangle(){}

  public Rectangle()
  {
    super("");
    this.width = 0.0;
    this.heigth = 0.0;
  }

  // Initializer Constructor
  public Rectangle(double _width, double _heigth, String _name)
  {
    super(_name);
    if (_width >= 0 && _heigth >= 0){
      this.width = _width;
      this.heigth = _heigth;
    }
  }

  // Methods
  @Override
  public double calculateArea()
  {
    return (  (this.getHeigth())  *  (this.getWidth())  );
  }

  // Getters
  public double getWidth() {return width;}
  public double getHeigth() {return heigth;}
  //public String getName() {return name;}

  // Setters
  public void setWidth(double _width) {this.width =  _width;}
  public void setHeigth(double _heigth) {this.heigth = _heigth;}
  //public void setName(String _name) {this.name =  _name;}

  // Helpers
  @Override
  public void printShape()
  {
    System.out.println(
    "--------------------------------------------------"  + "\n" 
    + "Name of Rectangle: "  + this.getName() 
    + ", Sides = (" + this.getWidth() + ", " +  this.getHeigth() + ")" + "\n" 
    + "Area of my Rectangle = " + this.calculateArea() + "\n" 
    + "--------------------------------------------------"
    );
  }
}
