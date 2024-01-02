package ch_04;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* 사용자에게 입력받은 
		 * 정수가 양수인지, 0인지, 음수인지 알려주는 코드를 완성하세요.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요 : ");
		int inputInt = scanner.nextInt();
		
		if (inputInt > 0 ) {
			System.out.println(inputInt + "은(는) 양수입니다.");
		}else if (inputInt == 0) {
			System.out.println(inputInt + "은(는) 0입니다.");
		}else {
			System.out.println(inputInt + "은(는) 음수입니다.");
		}
		
		scanner.close();
	}

}
