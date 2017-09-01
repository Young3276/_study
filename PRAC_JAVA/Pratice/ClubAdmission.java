import java.util.*;

class ClubAdmission{
	public static void main(String [] args){
		int age;
		double height;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Age : ");
		age=sc.nextInt();
		System.out.print("Input height : ");
		height=sc.nextDouble();
		if(age>=30 && height>=170)
			System.out.println("PASS");
		else
			System.out.println("FAIL");
	}
}
