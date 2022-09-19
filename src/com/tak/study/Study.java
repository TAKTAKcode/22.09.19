package com.tak.study;

import java.util.Scanner;

public class Study {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 *를 표시할까요? : ");

        int num = sc.nextInt();

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                System.out.print('*');              // 입력한 수 만큼 *을 찍는다
                if( i % 5 == 4 ) {                  // i를 5로 나눈 나머지가 4이면 줄 바꿈한다
                    System.out.println();
                }
            }
        }
        if (num % 5 !=0) {                          // num이 5의 배수이면 출력한 * 뒤에 줄바꿈한다
            System.out.println();
        }
    }
}
