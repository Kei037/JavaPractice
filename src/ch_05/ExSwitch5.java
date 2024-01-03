package ch_05;

import java.util.Scanner;

public class ExSwitch5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학점을 입력해 주세요 >>> ");
		int num = scanner.nextInt();
		
		switch (num / 10) {
			case 9, 10 -> System.out.println("학점은 A입니다.");
			case 8 -> System.out.println("학점은 B입니다.");
			case 7 -> System.out.println("학점은 C입니다.");
			case 6 -> System.out.println("학점은 D입니다.");
			default -> {
				System.out.println("학점은 F입니다.");
			}
		}
		
		scanner.close();

	}

}
