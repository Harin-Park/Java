package ex_pen;

public class PenMain {
	public static void main(String[] args) {
		Pen p1 = new Pen(); //1000짜리 일반 모나미펜
		Pen p2 = new Pen(10000, "gold"); //만원짜리 금으로 한정된 모나미 펜
		Pen p3 = new Pen("pink", 5000); //오원짜리 핑크색 모나미펜
	}
}
