// ������Ű��а� 20133108 ������
package �ǽ�����;

public class BankAccount {
	int balance;
	int limited;
	
	public BankAccount(int limited) { //���� �ܱ��� ������ �� �ִ� �ʵ带 �����ϴ� ������
		this.limited=limited;
	}
	public void deposit(int money) { // �Ա� �޼ҵ�
		if(money >0) {
			balance += money;
			System.out.printf("���� �Ա�ó��: �Աݱݾ�=%d �ܱ�=%d\n", money,balance);
		}
	}
	public synchronized void withdraw(int money)throws InvalidWithdraw { //��� �޼ҵ�� ���� 
		if(money>0 && balance-money>limited) { //��û �ݾ���  �����̰ų� ���� �ܱ� ���Ϸ� ������ ��û�ϸ� ������ �޽����� ���� InvalidWithdraw�� �߻�
				balance -= money;
				System.out.printf("���� ���ó��: ����ݾ�=%d �ܱ�=%6d\n", money,balance);
			}
		else if(money<0){
			throw new InvalidWithdraw("���� ��� �Է� ���� �߻�");		
		}
		else {
			throw new InvalidWithdraw("�ʰ� ��� �䱸 ����"); // ������ Ŭ���� InvalidWithdraw�� ��ü�� �����Ͽ� ���� �����ڸ� ���� ���

			}
		}
	}

