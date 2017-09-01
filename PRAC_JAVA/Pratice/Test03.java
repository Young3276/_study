import java.util.*;

class Test03{
	public static void main(String [] args){
		int age,birth_year, year;
		year=Calendar.getInstance().get(Calendar.YEAR);
		Scanner sc = new Scanner(System.in);
		System.out.print("Input your birth year : ");
		birth_year=sc.nextInt();
		age=year-birth_year;
		if(age>=40 && year%2==birth_year%2)
			System.out.println("you are free cancer inspection");
		else
			System.out.println("Not free");
	}
}
