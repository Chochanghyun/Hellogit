// ������Ű��а� 20133108 ������
package �ǽ�����;
public class Person extends Object{
	String name;
	
	public Person (String name) { // name�� ���ڷ� �޴� Person ������
		this.name = name;
	}
	public boolean equals (Person p) { // Object�� equal()��  �������̵�
		if (this.name == p.name)  // Person�� ��ü�� name�� �ʵ��� name�� ������
			return true;          // ��
		else
			return false;         // �ٸ��� ����
	}

	public static void main (String[] args) {
	Person p1 = new Person("ȫ�浿"); // Person�� ��ü ����
    System.out.println(p1.equals(new Person("ȫ�浿")));
    System.out.println(p1.equals(new Person("�ֿ���")));
	}
}
