import java.util.*;

// 두 수를 입력받아 둘 중에 큰 수 찾기
class CompareNum{
	public static void main(String [] args){
		int num1, num2;
		int result;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Num1 : ");
		num1 = sc.nextInt();
		System.out.print("Input Num2 : ");
		num2 = sc.nextInt();
		result = (num1<=num2)?num2:num1;
		System.out.println("bigger num is " + result);
	}
}
