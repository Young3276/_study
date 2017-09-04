import java.util.*;

class ForTest04{
	public static void main(String [] args){
		int n;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("어디까지 더할까요? : ");
		n=sc.nextInt();
		for(int i=1; i<=n; i++){
			sum+=i;
		}
		System.out.println("1부터 " + n + "까지의 합은" + sum);
	}
}
