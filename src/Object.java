// 정보통신공학과 20133108 박종건
package 실습문제;
public abstract class Object {
	String name;	// name 변수 선언
	
	public boolean equals (String name) { //name 조건에 따른 boolean형 equal()
		if (this.name == name)	
			return true;	
		else
			return false;
	}
}
