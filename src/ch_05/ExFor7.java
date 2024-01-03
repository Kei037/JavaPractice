package ch_05;

import java.util.Scanner;

public class ExFor7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + "번째 정수를 입력해 주세요 >>> ");
			int inputInt = scanner.nextInt();
			sum += inputInt;
		}
		System.out.println("5개 정수의 합은 " + sum + "입니다.");
		
		scanner.close();
	}

}
