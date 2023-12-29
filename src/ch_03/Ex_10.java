package ch_03;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int age;
		
		System.out.print("나이를 입력하세요 : ");
		age = scanner.nextInt();
		
		System.out.println(age > 19 ? "성인입니다" : "청소년입니다");
		scanner.close();
		
	}

}
