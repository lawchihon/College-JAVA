import java.lang.Math.*;

public class Triangle extends GeometricObject{
	double side1;
	double side2;
	double side3;
	
	public Triangle(){
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	public Triangle(int side1, int side2, int side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public void setSide1(int side1){
		this.side1 = side1;
	}
	
	public void setSide2(int side2){
		this.side2 = side2;
	}
	
	public void setSide3(int side3){
		this.side3 = side3;
	}
	
	public double getArea(){
		double area;
		double s;
		s = (side1 + side2 + side3) / 2;
		area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		return area;
	}
	
	public double getPerimeter(){
		double perimeter;
		perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	public String toString(){
		return "Triangle: side1 = " + side1 + " side2 = " + side2 +
				" side3 = " + side3;
	}
}
