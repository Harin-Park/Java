package ex2_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		//test.txt파일에 아무 내용이나 적고 저장.(한글, 영어, 소문자, 대문자 섞어서 작성)
		
		//test.txt의 내용을 읽어서
		//내용에 대문자와 소문자의 개수를 출력하세요
		
		//출력결과
		//대문자 : 7
		//소문자 : 22
		
		int upper = 0;
		int lower = 0;
		
		try {
			FileReader fr = new FileReader("D:/WEBReview_HR/java/memo/test.txt");
			int code = 0;
			while((code = fr.read()) != -1) {
				if(code >= 65 && code <= 96) {
					upper++;
				}
				if(code >= 'a' && code <= 'z') {
					lower++;
				}
			}
			System.out.printf("대문자 : % d\n", upper);
			System.out.printf("소문자 : % d\n", lower);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
