package ch_01;

public class CharPractice3 {

	public static void main(String[] args) {
		
		byte b = 10;
		int i = b;
		/*
		 자동 형변환 : 별도의 작업없이 자바가 형변환
		    -> 작은 범위에서 큰 범위로 형변환.
		 */
		System.out.println("i=" + i); // 10
		System.out.println("b=" + b); // 10

		int i2 = 10;
		byte b2 = (byte)i2;
		/*
		 명시적 형변환 : 개발자가 변수의 자료형을 강제로 바꾸는 것
		 */
		System.out.println("i2=" + i2); // 300
		System.out.println("b2=" + b2); // 44 ( 300 - 256)

	}

}
