package ex2_overload;

public class Ex1_overloadMain {
	public static void main(String[] args) {
		Ex1_overload ol = new Ex1_overload();
		
		ol.result();
		ol.result(100);
		ol.result(100,200);
		ol.result('A');
		ol.result("hello");
		ol.result("hello",100);
		ol.result(100,"hello");
	}
}
