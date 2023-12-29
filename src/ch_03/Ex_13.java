package ch_03;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		/* 사용자로부터 두 개의 정수를 입력받아서
		 * 정수의 합, 정수의 차, 정수의 곱, 정수의 평균, 큰 수, 작은수를
		 * 계산하여 화면에 출력하는 프로그램을 작성하시오.
		 * 큰 수와 작은 수를 구할 때는 조건연산자(삼항연산자)를 사용하시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x, y;
		
		System.out.print("x를 입력하세요 : ");
		x = scanner.nextInt();
		System.out.print("y를 입력하세요 : ");
		y = scanner.nextInt();
		
		System.out.println("두 수의 합 : " + (x + y));
		System.out.println("두 수의 차 : " + (x - y));
		System.out.println("두 수의 곱 : " + (x * y));
		System.out.println("두 수의 평균 : " + ((x + y) / 2.0));
		System.out.println("큰 수 : " + (x > y ? x : y));
		System.out.println("작은 수 : " + (x < y ? x : y));
		
		scanner.close();
		
	}

}
