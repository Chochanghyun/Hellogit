//정보통신공하과 20133108 박종건
package 실습문제;

public class Ex07 {
	public static void main(String args[]) {
		PrintTime p1 = new PrintTime(3);
		Thread th1 = new Thread(p1, "안녕하세요!");
		th1.setPriority(Thread.MAX_PRIORITY-1); // 순위 10(MAX)-1=9
		th1.start();	// thread 시작
		PrintTime p2 = new PrintTime(6);
		Thread th2 = new Thread(p2, "반갑습니다.");
		th2.setPriority(Thread.NORM_PRIORITY-1);
		th2.start();
	}
}
