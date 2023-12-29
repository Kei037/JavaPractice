package ch_03;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		
		/* 사용자로부터 숫자를 입력받아 cm를 inch 단윌 변환하는 프로그램을 만들어보세요.
		 * 1cm는 0.393701 inch입니다
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int cm;
		double inch;
		
		System.out.print("cm를 입력하세요 : ");
		cm = scanner.nextInt();
		
		inch = (cm * 0.393701);
		
		System.out.println(cm + "cm는 " + inch + " inch 입니다.");
		
		scanner.close();
		
	}

}
