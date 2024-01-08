package ch_08;

public class ExArray3 {

	public static void main(String[] args) {
		int[] number = new int[45];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = i + 1;
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		
		for (int i = 0; i < 10000; i++) {
			int n = (int)(Math.random() * 45);  // 0 ~ 9 중 한 값을 임의로 얻는다.
		//  Math.random() : 0.0 이상, 1.0 미만의 double값의 난수를 균일한 분포로 반환
			
			// swap
			int temp = number[0];
			number[0] = number[n];
			number[n] = temp;
		}
		
		System.out.print("로또번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(number[i] + " ");
		}
		
	}

}
