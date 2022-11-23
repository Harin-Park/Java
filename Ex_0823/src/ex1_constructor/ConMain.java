package ex1_constructor;

public class ConMain {
	public static void main(String[] args) {
		ConTest ct = new ConTest();
		//ct.메서드호출() -> 생성자는 .을 찍어서 호출이 불가능
		//new라고 하는 키워드는 힙이라고 하는 동네에 집을 지을 땅이 있는지 찾아보는 역할
		//실제로 집을 짓는 역할은 생성자가 합니다
		
		//최초 객체를 만들 때 한 번 호출되고 다시 사용할 수 없습니다
		
		ConTest ct2 = new ConTest("홍길동");
	}
}
