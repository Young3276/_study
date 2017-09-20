import java.util.*;

class Person{
	String name;
	int age;
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	public void info(){
		System.out.println("name : " + name + "age : " + age);
	}
}

class ArrayListTest05{
	public static void main(String [] args){
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person("박현준", 24));
		list.add(new Person("김진수", 24));
		list.add(new Person("박창호", 33));

		for(int i=0; i<list.size(); i++){
			Person p = list.get(i);
			p.info();
		}
	}
}
