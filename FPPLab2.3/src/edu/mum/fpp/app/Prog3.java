package edu.mum.fpp.app;

public class Prog3 {

	public static void main(String[] args) {
		
		float f1 = 1.27f; 
		float f2 = 3.881f;
		float f3 = 9.6f;
		
		System.out.println(computeSumToInt(f1, f2, f3));
		
		System.out.println(computeSumWithRound(f1, f2, f3));
		
	}
	
	public static int computeSumToInt(float f1, float f2, float f3) {
		
		int result = (int) (f1 + f2 + f3);
		
		return result;
	}
	
	public static int computeSumWithRound(float f1, float f2, float f3) {
		
		float sum = f1 + f2 + f3;
		
		int result = Math.round(sum);
		
		return result;
	}

}	

