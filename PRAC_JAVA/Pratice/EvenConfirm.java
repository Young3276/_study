import java.util.*;

class EvenConfirm{
	public static void main(String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your num : ");
		num=sc.nextInt();
		if(num%2 == 0)
			System.out.println("Even");
		else
			System.out.println("odd");
	}
}
