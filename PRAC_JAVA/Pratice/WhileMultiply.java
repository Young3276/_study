import java.util.*;

class WhileMultiply{
	public static void main(String [] args){
		int n,i,rst=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("n을 입력 하시오 : ");
		n=sc.nextInt();
		i=1;
		while(i<=n){
			rst*=i;
			i++;
		}
		System.out.println(n+ "! = " + rst);
	}
}
