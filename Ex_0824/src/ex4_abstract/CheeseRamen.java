package ex4_abstract;

public class CheeseRamen extends Ramen{

	String cheese = "치즈";
	
	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n",noodle,soup,cheese);
	}
}
