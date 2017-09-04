import java.util.*;

class DoWhileIntegration{
	public static void main(String [] args){
		int n, rst;
		int i=1;
		Scanner sc=new Scanner(System.in);
		do{
			switch(i){
				case 1:
					System.out.print("구구단 몇단? : ");
					n=sc.nextInt();
					for(int j=1; j<10; j++){
						System.out.println(j+"*"+n+"="+j*n);
					}
					break;
				case 2:
					System.out.print("N까지의 합 -> n값 입력 : ");
					n=sc.nextInt();
					rst=0;
					for(int j=0; j<=n; j++)
						rst+=j;
					System.out.println(n+"까지의 합 : " + rst);
					break;
				case 3:
					System.out.print("N까지의 곱 -> 팩토리얼, n값 입력 : ");
					n=sc.nextInt();
					rst=1;
					for(int j=1; j<=n; j++)
						rst*=j;
					System.out.println(n+"까지의 곱 : "+ rst);
					break;
			}
			i++;
		}while(i<=3);
	}
}
