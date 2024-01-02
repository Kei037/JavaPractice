package ch_04;

public class Ex01 {

	public static void main(String[] args) {
		/* 비트 연산자
		 * 10진수를 2진수로 변경해서 연산하고, 그 후에 10진수로 변환
		 */
		
		int a = 15;  // 1111
		int b = 5;   // 0101
		
		System.out.println(a | b);  // 1111 -> 15
		System.out.println(a & b);  // 0101 -> 5
		System.out.println(a ^ b);  // 1010 -> 10
		
		System.out.println(a >> 2); // 1111 -> 0011 -> 3
		System.out.println(b << 4); // 0101 -> 01010000 -> 80

	}

}
