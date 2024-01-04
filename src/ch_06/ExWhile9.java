package ch_06;

import java.util.Random;
import java.util.Scanner;

public class ExWhile9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int result;
		int answer = random.nextInt(6) + 1;
		boolean isFlag = true;
		/*
		while (true) {
			System.out.println("주사위 값은 얼마일까요? >> ");
			result = scanner.nextInt();
			
			if (result == answer) {
				System.out.println(result + "! 정답입니다!");
				break;
			}
			
			System.out.println("오답입니다. 다시 시도하세요.\n");
		}
		*/
		
		while (isFlag) {
			System.out.println("주사위 값은 얼마일까요? >> ");
			result = scanner.nextInt();
			
			if (result == answer) {
				System.out.println(result + "! 정답입니다!");
				isFlag = false;
			}else {
				System.out.println("오답입니다. 다시 시도하세요.\n");
			}
			
		}
		
		scanner.close();
	}

}
