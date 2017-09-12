import java.util.*;

class BankAccount{
	private	double balance;
	private double rate;
	public BankAccount(double balance){
		this.balance=balance;
		this.rate=0.075;
	}
	public void deposit(double amount){
		this.balance+=amount;
	}
	public void withdraw(double amount){
		if(this.balance-amount<0){
			System.out.println("잔고부족");
		}else{
			this.balance-=amount;
		}
	}
	public double getBalance(){
		return this.balance;
	}
	public double getRate(){
		return this.rate;
	}
	public void addInterest(){
		this.balance=balance+balance*(getRate());
	}
	public void printBalance(){
		System.out.println(getBalance());
	}
}

class BankAccountTest{
	public static void main(String [] args){
		BankAccount a1 = new BankAccount(100);
		BankAccount a2 =new BankAccount(50);

		System.out.println("a1에서60 인출");
		a1.withdraw(60);
		System.out.println("a2에서 30을 인출");
		a2.withdraw(30);
		System.out.print("a1 잔고 출력 : ");
		a1.printBalance();
		System.out.print("a2 잔고 출력 : ");
		a2.printBalance();
		System.out.println("-------- 이자 받은 후 a1 금액 ----------");
		a1.addInterest();
		System.out.print("a1 잔고 출력 : ");
		a1.printBalance();
	}
}
