package ch_02;

public class Ex_01 {

	public static void main(String[] args) {
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int a = (int)var3 + (int)var2;
		int b = (int)(var2 + var3);
		
		System.out.println(a);
		System.out.println(b);
		
		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);

	}

}
