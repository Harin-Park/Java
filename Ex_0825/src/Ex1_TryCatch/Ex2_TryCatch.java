package Ex1_TryCatch;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		int res = 0;
		int [] arr = new int [2];
		
		try {
			res = 10/2;
			arr[2] = 10;
		}catch(Exception e) {
			System.out.println("오류가 발생했습니다.");
//		}catch(ArithmeticException e){
//			e.printStackTrace();
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("존재하지 않는 index로의 접근입니다.");
		}finally {
			//try영역에서 예외 발생여부와 관계없이 마지막에 반드시 호출되는 영역
			System.out.println(res);
		}
	}
}
