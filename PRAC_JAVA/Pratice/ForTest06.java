import java.util.*;

class ForTest06{
	public static void main(String [] args){
		int n;
		int result=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("N을 입력하시오 : ");
		n=sc.nextInt();
		for(;n>=1; n--){
			System.out.print(n);
			if(n!=1)
				System.out.print("*");
			result*=n;
		}
		System.out.println("="+result);
	
	}
}
