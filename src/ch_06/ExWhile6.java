package ch_06;

import java.util.Random;

public class ExWhile6 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		System.out.println("(" + num1 + ", " + num2 + ")");
		
	}

}
