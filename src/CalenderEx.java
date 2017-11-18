// 정보통신공학과 20133108 박종건
package 실습문제;
import java.util.*; // Calendar GregorianCalendar, Scanner등 유틸리티 사용을 위해  import

public class CalenderEx {
	int yearday;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 년,월,일을 입력받는 함수
		System.out.println("요일을 알고 싶은 날짜의 년,월,일을 입력하시오 ");
		System.out.println("--------------------------------");
		System.out.print("년(YEAR): ");
		int year = sc.nextInt();
		System.out.print("월(MONTH): ");
		int month = sc.nextInt();
		System.out.print("일(DAY): ");
		int day = sc.nextInt();
		Calendar ca = new GregorianCalendar(year,month-1,day); // 그레고리안으로 입력받은 년,월,일 객체 생성
		// 캘린더는 날짜정보를 입력 받을 수 없으므로 하위클래스인 그레고리안 캘린더 객체 생성을 통해 날짜 정보를 받고
		// 상위 메소드인 Calendr.DAY_OF_WEEK으로 요일을 뽑아내기위해 Calendar형으로 업캐스팅
															   
		switch(ca.get(Calendar.DAY_OF_WEEK)) { // 일요일의 경우 1로 출력되므로 조건에 맞는 문장 출력을 위해 Switch문 사용
		case 1:
			System.out.println("입력한 날짜의 요일은 일요일입니다. ");
			break;
		case 2:
			System.out.println("입력한 날짜의 요일은 월요일입니다. ");
			break;
		case 3:
			System.out.println("입력한 날짜의 요일은 화요일입니다. ");
			break;
		case 4:
			System.out.println("입력한 날짜의 요일은 수요일입니다. ");
			break;
		case 5:
			System.out.println("입력한 날짜의 요일은 목요일입니다. ");
			break;
		case 6:
			System.out.println("입력한 날짜의 요일은 금요일입니다. ");
			break;
		case 7:
			System.out.println("입력한 날짜의 요일은 토요일입니다. ");
			break;
		}
	}
}

