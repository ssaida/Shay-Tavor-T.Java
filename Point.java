
public class Point {
	private int _x, _y;

	public Point(int x, int y) {
		this._x = x;
		this._y = y;
	}
	public Point(Point other) {
		this._x = other._x;
		this._y = other._y;  
	}
	public int getX() {
		return this._x;
	}
	public int getY() {
		return this._y;
	}
	public void setX(int x) {
		this._x = x;
	}
	public void setY(int y) {
		this._y = y;
	}
	public boolean equals(Point other) {
		return this._x == other._x && this._y == other._y;
	}
	public void move(int x, int y) {
		this._x += x;
		this._y += y;
	}
	public String toString() {
		return "Point at ("+this._x+","+this._y;
	}
}
