package ch_02;

public class Ex_01 {

	public static void main(String[] args) {
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		double varCh = Double.parseDouble(var4);
		int a = (int)varCh;
		System.out.println(a);
		
		int result = (int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);

	}

}
