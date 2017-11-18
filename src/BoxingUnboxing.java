// 정보통신공학과 20133108 박종건
package 실습문제;
public class BoxingUnboxing {	
	public static void print(byte a, short b, int c, long d, float e, double f, char g, boolean h) {
		System.out.printf("Byte(정수형) : %d%n", a);		// print 메소드에 자동언박싱된 변수를 각각 출력
        System.out.printf("Short(정수형) : %d%n", b);
        System.out.printf("Integer(정수형) : %d%n",c);
        System.out.printf("Long(정수형) : %d%n", d);
        System.out.printf("Float(실수형) : %.1f%n", e);
        System.out.printf("Double(실수형) : %.1f%n", f);
        System.out.printf("Character(문자형) : %c%n", g);
        System.out.printf("Boolean(논리형) : %b%n", h);
        System.out.println("");
	}
	public static void main (String[] args) {
		Byte b = 1;	// 기본형에서 랩퍼 객체의 자동변환, 자동 박싱 과정
		Short s = 2;
		Integer i = 3;
		Long l = 4L;
		Float f = 5.0F;
		Double d = 2.0;
		Character c = 'a';
		Boolean bo = true;
				
		byte b2 = b; // 랩퍼 객체에서 기본형의 변환, 자동언박싱
		short s2 = s;
		int i2 = i;
		long l2 = l;
		float f2 = f;
		double d2 = d;
		char c2 = c;
		boolean bo2 = bo;
		print(b2,s2,i2,l2,f2,d2,c2,bo2); // 언박싱한 변수를 인자로 출력
		System.out.println("랩퍼 객체를 메소드 변수로 집어 넣어도 자동 언박싱이 이루어진다.");
		print(b,s,i,l,f,d,c,bo); // 메소드에서 자동 언박싱
	}
}
