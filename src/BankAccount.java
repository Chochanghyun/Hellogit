// 정보통신공학과 20133108 박종건
package 실습문제;

public class BankAccount {
	int balance;
	int limited;
	
	public BankAccount(int limited) { //최저 잔금을 저장할 수 있는 필드를 지정하는 생성자
		this.limited=limited;
	}
	public void deposit(int money) { // 입금 메소드
		if(money >0) {
			balance += money;
			System.out.printf("정상 입금처리: 입금금액=%d 잔금=%d\n", money,balance);
		}
	}
	public synchronized void withdraw(int money)throws InvalidWithdraw { //출금 메소드로 인출 
		if(money>0 && balance-money>limited) { //요청 금액이  음수이거나 최저 잔금 이하로 인출을 요청하면 적당한 메시지의 예외 InvalidWithdraw를 발생
				balance -= money;
				System.out.printf("정상 출금처리: 인출금액=%d 잔금=%6d\n", money,balance);
			}
		else if(money<0){
			throw new InvalidWithdraw("음수 출금 입력 예외 발생");		
		}
		else {
			throw new InvalidWithdraw("초과 출금 요구 예외"); // 생성한 클래스 InvalidWithdraw의 객체를 생성하여 내부 생성자를 통해 출력

			}
		}
	}

