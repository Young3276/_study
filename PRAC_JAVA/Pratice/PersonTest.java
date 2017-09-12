import java.util.*;

class Person{
	private String name;
	private int age;
	public void setName(String p){
		name=p;
	}
	public void setAge(int a){
		age=a;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}

class PersonTest{
	public static void main(String [] args){
		Person p1=new Person();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Name : ");
		p1.setName(sc.next());
		System.out.print("Input age : ");
		p1.setAge(sc.nextInt());
		System.out.println("***********************");
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
	}
}
