import java.util.*;

class Person{
	protected String name="홍길동";
	protected String tel="010-2222-3333";
}

class Customer extends Person{
	int mileage=100;
	public void info(){
		System.out.println("이름: " + name);
		System.out.println("번호: " + tel);
		System.out.println("마일리지: " + mileage);
		
	}
}

class InheritanceTest03{
	public static void main(String [] args){
		Customer c1 = new Customer();
		c1.info();
	}
}
