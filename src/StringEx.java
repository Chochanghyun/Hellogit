// ������Ű��а� 20133108 ������
package �ǽ�����;
public class StringEx {
	   public static void main(String[] args)
	    {
	        String s1 = new String("java");
	        String s2 = new String("java");
	        String s3 = s2;
	        
	        System.out.println(s1 == s2); // s1��ü�� s2��ü�� ���� ���� ������ �ٸ� ��ü������ False
	        System.out.println(s1.equals(s2)); // s1�� ����� s2�� ������ ����. True
	        System.out.println(s2 == s3); // s3�� s2�� ���� ��ü�̴�.
	        System.out.println(s2.equals(s3)); // s2�� ����� s3�� ������ �����Ƿ� True
	    }
	
}
