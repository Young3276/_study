import java.util.*;

class ThreeMultiply{
	public static void main(String [] args){
		double prod = 1.0, r;
		int i, n;
		Scanner sc = new Scanner(System.in);
	//	System.out.print("실수 r 입력 : ");
	//	r=sc.nextDouble();
		System.out.print("마지막 n 입력 : ");
		n=sc.nextInt();
		for(i=0; i<=n; i++){
			r=i*i*i;
			System.out.println(i + "의 3승은" + r);
		}
	}
}
