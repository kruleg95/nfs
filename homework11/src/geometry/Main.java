package geometry;

import java.util.Scanner;
import geometry.Triangle;
import geometry.Circle;
import geometry.Square;
import geometry.Color;

public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(1, 1, 1);
		Circle circle = new Circle(1);
		Square square = new Square(1);
		Color color = new Color();
		Scanner sc = new Scanner(System.in);

		int input;

		int length;
		Shape[] shapes = new Shape[10];
		for (int i = 0; i < shapes.length; i++) {
			System.out.println("Input 1 to choose a circle, 2-square,3-triangle");
			input = sc.nextInt();
			
				switch (input) {
				case 1:
					System.out.println("You`ve chosen a circle, input radius");

					length = sc.nextInt();
					new Circle(length);
					
					if (circle.getAreaCircle() > 50) {
						circle.color = "red";
					} else {
						color.setColor();
						circle.color = color.getColor();
					}
					circle.toString();
					circle.getInfo();
					shapes[i] = circle;
					break;
				case 2:
					System.out.println("You`ve chosen a square, input side");

					length = sc.nextInt();
					circle.checkInput(length);

					new Square(length);
					if (square.getSquareArea() > 50) {
						square.color = "red";
					} else {
						new Color();
						square.color = color.getColor();
					}
					square.toString();
					shapes[i] = square;
					break;
				case 3:
					System.out.println("You`ve chosen a triangle");
					int length1;
					int length2;
					int length3;
					

					System.out.println("Please, input the first side");
					length1 = sc.nextInt();
					circle.checkInput(length1);

					System.out.println("Please, input the second side");
					length2 = sc.nextInt();
					circle.checkInput(length2);

					System.out.println("Please, input the third side");
					length3 = sc.nextInt();
					circle.checkInput(length3);

					if ((length1 + length2 > length3) && (length2 + length3 > length1)
							&& (length1 + length3 > length2)) {
						
					} else {
						System.out.println("This is not a triangle!");

					}

					new Triangle(length1, length2, length3);

					if (square.getSquareArea() > 50) {
						triangle.color = "red";
					} else {
						new Color();
						triangle.color = color.getColor();
					}
					triangle.toString();
					triangle.getInfo();
					
					shapes[i] = triangle;
					break;
				case 0:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong input");
					break;

				}

		}
		sc.close();
	}

}
