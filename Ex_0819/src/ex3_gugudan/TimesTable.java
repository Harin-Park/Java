package ex3_gugudan;

public class TimesTable {
	
	public void showTable(int n) {
		for(int i = 1; i < 10; i ++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}

}
