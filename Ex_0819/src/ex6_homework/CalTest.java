package ex6_homework;

public class CalTest {
	
	//클래스에는 변수, 함수 두 가지가 존재한다. *둘 중에 하나는 무조건 존재 해야 한다
	//둘 다 존재하지 않으면 비어있는 a4용지 설계도와 다를바가 없다
	public void cc(int n1, int n2, String s1) {
		if(s1.equals("+")) {
			System.out.printf("%d + %d = %d", n1, n2, n1+n2);
		}else if(s1.equals("-")) {
			System.out.printf("%d - %d = %d", n1, n2, n1-n2);
		}else if(s1.equals("*")) {
			System.out.printf("%d * %d = %d", n1, n2, n1*n2);
		}else if(s1.equals("/")) {
			System.out.printf("%d / %d = %d", n1, n2, n1/n2);
		}
	}
}

//	public int getResult(int n1, int n2, String op) {
//		
//		if(op.equals("+")) {
//			return n1 + n2;
//		}else if(op.equals("-")) {
//			return n1 - n2;
//		}else if(op.equals("*")) {
//			return n1 * n2;
//		}else if(op.equals("/")) {
//			return n1 / n2;
//		}else {
//			System.out.println("연산기호가 올바르지 않습니다.");
//			return -1;
//		}
		//내가 main으로 돌려줄 값이 있다면  return을 통해서 main으로 돌아간다
		//함수 안에서 해결이 되면 return 필요 x
		//함수 안에서 해결이 안 되면 return 필요
