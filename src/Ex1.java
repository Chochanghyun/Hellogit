// ������Ű��а� 20133108 ������
package �ǽ�����;

import java.util.Scanner;

public class Ex1 {

   public static void main(String[] args) {
      int x = 0, y =0 , z = 0 ;
      Scanner input = new Scanner(System.in);
      System.out.println("���� �� �� �Է�: ");
      
      try{         // ǥ���Է����� �� ���� ������ �Է� �޾� ���� ���� ����� ���
         x = input.nextInt();
         y = input.nextInt();
         z = x * y;
         System.out.printf("%d * %d = %d \n", x, y, z);
      } catch (Exception e) { //ǥ���Է¿��� ������ �ƴ� ���� �ԷµǸ� ���� �߻��Ͽ� ���� �ߴܵǴ� ���� ����ó���Ͽ� ���
         System.out.println("���� �߻�: " + e);
      }   
   }
}