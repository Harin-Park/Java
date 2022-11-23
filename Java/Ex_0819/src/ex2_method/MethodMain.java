package ex2_method;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest m1 = new MethodTest();
		m1.test1();
		
		m1.value(10);

		String res = m1.exam(10, 20);
		System.out.println(res);
		
		int a = 10;
		m1.value2(a);
		System.out.println("a의 값 : " + a);
	}
	
	
}
