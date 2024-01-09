package ch_09;

import java.util.Scanner;

public class ExMethod {

	public static void main(String[] args) {
		// 3명의 신장, 체중, 나이의 최대값을 구해서 표시
		Scanner sc = new Scanner(System.in);
		
		int[] height = new int[3];
		int[] weight = new int[3];
		int[] age = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("[" + (i + 1) + "] ");
			System.out.println("신장:");
			height[i] = sc.nextInt();
			
		}
		
	}

}