package ex2_File;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		//IO(Input, Output) : 입출력 스트림
		//스트림 : 데이터 입출력을 위한 통로
		
		String path = "D:/WEBReview_HR/java/memo/test.txt"; //경로 이동을 할 때 \를 쓰려면 \\를 사용해야 한다
		File f = new File(path); //File클래스가 생성이 되면서 path경로까지 스트림을 생성
		
		//isFile() : 파일클래스가 접근한 최종목적지가 파일형식일 경우 true
		if(f.isFile()) { //!f.isFile
			System.out.println(f.length() + "byte"); //한글은 2byte, 영어.특수문자는 1byte
		}
	}
}
