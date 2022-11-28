package ex1_outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex1_FileOutput {
	public static void main(String[] args) {
		//FileOutputStream : 메모장에 입력을 하기 위한 출력스트림
		try {
			FileOutputStream fos = new FileOutputStream("D:/WEBReview_HR/java/memo/fileOut.txt",true);
			//FileOutputStream의 두번째 파라미터에 true를 적으면 메모장에 이어서 내용을 작성할 수 있다
//			fos.write('f');
//			fos.write('i');
//			fos.write('l');
//			fos.write('e');
//			fos.write('안'); 한글 작성 불가능
			
			String msg = "fileOutput 예제입니다.\n";
//			String msg2 = "여러줄도 가능\n";
			String msg3 = "새로고침됨\n";
			
			fos.write(msg.getBytes()); //getBytes() : 문자열을 byte[]로 변경하는 메서드
//			fos.write(msg2.getBytes());
			fos.write(msg3.getBytes());
			
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
