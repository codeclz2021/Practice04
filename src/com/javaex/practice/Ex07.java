package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		int[] wonArray = new int[10];
		wonArray[0] = 50000;
		wonArray[1] = 10000;
		wonArray[2] = 5000;
		wonArray[3] = 1000;
		wonArray[4] = 500;
		wonArray[5] = 100;
		wonArray[6] = 50;
		wonArray[7] = 10;
		wonArray[8] = 5;
		wonArray[9] = 1;

		Scanner sc = new Scanner(System.in);
		System.out.print("금액: ");
		int money = sc.nextInt();

		for (int i = 0; i < wonArray.length; i++) {
			int won = wonArray[i];
			int count = money / won;
			money = money - (count * won);
			System.out.println(won + "원:" + count + "개");
		}
		sc.close();
	}

}
