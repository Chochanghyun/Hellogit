// 정보통신공학과 20133108 박종건
package 실습문제;

import java.util.Scanner;

public class Ex1 {

   public static void main(String[] args) {
      int x = 0, y =0 , z = 0 ;
      Scanner input = new Scanner(System.in);
      System.out.println("정수 두 개 입력: ");
      
      try{         // 표준입력으로 두 개의 정수를 입력 받아 곱셈 연산 결과를 출력
         x = input.nextInt();
         y = input.nextInt();
         z = x * y;
         System.out.printf("%d * %d = %d \n", x, y, z);
      } catch (Exception e) { //표준입력에서 정수가 아닌 값이 입력되면 예외 발생하여 실행 중단되는 것을 예외처리하여 출력
         System.out.println("예외 발생: " + e);
      }   
   }
}