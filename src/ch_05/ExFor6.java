package ch_05;

import java.util.Scanner;

public class ExFor6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 양수를 입력하세요 >>> ");
		int inputInt = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= inputInt; i++) {
			sum += i;
		}
		System.out.println("1부터 " + inputInt + "사이의 모든 정수의 합계는 " + sum + "입니다.");
		
		scanner.close();
	}

}
