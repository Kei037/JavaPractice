package ch_01;

public class CharPractice4 {

	public static void main(String[] args) {
		/* 자동 형변환은 프로그램 작성자가 별도의 작업을 하지 않아도
		 * 자바가 알아서 알맞은 타입으로 변환.
		 * 작은범위에서 큰 범위로 변경되는 경우 -> 값 손실이 없음. */
		
		byte a = 127; // byte가 가질 수 있는 최대값
		int b = a;    // 자동형변환(byte -> int)
		
		System.out.println(b);
		// a = b; float 자료형을 byte 변수에 대입하면 자동형변환이 안됨
		
		float c = b; // 자동형변환(int -> float)
		System.out.println(c);
		
		// int d = c; //float 자료형을 int변수에 대입하면 자동형변환이 안됨
	}

}
