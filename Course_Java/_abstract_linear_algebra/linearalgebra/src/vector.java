package linearalgebra.src;

public class vector {
  // Members
  private int size;
  private double[] vector;

  // Constructors
  // Default Constructor
  public vector(){}

  // Size Constructor
  public vector(int _size){
    this.size = _size;
    double[] result = new double[_size];
    for(int i = 0; i < this.getSize(); i++)
      result[i] = 0;
    this.setVector(result);
  }

  // Copy Constructor
  public vector(vector _vector){
    this.size = _vector.getSize();
    this.vector = _vector.getVector();
  }

  // Copy Constructor from array
  public vector(double[] _vector) {
    int size = _vector.length;
    this.vector = new double[size];
    for (int i = 0; i < size; i++) this.vector[i] = _vector[i];
  }

  // Size / same value Constructor
  public vector(int _size, double _value){
    this.size = _size;
    this.vector = fillwithvalue(_size, _value);
  }

  public double[] fillwithvalue(int _size, double _value){
    double[] v = new double[_size];
    for(int i = 0; i< _size; i++) v[i] = _value;
    return v;
  }

  // Helpers
  public void printVector(){
    for(int i = 0; i< this.getSize(); i++)
      System.out.print(this.getVector()[i]+ " ");
    System.out.println();
    System.out.println();
  }

  // Methods

	// Getters
  public int getSize() {
    return size;
  }
	public double[] getVector() {
		return vector;
	}

	// Setters
  public int setSize(int _size) {
    return this.size = _size;
  }
	public void setVector(double[] _vector) {
		this.vector = _vector;
	}


  // Pure methods

  // Adding element-wise two vectors
  public vector add(vector _vector){
    int size = _vector.getSize();
    vector result = new vector(size, 0);
    double [] C = new double[size];
    for (int i = 0; i < size; ++i)
      C[i] = this.vector[i] + _vector.vector[i];
    result.setVector(C);
    return result;
  }

  // Substracting element-wise two vectors
  public vector sub(vector _vector){
    int size = _vector.getSize();
    vector result = new vector(size, 0);
    double [] C = new double[size];
    for (int i = 0; i < size; ++i)
      C[i] = this.vector[i] - _vector.vector[i];
    result.setVector(C);
    return result;
  }

  // Scalar product of a scalar and a vector
  public vector scalarProduct (double scalar){
    int size = this.getSize();
    vector result = new vector(size, 0);
    double [] C = new double[size];
    for (int i = 0; i < size; ++i)
      C[i] = scalar * this.vector[i];
    result.setVector(C);
    return result;
  }

  // Dot product of two vectors
  public double dotProduct(vector _vector){
    int size = _vector.getSize();
    double result = 0.0;
    for (int i = 0; i < size; ++i)
      result += this.vector[i] * _vector.vector[i];
    return result;
  }
}
