import java.util.*;

class MaxNumber{
	public static void main(String [] args){
		int num1, num2, num3;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input num1 : ");
		num1=sc.nextInt();
		System.out.print("Input num2 : ");
		num2=sc.nextInt();
		System.out.print("Input num3 : ");
		num3=sc.nextInt();
		max=(num1>=num2)?num1:num2;
		max=(max>=num3)?max:num3;
		System.out.println("Max Number : " + max);
	}
}
