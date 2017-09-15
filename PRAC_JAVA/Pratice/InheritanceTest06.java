import java.util.*;
class Person{
	protected String name;
	protected String tel;
	public Person(String name, String tel){
		this.name=name;
		this.tel=tel;
//		System.out.println("Person의 생성자 출력됨");
	}
	public Person(){
	}
}

class Customer extends Person{
	int mileage;
	public void info(){
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + tel);
		System.out.println("마일리지 : " + mileage);
	}
	public Customer(String name, String tel, int mileage){
		super(name, tel);
		this.mileage=mileage;
	}
	
}
class InheritanceTest06{
	public static void main(String [] args){	
		Customer c1 = new Customer("홍길동", "010-2001", 200);
		c1.info();
	}
}
