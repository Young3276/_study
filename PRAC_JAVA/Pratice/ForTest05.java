import java.util.*;

class ForTest05{
	public static void main(String [] args){
		int n;
		int sum=0, count=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("N을 입력하시오 : ");
		n=sc.nextInt();
		for(int i=1; i<=n; i++){
			if(i%2==0){
				sum+=i;
				count++;
			}
		}
		System.out.println("1부터 "+n+"까지의 짝수의 합 : "+sum);
		System.out.println("1부터 "+n+"까지의 짝수의 개수 : "+count);
	}
}
