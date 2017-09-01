import java.util.*;

class Test04{
	public static void main(String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		num=sc.nextInt();
		if(num>=0){
			num+=100;
			System.out.println("num : " + num);
		}else{
			num*=num;
			System.out.println("num : " + num);
		}
	}
}
