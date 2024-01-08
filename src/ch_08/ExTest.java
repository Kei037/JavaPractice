package ch_08;

import java.util.Random;
import java.util.Scanner;

public class ExTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		int answer = random.nextInt(1000) + 1;
		int count = 0;
		
		while (true) {
			System.out.print("정답을 추측하여 보시오: ");
			int result = scanner.nextInt();
			
			if (result < answer) {
				System.out.println("제시한 정수가 낮습니다.\n");
				count++;
				continue;
			}else if (result > answer) {
				System.out.println("제시한 정수가 높습니다.\n");
				count++;
				continue;
			}else {
				System.out.println("정답입니다. 축하합니다. 시도횟수는 " + count + "회 입니다.");
				break;
			}
		}
		
		scanner.close();
	}

}
