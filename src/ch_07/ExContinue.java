package ch_07;

public class ExContinue {

	public static void main(String[] args) {
		/*
		 * continue 문은 현재의 반복을 뛰어넘고 다음 반복을 진행
		 * 반복문이 진행되다가 continue문을 만나면 반복문의 끝으로 가서 다음 반복을 계속 수행
		 */
		
		int total = 0;
		int num;
		
		for (num = 0; num <= 100; num++) {
			if (num % 2 == 0) {
				continue;
			}
			total += num;
		}
		
		System.out.println("1부터 100까지의 홀수의 합은 " + total + "입니다.");

	}

}
