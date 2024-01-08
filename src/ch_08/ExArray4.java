package ch_08;

import java.util.Arrays;

public class ExArray4 {

	public static void main(String[] args) {
		int[] numbers = new int[6];
		
		for (int i = 0; i < numbers.length; i++) {
			int temp = (int)(Math.random() * 45) + 1;
			
			System.out.println(Arrays.toString(numbers));
			boolean isResult = true;
			for (int j = 0; j < i; j++) {
				if (numbers[j] == temp) {
					System.out.println(temp + "은 중복된 값입니다.");
					isResult = false;
				}
			}
			
			if (!isResult) {
				continue;
			}
			
			numbers[i] = temp;
		}
		System.out.println(Arrays.toString(numbers));
	}

}
