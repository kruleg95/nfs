package geometry;

public class Triangle extends Shape{
	Triangle(int l1,int l2,int l3){
		name = "Triangle";
		setTriangleArea(l1, l2, l3);
		setTrianglePerimeter(l1, l2, l3);
		//area=getTriangleArea();
		//perimeter=getTrianglePerimeter();
		
		
	}
	void setTriangleArea(int l1, int l2,int l3){
		area=Math.sqrt((l1+l2+l3)/2*((l1+l2+l3)/2-l1)*((l1+l2+l3)/2-l2)*((l1+l2+l3)/2-l3));
	}
	void setTrianglePerimeter(int l1, int l2,int l3){
		perimeter=l1+l2+l3;
	}
	
	void checkInput(int l1,int l2,int l3){
		if(l1<=0||l2<=0||l3<=0){
			System.out.println("wrong input");
		}
	
	}		
	
	public String toString() {
		return "Shape [name=" + name + ", color=" + color + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	double getTrianglePerimeter(){
		return perimeter;
	}
	double getTriangleArea(){
		return area;
	}
}
