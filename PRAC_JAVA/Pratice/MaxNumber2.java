import java.util.*;

class MaxNumber2{
	public static void main(String [] args){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Num1: " );
		num1=sc.nextInt();
		System.out.print("Input Num2: " );
		num2=sc.nextInt();
		System.out.print("Input Num3: " );
		num3=sc.nextInt();

		if(num1>=num2){
			if(num1>=num3){
				System.out.println("MaxNumber : " + num1);
			}else{
				System.out.println("MaxNumber : " + num3);
			}
		}else{
			if(num2>=num3){
				System.out.println("MaxNumber : " + num2);
			}else{
				System.out.println("MaxNumber : " + num3);
			}
		}
	}
}
