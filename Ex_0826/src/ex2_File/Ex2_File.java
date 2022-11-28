package ex2_File;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		String path = "D:\\WEBReview_HR\\java\\memo";
		File f = new File(path);
		
		if(!f.isFile()) {
			//폴더 안에 있는 하위 요소들의 이름을 모두 가져온다
			String [] names = f.list();
			//f경로의 하위 요소들을 names 배열에 저장
			//폴더 안에 있는 하위 요소들의 개수에 맞춰 알아서 방의 개수를 만들어 줍니다
			//알파벳 순서에 따라 정렬을 해줍니다
			
			for(String s : names) {
				System.out.println(s);
			}
		}
	}
}
