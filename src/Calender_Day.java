// 정보통신공학과 20133108 박종건
package 실습문제;
import java.util.*;
public class Calender_Day {
	public static void main(String[] args) {
		int year = 2012;
		int month = 6; 
		int date = 17; 
		
		Calendar cd =new GregorianCalendar(year,month-1,date); // Month에서 0월이 없으므로 1을 뺴준다
		int cd1=cd.get(Calendar.DAY_OF_WEEK_IN_MONTH);// 그 달에서 요일의 횟수 반환
	    int cd2=cd.get(Calendar.WEEK_OF_MONTH); // 현재 월의 몇째 주
	    int cd3=cd.get(Calendar.DAY_OF_YEAR); // 그 해의 날짜를 반환
	    int cd4=cd.get(Calendar.WEEK_OF_YEAR);// 그 해의 주 횟수를 반환
	    int cd5=cd.get(Calendar.DAY_OF_WEEK); // 그 날짜의 요일 반환
		String[] day_of_week = {"일", "월", "화", "수", "목", "금", "토"}; // 요일이 숫자로 반환됨을 이용한 배열 생성

		System.out.println("오늘은 " + cd.get(Calendar.YEAR)+"년 "+ cd.get(Calendar.MONTH)+"월 "+ cd.get(Calendar.DATE)+"일 입니다.");
		System.out.println("이 달의 " + cd1 + "번째 " + day_of_week[cd5-1] + "요일 입니다.");
		System.out.println("이 달의 " + cd1 + "번째 " + cd2 + "주 입니다.");
		System.out.println("이 해의 " + cd3 + "일입니다.");
		System.out.println("이 해의 " + cd4 + "번째 " + "주 입니다.");
		}
}