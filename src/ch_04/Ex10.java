package ch_04;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		/* 월을 입력하면 계절을 출력하는 코드를 완성하세요
		 * 1, 2 : 겨울
		 * 3, 4, 5 : 봄
		 * 6, 7, 8 : 여름
		 * 9, 10, 11 : 가을
		 * 12 : 겨울
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력해 주세요 : ");
		int month = scanner.nextInt();
		
		if (month >= 3 && month <= 5) {
			System.out.println("봄 입니다.");
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름 입니다.");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을 입니다.");
		}else if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울 입니다.");
		}else {
			System.out.println("잘못된 입력 값입니다.");
		}
		
		// or
		
		if (month < 1 || month > 12) {
			System.out.println("잘못된 입력 값입니다.");
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름 입니다.");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을 입니다.");
		}else if (month == 1 || month == 2 || month == 12) {
			System.out.println("겨울 입니다.");
		}else {
			System.out.println("잘못된 입력 값입니다.");
		}
		
		scanner.close();
	}

}
