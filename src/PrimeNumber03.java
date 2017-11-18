//정보통신공하과 20133108 박종건
package 실습문제;

public class PrimeNumber03 implements Runnable{
	private int end;
	public PrimeNumber03(int end) {		// 횟수 지정을 위한 end 초기화
		this.end=end;
	}
	
	public void run() {
		int count;
		System.out.println(Thread.currentThread().getName()); //메소드 이름 출력
		for (int i=2;i<end;i++) {
			count = 0;	// 소수를 for구문에서 중복되지 않게 뽑아내도록 count로 세린다.
			for(int j=2; j<i; j++) {
				if(i%j == 0)	// 자기 자신보다 작은 수로 나누어 나머지가 없을 경우 소수가 아니다.
					count+=1;
			}
			if (count == 0)
					System.out.print(i+"  ");
			}
	}
}

