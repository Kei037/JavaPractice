package ch_07;

public class ExArray6 {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		int sum2 = 0;
		int sum3 =0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		for (int a : arr) {
			sum2 += a;
		}
		
		for (int i = arr.length -1; i >= 0; i--) {
			sum3 += arr[i];
		}
		
		System.out.println("sum = " + sum);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
