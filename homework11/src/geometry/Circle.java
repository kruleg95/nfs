package geometry;

public class Circle extends Shape{
	Circle(int length){
		name = "Circle";
		setArcLength(length);
		setAreaCircle(length);
		//area=getAreaCircle();
		//perimeter=getArcLength();
	}
	
	void setAreaCircle(int length){
		area=Math.PI*length*length;
		
	}
	void setArcLength(int length){
		perimeter=2*Math.PI*length;
	}
	public String toString() {
		return "name=" + name + ", color=" + color + ", area=" + area + ", perimeter=" + perimeter;
	}
	
	double getAreaCircle(){
		return area;
	}
	double getArcLength(){
		return perimeter;
	}


}
