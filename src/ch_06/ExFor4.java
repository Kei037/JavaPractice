package ch_06;

public class ExFor4 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int x = 1; x <= 6; x++) {
					if (i + j + x== 6) {
						System.out.println("(" + i + ", " + j + ", " + x + ")");
					}
				}
			}
		}

	}

}
