package ex4_computer;

public class ComputerMain {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.setBrand("apple");
		com.setSsd(1024);
		
		System.out.println("λΈλλ : " + com.getBrand());
		System.out.println("ssd : " + com.getSsd());
		System.out.println("ram : " + com.ram);
	}
}
