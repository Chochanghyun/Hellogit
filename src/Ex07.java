//������Ű��ϰ� 20133108 ������
package �ǽ�����;

public class Ex07 {
	public static void main(String args[]) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "�ȳ��ϼ���!");
		th1.setPriority(Thread.MAX_PRIORITY-1); // ���� 10(MAX)-1=9
		th1.start();	// thread ����
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "�ݰ����ϴ�.");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
