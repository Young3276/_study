import java.util.*;

// 사용자한테 두 수를 입력받아 합을 구하여 출력하는 프로그램 작성
class SumNumber{
	public static void main(String [] args){
		int num1, num2;
		int sum;
		System.out.print("Input num1 : ");
		Scanner sc = new Scanner(System.in);
		num1=sc.nextInt();
		System.out.print("Input num2 : ");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("Sum : " + sum);
	}
}
