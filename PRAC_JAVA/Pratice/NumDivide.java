import java.util.*;

//main method가 있는 class 또한 일반적인 class와 동일한 성격
// member와 method로 분리하여 생각할 것!
public class NumDivide{
	public static int a=1;
	public static void main(String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		num=sc.nextInt();
		test(num);
		
	}
	public static int test(int num){
		if(num==0){
			return 0;
		}else{
			System.out.println(a + "의자리: " + num%10);
			a*=10;
			num/=10;
			test(num);	
		}
		return 0;
	}
}
