package ex3_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1_FileInput {
	public static void main(String[] args) {
		//Stream에 대한 특징
		//...Stream : byte기반 스트림 -> 얘가 좀 더 많이 쓰임
		//...Reader, ...Writer : char기반의 스트림
		
		String path = "D:/WEBReview_HR/java/memo/test.txt";
		
		File f = new File(path);
		
		if(f.exists()) {
			//파일클래스가 가진 경로로 접근하기 위한 입력 스트림 생성
			try {
				FileInputStream fis = new FileInputStream(f);
				int code = 0;
				//-1은 EndOfFile(EOF)
				while((code = fis.read()) != -1) {
					System.out.print((char)code);
				}
				fis.close(); //스트림은 사용이 완료된 이후 close를 통해 닫아줘야 한다
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
