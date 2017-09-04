import java.util.*;

class DecimalSelect{
	public static void main(String [] args){
		int n;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("N을 입력하시오 : ");
		n=sc.nextInt();
		for(int i=1; i<=n; i++){
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println(n+"은 소수입니다. ");
		else
			System.out.println(n+"은 소수가 아닙니다");
	}
}
