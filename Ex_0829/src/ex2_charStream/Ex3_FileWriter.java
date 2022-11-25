package ex2_charStream;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:/WEBReview_HR/java/memo/fileWriter예제.txt");
			
			fw.write("첫번째 줄 작성합니다. abc");
			fw.write("\n");
			fw.write("두번째 줄도 문제 없다. def");
			fw.write("\n");
			
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
