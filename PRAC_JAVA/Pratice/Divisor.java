import java.util.*;

class Divisor{
	public static void main(String [] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("N을 입력하시오 : ");
		n=sc.nextInt();
		for(int i=1; i<=n; i++){
			if(n%i==0)
				System.out.print(i+" ");
		}
		System.out.println("");
	}
}
