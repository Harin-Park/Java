package ex_bread;

public class MakeBread {
	//makeBread() 메서드를 작성 오버로드를 이용해서 세 개를 작성할 예정
	//빵을 만들었습니다. <---------------method1을 호출해서 나온 결과
	//-------------
	//빵을 만들었습니다. <---------------method2을 호출해서 나온 결과
	//빵을 만들었습니다.
	//요청하신 n개의 빵을 만들었습니다.
	//-------------
	//oo빵을 만들었습니다. <---------------method3을 호출해서 나온 결과
	//oo빵을 만들었습니다.
	//요청하신 n개의 빵을 만들었습니다.
	
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
		System.out.println("-------------------");
	}
	
	public void makeBread(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("빵을 만들었습니다.");
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.\n",n);
		System.out.println("-------------------");
	}
	
	public void makeBread(String n, int a) {
		for(int i = 0; i < a; i++) {
			System.out.printf("%s빵을 만들었습니다.\n",n);
		}
		System.out.printf("요청하신 %d개의 빵을 만들었습니다.",a);
	}
}
