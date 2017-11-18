//정보통신공하과 20133108 박종건
package 실습문제;
import java.util.Date;

public class PrintTime implements Runnable{
	private int end;
	
	public PrintTime(int end) {		// 횟수 지정을 위한 end 초기화
		this.end=end;
	}
	public synchronized void run() {
		Date now = new Date();		// 현재 시간을 알기위해 Date 함수 사용
		for(int i=1;i<=this.end;i++) { //currentTheread로 객체 생성없이 현재 스레드 상태에서 getPriority로 순위, getName으로 이름을 뽑는다.
			System.out.println("순위: "+Thread.currentThread().getPriority()+" "+now+" "+Thread.currentThread().getName());
		}
	}

}
