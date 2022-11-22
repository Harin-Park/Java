package ex4_abstract;

public class ManduRamen extends Ramen{
	
	String mandu = "만두";
	
	@Override
	public void makeRamen() {
		System.out.printf("%s %s %s\n", noodle,soup,mandu);
	}
}
