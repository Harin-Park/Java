package homework;

public class CalPlus extends Calculator{
	
	//오버라이드 : 함수의 이름과 파라미터는 똑같이 받되 중괄호 안의 내용만 현재 자식클래스에 맞게 재정의하는 것
	//오버로드 vs 오버라이드
	//오버로드 : 이름 똑같이 가져다 씀(파라미터 개수나 타입이 달라야 됨)
	//오버라이드 : 이름과 파라미터 똑같이 가져다 씀(내용만 다름)
	
	@Override
	public int getResult(int n1, int n2) {
		return n1+n2;
	}
}
