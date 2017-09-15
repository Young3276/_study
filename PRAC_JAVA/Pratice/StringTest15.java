import java.util.*;

class StringTest15{
	public static void main(String [] args){
		int age=26;
		char gender='M';
		double height=189.7;
		boolean flag=true;
		
		String str=String.valueOf(age)+" ";
		System.out.println(str);
		str+=String.valueOf(gender)+" ";
		System.out.println(str);
		str+=String.valueOf(height)+" ";
		System.out.println(str);
		str+=String.valueOf(flag)+" ";
		System.out.println(str);
		
	}
}
