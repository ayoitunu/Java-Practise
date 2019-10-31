/**
 * 
 */
package chapter8.exercise8_4;

/**
 * @author USER
 *
 */
public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		//System.out.println(length);
		return length;
	}

	public void setLength(double length) {
		if(length > 0.0 && length < 20.0) {
			this.length = length;
		}else
		{
			System.out.println("Please input a number in the range 1 to 20");
		}
	}

	public double getWidth() {
		//System.out.println(width);
		return width;
	}

	public void setWidth(double width) {
		if(width > 0.0 && width < 20.0) {
			this.width = width;
		}else
		{
			
			System.out.println("Please input a number in the range 1 to 20");
		}
	}
	
	public double calArea() {
		double area = getLength() * getWidth();
		return area;
	}
	public double calPerimeter() {
		double perimeter = 2.0 * (getLength() + getWidth());
		return perimeter;
	}

}
