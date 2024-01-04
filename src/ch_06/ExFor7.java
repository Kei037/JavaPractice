package ch_06;

public class ExFor7 {

	public static void main(String[] args) {
		/*
		     *
		    ***
		   *****
		  *******
		 */
		
		for (int i = 1; i <= 7; i += 2) {
			for (int j = 6; j >= i; j -= 2) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
