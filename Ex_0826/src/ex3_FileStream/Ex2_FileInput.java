package ex3_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex2_FileInput {
	public static void main(String[] args) {
		String path = "D:/WEBReview_HR/java/memo/test.txt";
		
		File f = new File(path);
		
		//배열은 int범위까지 만들 수 있다
		byte [] read1 = new byte[(int)f.length()];
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				//현재 byte[]인 read에는 test.txt에서 읽어온 데이터들이 저장되어있다

				fis.read(read1);
				//이를 문자열 형태로 재조합하여 출력할 수 있다
				String res = new String(read1);
				
				System.out.println(res);
				
				fis.close(); //스트림을 사용한 뒤에는 반드시 닫아주자
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
