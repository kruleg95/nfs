package geometry;

public abstract class Shape {
	@Override
	public String toString() {
		return "Shape [name=" + name + ", color=" + color + ", area=" + area + ", perimeter=" + perimeter + "]";
	}
	void getInfo(){
		System.out.println("[name=" + name + ", color=" + color + ", area=" + area + ", perimeter=" + perimeter + "]");
	}
	String name;
	String color="white";
	double area;
	double perimeter;
	

	void checkInput(int length){
		if(length<0 || length==0){
			System.out.println("Wrong input!");
		}
	
}
}
