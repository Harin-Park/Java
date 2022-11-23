package ex2_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		//다차원 배열 : 1차원 배열이 두 개 모여있으면 2차원 배열
		//1차원 배열이 3개 모여있으면 3차원 배열
		
		int arr[][] = new int[2][3];
		arr[0][0] = 100;
		arr[0][1] = 200;
		arr[0][2] = 300;
		
		arr[1][0] = 400;
		arr[1][1] = 500;
		arr[1][2] = 600;
		
		System.out.println(arr[0][0]);
		
		//1차원 배열을 출력할 때는 단일 for문을 사용
		//N차원 배열을 출력할 때는 N중 for문을 사용
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {//그 해당 집의 방의 개수
				System.out.println(arr[i][j]);
			}
		}
		
		System.out.println("-----------------------------------");
		int num[][] = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		
		System.out.println("-----------------------------------");
		String [][] java = {{"영희","java:100","android:90"},
							{"철수","java:80","android:75","jsp:98"}};
		for(int i = 0; i < java.length; i ++) {
			for(int j = 0; j < java[i].length; j++) {
				System.out.println(java[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		
		//아래 이차원 배열의 요소의 총합
		int num2[][]= {{1,2,3},
						{4,5},
						{6,7,8,9},
						{10,11,12},
						{13,14},
						{15}
						};
		
		int total = 0;
		for(int i = 0; i < num2.length; i++) {
			for(int j = 0; j < num2[i].length; j++) {
				total += num2[i][j];
			}
			System.out.println(total);
		}
		
		}
	}
