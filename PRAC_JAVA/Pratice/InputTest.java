import java.util.*;

class InputTest{
	public static void main(String [] args){
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("Age : ");
		age = sc.nextInt();
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}
