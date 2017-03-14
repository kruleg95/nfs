package geometry;

	public class Color {
		String randomColor;
		String[] colour = {"orange", "velvet", "purple", "black", "green", "brown", "white", "blue", "yellow", "pink"};
		Color(){
			setColor();
		}
		void setColor(){
			randomColor=colour[(int)Math.random()*10];
		}
		String getColor(){
			return randomColor;
		}
		

	}
