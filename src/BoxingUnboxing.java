// ������Ű��а� 20133108 ������
package �ǽ�����;
public class BoxingUnboxing {	
	public static void print(byte a, short b, int c, long d, float e, double f, char g, boolean h) {
		System.out.printf("Byte(������) : %d%n", a);		// print �޼ҵ忡 �ڵ���ڽ̵� ������ ���� ���
        System.out.printf("Short(������) : %d%n", b);
        System.out.printf("Integer(������) : %d%n",c);
        System.out.printf("Long(������) : %d%n", d);
        System.out.printf("Float(�Ǽ���) : %.1f%n", e);
        System.out.printf("Double(�Ǽ���) : %.1f%n", f);
        System.out.printf("Character(������) : %c%n", g);
        System.out.printf("Boolean(����) : %b%n", h);
        System.out.println("");
	}
	public static void main (String[] args) {
		Byte b = 1;	// �⺻������ ���� ��ü�� �ڵ���ȯ, �ڵ� �ڽ� ����
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		Float f = 5.0F;
		Double d = 2.0;
		Character c = 'a';
		Boolean bo = true;
				
		byte b2 = b; // ���� ��ü���� �⺻���� ��ȯ, �ڵ���ڽ�
		short s2 = s;
		int i2 = i;
		long l2 = l;
		float f2 = f;
		double d2 = d;
		char c2 = c;
		boolean bo2 = bo;
		print(b2,s2,i2,l2,f2,d2,c2,bo2); // ��ڽ��� ������ ���ڷ� ���
		System.out.println("���� ��ü�� �޼ҵ� ������ ���� �־ �ڵ� ��ڽ��� �̷������.");
		print(b,s,i,l,f,d,c,bo); // �޼ҵ忡�� �ڵ� ��ڽ�
	}
}
