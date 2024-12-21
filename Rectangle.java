
public class Rectangle {
	private Point _origin;
	private int _width, _height;
	
	public Rectangle(int x, int y, int width, int height) {
		this._origin = new Point(x, y);
		this._width = width;
		this._height = height;
	}
	
	public Rectangle(Point center, int width, int height) {
		this._origin = new Point(center);
		this._width = width;
		this._height = height;
	}
	public Point getOrigin() {
		return new Point(this._origin);
	}
	public void setOrigin(Point other) {
		this._origin = new Point(other);
	}
	public int getWidth() {
		return this._width;
	}
	public void setWidth(int width) {
		this._width = width;
	}
	public int getHeight() {
		return this._height;
	}
	public void serHeight(int height) {
		this._height = height;
	}
	public void move(int x, int y) {
		this._origin.move(x, y);
	}
	public String toString() {
		return "Rectangle at: "+this._origin.toString()+" Width: "+this._width+", Height: "+this._height;
	}
}
