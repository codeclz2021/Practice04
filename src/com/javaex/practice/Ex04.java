package com.javaex.practice;

public class Ex04 {

	public static void main(String[] args) {

        int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

        int count = 0;
        int sum = 0;

        //배열의 처음부터 끝까지 순회
        for (int i=0 ; i<data.length; i++) {
            
            //현재 배열의 값이 3의 배수인지 검사
            if ( (data[i]%3) == 0) {
                count++;
                sum += data[i];
            }

        }
        System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
        System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
    }

}


