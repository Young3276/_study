import java.util.*;

class Lab_3{
	public static void main(String [] args){
		int r;
		double pi=3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius of Circle : ");
		r=sc.nextInt();
		System.out.println("S : " + 2*r*r*pi);
		System.out.println("L : " + 2*r*pi);
	}
	
}
