package homework;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();
		int result = cp.getResult(10, 20);
		System.out.println("CalPlus : " + result);
		
		CalMinus cm = new CalMinus();
		int result2 = cm.getResult(30, 15);
		System.out.println("CalMinus : " + result2);
	}
}
