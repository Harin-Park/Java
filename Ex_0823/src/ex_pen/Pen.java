package ex_pen;

public class Pen {
	int price;
	String brand = "monami";
	String color;
	
	//제품1
	public Pen() {
		price = 1000;
		brand = "monami";
		color = "white";
	}
	
	//제품2
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}
	
	//일반 메서드의 오버로드와 동일(파라미터의 개수는 같지만 순서가 다른 경우)
	//생성자 오버로드
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	//메서드 vs 생성자 차이점
	//pen() vs Pen() -> 메서드는 첫글자가 소문자, 생성자는 첫글자가 대문자
	//p1.pen() vs 불가능 -> 메서드는 객체.메서드()로 호출이 가능, 생성자는 불가능
	
	//재사용성
	//메서드(가능) vs 생성자(처음 호출될 때만 사용되고 재사용 불가능)
}
