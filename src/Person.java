// 정보통신공학과 20133108 박종건
package 실습문제;
public class Person extends Object{
	String name;
	
	public Person (String name) { // name을 인자로 받는 Person 생성자
		this.name = name;
	}
	public boolean equals (Person p) { // Object의 equal()을  오버라이딩
		if (this.name == p.name)  // Person형 객체의 name과 필드의 name이 같으면
			return true;          // 참
		else
			return false;         // 다르면 거짓
	}

	public static void main (String[] args) {
	Person p1 = new Person("홍길동"); // Person형 객체 생성
    System.out.println(p1.equals(new Person("홍길동")));
    System.out.println(p1.equals(new Person("최영태")));
	}
}
