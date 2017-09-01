import java.util.*;

class PersonalInfo{
	String name, addr, phone;
	char bloodType;
	int age;
	double height, weight, rightEye, leftEye;

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
}


public class InputDataTest{
	public static void main(String [] args){
		PersonalInfo pi = new PersonalInfo();
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Name : ");
		pi.setName(sc.nextLine());
		System.out.print("Input Age : ");
		pi.setAge(sc.nextInt());
		System.out.print("Input Height : ");
		pi.setHeight(sc.nextDouble());
		System.out.print("Input Weight : ");
		pi.setWeight(sc.nextDouble());

		System.out.println("Name : " + pi.getName());
		System.out.println("Age : " + pi.getAge());
		System.out.println("Height : " + pi.getHeight());
		System.out.println("Weight : " + pi.getWeight());
	
	}
}
