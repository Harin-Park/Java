package ex1_class;

public class ComMain {
	public static void main(String[] args) {
		//객체생성 하는 방법
		//클래스명  객체명 = new 클래스명();
		Computer com1 = new Computer(); //컴퓨터 1대 생산(객체 생성)
		com1.getInfo();
//		System.out.println("ssd : " + com1.ssd);
//		System.out.println("ram : " + com1.ram);
//		System.out.println("cpu : " + com1.cpu);
//		System.out.println("color : " + com1.color);
		
		System.out.println("---------------------------------------");
		
		Computer com2 = new Computer();
		com2.ssd = 1024;
		com2.getInfo();
	}
}
