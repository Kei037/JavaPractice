package ch_01;

public class CharPractice2 {

	public static void main(String[] args) {
		
		char code = 65;    // 또는 int code = 0x0041;
		int ch = (int)code;
		
		System.out.println(ch);
		System.out.println(code);
		
		code = 68;  // 아스키코드 D로 변경
		System.out.println(code);

	}

}
