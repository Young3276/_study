import java.util.*;

class MaxSearch{
	public static void main(String [] args){
		int num1, num2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input num1 : ");
		num1=sc.nextInt();
		System.out.print("Input num2 : ");
		num2=sc.nextInt();
		result=(num1<=num2)?num2:num1;
		System.out.println("Max Num is " + result);
	}
}
