package ch_02;

public class Ex_01 {

	public static void main(String[] args) {
		
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		
		int t = (int)var1;
		
		double test = (double)var2;
		int testA = (int)test;
		
		double test2 = (double)var3;
		int testB = (int)test2;
		
		double test3 = Double.parseDouble(var4);
		int testC = (int)test3;
		
		double a =  t + testA + testB + testC;
		int D = (int)a;
		
		int result = D;
		System.out.println(result);

	}

}
