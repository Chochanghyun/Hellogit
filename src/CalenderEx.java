// ������Ű��а� 20133108 ������
package �ǽ�����;
import java.util.*; // Calendar GregorianCalendar, Scanner�� ��ƿ��Ƽ ����� ����  import

public class CalenderEx {
	int yearday;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // ��,��,���� �Է¹޴� �Լ�
		System.out.println("������ �˰� ���� ��¥�� ��,��,���� �Է��Ͻÿ� ");
		System.out.println("--------------------------------");
		System.out.print("��(YEAR): ");
		int year = sc.nextInt();
		System.out.print("��(MONTH): ");
		int month = sc.nextInt();
		System.out.print("��(DAY): ");
		int day = sc.nextInt();
		Calendar ca = new GregorianCalendar(year,month-1,day); // �׷��������� �Է¹��� ��,��,�� ��ü ����
		// Ķ������ ��¥������ �Է� ���� �� �����Ƿ� ����Ŭ������ �׷����� Ķ���� ��ü ������ ���� ��¥ ������ �ް�
		// ���� �޼ҵ��� Calendr.DAY_OF_WEEK���� ������ �̾Ƴ������� Calendar������ ��ĳ����
															   
		switch(ca.get(Calendar.DAY_OF_WEEK)) { // �Ͽ����� ��� 1�� ��µǹǷ� ���ǿ� �´� ���� ����� ���� Switch�� ���
		case 1:
			System.out.println("�Է��� ��¥�� ������ �Ͽ����Դϴ�. ");
			break;
		case 2:
			System.out.println("�Է��� ��¥�� ������ �������Դϴ�. ");
			break;
		case 3:
			System.out.println("�Է��� ��¥�� ������ ȭ�����Դϴ�. ");
			break;
		case 4:
			System.out.println("�Է��� ��¥�� ������ �������Դϴ�. ");
			break;
		case 5:
			System.out.println("�Է��� ��¥�� ������ ������Դϴ�. ");
			break;
		case 6:
			System.out.println("�Է��� ��¥�� ������ �ݿ����Դϴ�. ");
			break;
		case 7:
			System.out.println("�Է��� ��¥�� ������ ������Դϴ�. ");
			break;
		}
	}
}

