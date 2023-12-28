package ch_02;

public class Ex_02 {

	public static void main(String[] args) {
		
		/* 상수 : 프로그램 실행 중에 변경할 수 없는 고정된 값. 변수와는 다르게 대문자로 선언
		 * 형식 : final 데이터 타입 상수명 = 값;
		 */
		
		int a = 3;
		System.out.println(a);
		a = 4;
		System.out.println(a);
		
		final double PI = 3.14;
		// PI = 3.15; // 에러발생
		System.out.println(PI);  // 이 문장만 봐도 PI가 상수인걸 할 수 있도록 대문자로 작성

	}

}
