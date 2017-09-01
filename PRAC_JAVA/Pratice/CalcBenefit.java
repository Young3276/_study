import java.util.*;

class CalcBenefit{
	public static void main(String [] args){
		double deposit;
		double rate;
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input deposit : ");
		deposit=sc.nextDouble();
		System.out.print("Input rate : ");
		rate=sc.nextDouble()/100;
		System.out.print("Input year : ");
		year=sc.nextInt();
		for(int i=0; i<year; i++){
			deposit=deposit+deposit*rate;
		}
		System.out.println(year+"후의 deposit : " + deposit);
	}
}
