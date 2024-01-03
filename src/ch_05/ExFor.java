package ch_05;

public class ExFor {

	public static void main(String[] args) {
		
		int sum = 0;  // 총 합을 담을 변수 초기화 꼭 필요
		// for (초기값; 조건식; 증감식)
		for (int i = 1; i < 10; i++) {
			System.out.println("i = " + i + " sum = " + (sum += i));
		}
		
		/*  1) 초기값 실행
		 *  2) 조건식 확인
		 *  3) 조건식이 참이면 명령문 실행
		 *  4) 증감식 실행
		 *  5) 조건식 확인
		 *  6) 조건식이 참이면 명령문 실행
		 *  4) 5) 6) 반복
		 */

	}

}