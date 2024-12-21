public class Circle {
  private double _radius;
  private double _centerX;
  private double _centerY;

  
  public Circle(){
    this._centerY = this._centerX = 0;
    this._radius = 1;
  }

  
  public Circle(double radius, double x, double y){
    if(radius <= 0)
    	this._radius *= -1;
	 _centerX = x;
    _centerY = y;
  }
  public void setRadius(double radius) {
	  if(radius <= 0)
	    radius *= -1;
	  this._radius = radius;
  }
  public void setCenterX(double x) {
	  this._centerX = x;
  }
  public void setCenterY(double y) {
	  this._centerY = y;
  }
  public double getRadius() {
	  return this._radius;
  }
  public double getCenterX() {
	  return this._centerX;
  }
  public double getCenterY() {
	  return this._centerY;
  }
  
  public double area() {
	  return Math.PI * Math.pow(this._radius, 2);
  }
  public double perameter() {
	  return 2 * Math.PI * this._radius;
  }
  public void move(double x, double y) {
	  this._centerX = x;
	  this._centerY = y;
  }
  public boolean isIn(double x, double y) {
	  return distance(x, y) > this._radius;
  }
  public double fromOrigin() {
	  return distance(0, 0);
  }
  private double distance(double x, double y) {
	// TODO Auto-generated method stub   
	return Math.sqrt(Math.pow(this._centerX - x, 2) + Math.pow(this._centerY - y, 2));
  }
  
  	
  public String toString() {
	  return "Radius: "+this._radius+" at Point ("+this._centerX+"."+this._centerY+")";
  }
}