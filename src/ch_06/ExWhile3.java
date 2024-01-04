package ch_06;

import java.util.Scanner;

public class ExWhile3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer = "Y";
		int count = 0;
		
		while (answer.equals("Y") || answer.equals("y")) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = scanner.nextLine();
			
			if (answer.equals("Y") || answer.equals("y")) {
				count++;
				System.out.println("음악을 " + count + "번 재생했습니다.");
			}
			
		}
		System.out.println("재생종료");
		scanner.close();
		
	}

}
