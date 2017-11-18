//정보통신공하과 20133108 박종건
package 실습문제;

public class Ex06 {
	public static void main(String args[]) {
		new Thread(new PrimeNumber03(25), "소수 만드는 스레드: ").start();
		// 스레드 생성과 동시에 start로 메소드를 실행
	}
}
