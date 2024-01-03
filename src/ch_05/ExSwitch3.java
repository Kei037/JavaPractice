package ch_05;

import java.util.Scanner;

public class ExSwitch3 {

	public static void main(String[] args) {
		boolean isFlag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 >>> ");
		int month = scanner.nextInt();
		int day;
		
		switch (month) {
			case 1, 3, 5, 7, 8, 10, 12:
				day = 31;
				break;
			case 4, 6, 9, 11:
				day = 31;
				break;
			case 2:
				day = 28;
				break;
			default:
				isFlag = false;
				day = 0;
				System.out.println("존재하지 않는 달 입니다.");
		}
		if (isFlag) {
			System.out.println(month + "월은 " + day + "까지 있습니다.");
		}
		
		scanner.close();

	}

}
