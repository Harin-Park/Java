package ex5_abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("해병", 50, false);
		t1.decEnergy();
		System.out.println("해병의 에너지 : " + t1.getEnergy());
		
		Protoss p1 = new Protoss("거신", 250, false);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("거신의 에너지 : " + p1.getEnergy());
		
		Zerg z1 = new Zerg("무리군주", 150, true);
		z1.decEnergy();
		z1.decEnergy();
		System.out.println("무리군주의 에너지 : " + z1.getEnergy());
	}
}
