//������Ű��ϰ� 20133108 ������
package �ǽ�����;

public class PrimeNumber03 implements Runnable{
	private int end;
	public PrimeNumber03(int end) {		// Ƚ�� ������ ���� end �ʱ�ȭ
		this.end=end;
	}
	
	public void run() {
		int count;
		System.out.println(Thread.currentThread().getName()); //�޼ҵ� �̸� ���
		for (int i=2;i<end;i++) {
			count = 0;	// �Ҽ��� for�������� �ߺ����� �ʰ� �̾Ƴ����� count�� ������.
			for(int j=2; j<i; j++) {
				if(i%j == 0)	// �ڱ� �ڽź��� ���� ���� ������ �������� ���� ��� �Ҽ��� �ƴϴ�.
					count+=1;
			}
			if (count == 0)
					System.out.print(i+"  ");
			}
	}
}

