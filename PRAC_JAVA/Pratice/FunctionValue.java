import java.util.*;

class FunctionValue{
	public static void main(String [] args){
		int x;
		int result;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input x Value : ");
		x=sc.nextInt();
		
		if(x>0){
			result=7*x+2;
		}else{
			result=x*x*x-9*x+2;
		}

		System.out.println("y Value : " + result);
	}
}
