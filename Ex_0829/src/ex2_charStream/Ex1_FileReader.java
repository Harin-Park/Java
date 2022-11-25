package ex2_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {
		//char기반 스트림은 Reader, Writer의 자식클래스들을 사용
		//기본적으로 2byte를 지원하기 때문에 2byte언어로 구성된 파일도 쉽게 입출력이 가능
		
		try {
			FileReader fr = new FileReader("D:/WEBReview_HR/java/memo/test.txt");
			int code = 0;
			
			while((code = fr.read()) != -1) {
				System.out.print((char)code);
				//System.out.println(code + " ");
			}
			
			fr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
