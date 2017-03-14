package geometry;

public class Square extends Shape{
	Square(int length){
		
		name = "Square";
		setSquareArea(length);
		setSquarePerimeter(length);
		area=getSquareArea();
		perimeter=getSquarePerimeter();
		
	}
	
	void setSquarePerimeter(int length){
		perimeter=4*length;
	}
	
	void setSquareArea(int length){
		area=length*length;
	}
	
	
	public String toString() {
		return "Shape [name=" + name + ", color=" + color + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	double getSquareArea(){
		return area;
	}
	double getSquarePerimeter(){
		return perimeter;
	}

	
	

}
