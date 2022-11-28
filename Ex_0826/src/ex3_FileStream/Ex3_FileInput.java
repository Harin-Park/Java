package ex3_FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex3_FileInput {
	public static void main(String[] args) {
		//특정 경로에 file.txt라는 문서를 만들고
		//내용으로 아무 문장이나 입력해둔다
		//file.text의 내용을 FileInputStream으로 읽어온 뒤, 이 값이 회문수인지 아닌지를 판단하시오
		
		String path = "D:/WEBReview_HR/java/memo/file.txt";
		File f = new File(path);
		byte[] read = new byte[(int)f.length()];
		
		if(f.exists()) {
			try {
				FileInputStream fis = new FileInputStream(f);
				fis.read(read);
				//read배열은 String타입으로 변경
				String ori = new String(read);
				String rev = "";
				
				for(int i = ori.length()-1; i >= 0; i--) {
					rev += ori.charAt(i);
				}
			
				if(ori.equals(rev)) {
					System.out.printf("%s는 회문수입니다.", ori);
				}else {
					System.out.printf("%s는 회문수가 아닙니다.", ori);
				}
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
