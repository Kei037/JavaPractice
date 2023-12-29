package ch_03;

public class Ex_03 {

	public static void main(String[] args) {
		
		/* 증감연산자
		 * 단독으로 사용하지 않는 경우에는 전위, 후위에 따라 결과 값이 다름
		 */
		
		int i = 5, j = 5;
		System.out.println(i++);  // 5 출력 후 증가
		System.out.println(++j);  // 6 증가 후 출력
		
		System.out.println("i = " + i + ", j = " + j);
		
	}

}
