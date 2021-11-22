package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {

		double[] dArray = new double[3];
		
		dArray[0] = 1.2;
		dArray[1] = 3.3;
		dArray[2] = 6.7;
		
		
		//배열의 끝부터 처음으로 이동하여 출력한다.
		for(int i=dArray.length-1; i>=0; i--) {
			System.out.println(dArray[i]);
		}
				
	}

}


