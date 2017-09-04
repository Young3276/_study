import java.util.*;

class WhileSum{
	public static void main(String [] args){
		int n,i;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		n=sc.nextInt();
		i=0;
		while(i<=n){
			sum+=i;
			i++;
		}
		System.out.println("Sum : " + sum);
		
	}
}
