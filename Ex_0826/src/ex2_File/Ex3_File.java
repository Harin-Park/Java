package ex2_File;

import java.io.File;

public class Ex3_File {
	public static void main(String[] args) {
		String path = "D:\\WEBReview_HR\\java\\memo\\bbb";
		File f1 = new File(path);
		
		//exists() : 파일클래스가 path경로로 찾아가는 중
		//정상적으로 폴더나 파일이 존재한다면 true 반환
		
		if(!f1.exists()) {
			System.out.println("폴더생성");
			f1.mkdirs(); //폴더 생성을 해주는 메서드
		}else {
			System.out.println("이미 폴더가 있습니다");
		}
	}
}
