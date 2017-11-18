// 정보통신공학과 20133108 박종건
package 실습문제;
public class StringEx {
	   public static void main(String[] args)
	    {
	        String s1 = new String("java");
	        String s2 = new String("java");
	        String s3 = s2;
	        
	        System.out.println(s1 == s2); // s1객체와 s2객체는 서로 따로 생성된 다른 객체임으로 False
	        System.out.println(s1.equals(s2)); // s1의 내용과 s2의 내용은 같다. True
	        System.out.println(s2 == s3); // s3와 s2는 같은 객체이다.
	        System.out.println(s2.equals(s3)); // s2의 내용과 s3의 내용이 같으므로 True
	    }
	
}
