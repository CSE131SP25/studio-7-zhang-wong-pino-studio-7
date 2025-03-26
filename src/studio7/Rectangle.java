package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
//	public void setLength (int newLength) {
//		length = newLength;
//	}
//	
//	public void setWidth (int newWidth) {
//		width = newWidth;
//	}
	
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return 2 * (length + width);
	}
	
	public boolean isSmaller (Rectangle newRectangle) {
		if (this.area() < newRectangle.area()) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		} else {
			return false;
		}
	}

}
