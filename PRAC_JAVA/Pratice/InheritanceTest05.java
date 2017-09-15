import java.util.*;
class Person{
	protected String name="홍길동";
	protected String tel="010-2201-3276";
	public Person(){
		System.out.println("Person의 생성자 출력됨");
	}
}

class Customer extends Person{
	int mileage=100;
	public void info(){
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + tel);
		System.out.println("마일리지 : " + mileage);
	}
	public Customer(){
		System.out.println("Customer 생성자 출력됨");
	}
}
class InheritanceTest05{
	public static void main(String [] args){	
		Customer c1 = new Customer();
	}
}
