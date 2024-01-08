package ch_08;

public class ExArray2 {

	public static void main(String[] args) {
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i;
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10000; i++) {
			int n = (int)(Math.random() * 10);  // 0 ~ 9 중 한 값을 임의로 얻는다.
		//  Math.random() : 0.0 이상, 1.0 미만의 double값의 난수를 균일한 분포로 반환
			
			// swap
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
	}

}
