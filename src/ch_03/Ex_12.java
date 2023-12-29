package ch_03;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		
		/* 사용자로부터 숫자를 입력받아 달러를 원화로 변환하는 프로그램을 만들어보세요.
		 * 1달러는 1289.50원 입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		double dr;
		double krw;
		int idr;
		
		System.out.print("달러 단위의 금액을 입력하세요 : ");
		dr = scanner.nextDouble();
		
		krw = (dr * 1289.50);
		
		if (dr % 1 == 0) {
			idr = (int) dr;
			System.out.println(idr + "달러는 " + krw + "원 입니다.");
		}else {
			System.out.println(dr + "달러는 " + krw + "원 입니다.");
		}
		
		scanner.close();
		
	}

}
