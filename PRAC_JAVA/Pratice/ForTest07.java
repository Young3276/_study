import java.util.*;
import java.io.IOException;

class ForTest07{
	public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int x, n, r=1;
		char again;
		while(true){
			System.out.print("어떤 수를 곱할까요? : ");
			x=sc.nextInt();
			System.out.print("몇번 곱할까요 : " );
			n=sc.nextInt();
			for(int i=1; i<=n; i++)
				r=r*x;
	
			System.out.println(x +"의 " + n + "제곱승은" + r);	
			again=(char)System.in.read();
			if(again=='y' || again=='Y' || again=='n' || again=='N')
				break;
		}
		if(again=='N' || again=='n')
			break;
	}
}
