package ch_03;

import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int x, y, sum;
		
		System.out.print("첫 번째 숫자를 입력하시오: \n");
		x = scanner.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오: ");
		y = scanner.nextInt();
		
		sum = x + y;
		System.out.println(sum);
		
		scanner.close();
		
	}

}
