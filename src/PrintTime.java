//������Ű��ϰ� 20133108 ������
package �ǽ�����;
import java.util.Date;

public class PrintTime implements Runnable{
	private int end;
	
	public PrintTime(int end) {		// Ƚ�� ������ ���� end �ʱ�ȭ
		this.end=end;
	}
	public synchronized void run() {
		Date now = new Date();		// ���� �ð��� �˱����� Date �Լ� ���
		for(int i=1;i<=this.end;i++) { //currentTheread�� ��ü �������� ���� ������ ���¿��� getPriority�� ����, getName���� �̸��� �̴´�.
			System.out.println("����: "+Thread.currentThread().getPriority()+" "+now+" "+Thread.currentThread().getName());
		}
	}

}
