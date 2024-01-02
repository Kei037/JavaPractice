package ch_04;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/* 사용자에게 성적을 입력받아 
		 * if문을 이용해서 학점을 출력하는 코드를 완성하세요
		 * 입력은 0 ~ 100까지 입력이 됩니다.
		 * 기준은 아래와 같습니다.
		 * A : 90 ~ 100
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : 0 ~ 59
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("성적을 입력해 주세요 : ");
		int grade = scanner.nextInt();
		
		if (grade >= 90 ) {
			System.out.println("성적은 A 입니다.");
		}else if (grade >= 80) {
			System.out.println("성적은 B 입니다.");
		}else if (grade >= 70) {
			System.out.println("성적은 C 입니다.");
		}else if (grade >= 60) {
			System.out.println("성적은 D 입니다.");
		}else {
			System.out.println("성적은 F 입니다.");
		}
		
		scanner.close();
	}

}
