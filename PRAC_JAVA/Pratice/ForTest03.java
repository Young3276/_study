import java.util.*;

class ForTest03{
	public static void main(String [] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input num : ");
		n=sc.nextInt();
		for(int i=1; i<10; i++){
			System.out.println(n + " * " +i +" = " + n*i);
		}
	}
}
