package ex_homework;

public class PaintGraph {

	public void print(int[] arr) {//파라미터는 기본 자료형을 포함한 클래스, 객체, 배열도 받는게 가능하다
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i +"의 개수 : ");
			
			for(int j = 0; j < arr[i]; j++) {
				System.out.print('#');
			}
			
			System.out.println(" " + arr[i]);
		}
	}
}
