// ������Ű��а� 20133108 ������
package �ǽ�����;
import java.util.*;
public class Calender_Day {
	public static void main(String[] args) {
		int year = 2012;
		int month = 6; 
		int date = 17; 
		
		Calendar cd =new GregorianCalendar(year,month-1,date); // Month���� 0���� �����Ƿ� 1�� ���ش�
		int cd1=cd.get(Calendar.DAY_OF_WEEK_IN_MONTH);// �� �޿��� ������ Ƚ�� ��ȯ
	    int cd2=cd.get(Calendar.WEEK_OF_MONTH); // ���� ���� ��° ��
	    int cd3=cd.get(Calendar.DAY_OF_YEAR); // �� ���� ��¥�� ��ȯ
	    int cd4=cd.get(Calendar.WEEK_OF_YEAR);// �� ���� �� Ƚ���� ��ȯ
	    int cd5=cd.get(Calendar.DAY_OF_WEEK); // �� ��¥�� ���� ��ȯ
		String[] day_of_week = {"��", "��", "ȭ", "��", "��", "��", "��"}; // ������ ���ڷ� ��ȯ���� �̿��� �迭 ����

		System.out.println("������ " + cd.get(Calendar.YEAR)+"�� "+ cd.get(Calendar.MONTH)+"�� "+ cd.get(Calendar.DATE)+"�� �Դϴ�.");
		System.out.println("�� ���� " + cd1 + "��° " + day_of_week[cd5-1] + "���� �Դϴ�.");
		System.out.println("�� ���� " + cd1 + "��° " + cd2 + "�� �Դϴ�.");
		System.out.println("�� ���� " + cd3 + "���Դϴ�.");
		System.out.println("�� ���� " + cd4 + "��° " + "�� �Դϴ�.");
		}
}