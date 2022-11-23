package ex3_static;

public class BankMain {
	public static void main(String[] args) {
		Bank bk1 = new Bank("부평","032-123-4567");
		Bank bk2 = new Bank("강남","02-111-1111");
		Bank bk3 = new Bank("대전","042-222-2222");
		
		bk1.printBank();
		bk2.printBank();
		bk3.printBank();
		
	}
}
