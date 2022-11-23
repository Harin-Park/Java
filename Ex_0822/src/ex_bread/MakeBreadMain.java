package ex_bread;

public class MakeBreadMain {
	public static void main(String[] args) {
		MakeBread mb = new MakeBread();
		
		mb.makeBread();
		mb.makeBread(5);
		mb.makeBread("크림", 3);
	}
}
