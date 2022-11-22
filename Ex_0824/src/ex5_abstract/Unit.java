package ex5_abstract;

abstract public class Unit {
	String name; //이름
	int energy; //체력
	
	//유닛이 공격 당했을 때 체력 감소량을 관리하기 위한 메서드
	//유닛마다 체력 감소량이 다르기 때문에 추상메서드를 만든다
	abstract public void decEnergy();
	
	public int getEnergy() {
		return energy;
	}
}
