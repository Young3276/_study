import java.util.*;
import java.util.InputMismatchException;

class ExceptionError{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num1,num2,add;

		try{
			System.out.print("Input num1 : ");
			num1=sc.nextInt();
			System.out.print("Input num2 : ");
			num2=sc.nextInt();
			add=num1+num2;
			System.out.println("Result : " + add);
		}catch(InputMismatchException e){
			System.out.println("Input number, Not character");
		}

	}
}
