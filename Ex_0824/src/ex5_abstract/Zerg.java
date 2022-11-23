package ex5_abstract;

public class Zerg extends Unit{

	boolean fly;
	
	public Zerg(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}//생성자 오버로딩
	
	@Override
	public void decEnergy() {
		energy -= 10;
	}
}
