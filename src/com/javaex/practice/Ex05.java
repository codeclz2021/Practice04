package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] dataArray = new int[5];
		int num;
		double sum = 0;

		// 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드
		for (int i = 0; i < dataArray.length; i++) {
			num = sc.nextInt();
			dataArray[i] = num;
		}

		// 배열에 저장된 정수 값 더하기
		for (int i = 0; i < dataArray.length; i++) {
			sum = sum + dataArray[i];
		}

		// 평균값 출력
		System.out.println("평균은 " + sum / dataArray.length + " 입니다.");

		sc.close();
	}

}
