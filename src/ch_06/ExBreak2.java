package ch_06;

import java.util.Scanner;

public class ExBreak2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month;
		
		while (true) {
			System.out.println("올바른 월을 입력하세요 [1-12]");
			month = scanner.nextInt();
			
			if (month >= 1 && month <= 12) {
				break;
			}
			
		}
		
		System.out.println("사용자가 입력한 월은 " + month + "입니다.");
		scanner.close();
		
	}

}
