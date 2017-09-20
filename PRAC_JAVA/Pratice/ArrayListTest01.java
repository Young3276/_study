import java.util.*;

class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public String toString(){
		return name+" " + age;
	}
}

class ArrayListTest01{
	public static void main(String [] args){
		ArrayList list = new ArrayList();
		Person p1 = new Person("Young", 28);
		list.add("네이비");
		list.add("흰색");
		list.add("파랑");
		list.add("파랑");
		list.add("민트");
	
		ArrayList list2=new ArrayList();
		list2.add("경기도 남양주시");
		list2.add(new Person("Young", 28));
		list2.add(list);	
		System.out.println(list2);
	}
}
