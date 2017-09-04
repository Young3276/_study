import java.util.*;

class PolynomialCalc{
	public static void main(String [] args){
		double x, result;
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input x : ");
		x=sc.nextDouble();
		sum+=Math.pow(x,3)*3;
		sum+=Math.pow(x,2)*7;
		sum+=9;
		System.out.println(sum);
	}
}
