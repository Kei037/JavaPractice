package ch_07;

import java.util.Arrays;

public class ExArray5 {

	public static void main(String[] args) {
		// 배열의 요소 출력하기
		int[] c = new int[10];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = i;
		}
		// for문을 이용한 출력
		System.out.println(c.length);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		
		// foreach문을 이용한 출력
		System.out.println();
		for (int d: c) {  // 배열의 요소 : 배열
			// 반복시에 변수 d에 순서대로 요소가 들어감. 자바스크립트의 for of문과 유사
			System.out.print(d);
		}
		
		// Arrays.toString 메서드 사용. 물자열로 출력
		System.out.println();
		System.out.println(Arrays.toString(c));
	}

}
