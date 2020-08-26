package com.revature.tier1;


public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		int numOfDigit = 0;
		int sum = 0;
		//int num = 1635;
		Long tempNum = num;
		//System.out.println("num = " + num);
		
		while (tempNum != 0 ) {
			tempNum /= 10;
			++numOfDigit;
			
		}
		//System.out.println("num = " + num + " has total digit " + numOfDigit);
		
		String strNum = Long.toString(num);
		
		//System.out.println(" str num " + strNum);
		
		String strNumArr[] = strNum.split("\\B");

		int intNumArray[] = new int[strNumArr.length];
		int powerOfNum = 0;
	
		for (int i = 0; i < strNumArr.length; i++) {

			intNumArray[i] = Integer.parseInt(strNumArr[i]);

			//System.out.println(intNumArray[i]);
			
			int temp = intNumArray[i];
			//System.out.println("temp " + temp);
			powerOfNum = (int)Math.pow(temp , numOfDigit);
			
			//System.out.println("power " + powerOfNum);
			
			sum += powerOfNum ;
		}
		
		//System.out.println("sum " + sum);
	
		if(num == sum) {
			return true;
		}
		
		return false;
	}
	

}
