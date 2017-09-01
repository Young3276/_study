import java.util.*;

class SwapTest{
	public static void main(String [] args){
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input num1 : ");
		a=sc.nextInt();
		System.out.print("input num2 : ");
		b=sc.nextInt();
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		a^=b;
		b^=a;
		a^=b;
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
}
