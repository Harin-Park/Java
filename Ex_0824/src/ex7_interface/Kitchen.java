package ex7_interface;

public class Kitchen implements Menu3 {//Menu1, Menu2
	
	@Override
	public String jajang() {
		return "중면  + 춘장 + 완두콩";
	}
	
	@Override
		public String tangsuyuck() {
			return "돼지고기 + 당근 + 소스";
		}
	
	@Override
		public String boggembab() {
			return "춘장 + 달걀 + 쌀";
		}

}
