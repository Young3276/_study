import java.util.*;

class LastDay{
	public static void main(String [] args){
		int mon;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Month : ");
		mon=sc.nextInt();
		if(mon<1 || mon>12){
			System.out.println("Input 1~12 Month");
			return;
		}

		if(mon==2){
			System.out.println("28");
		}else if(mon==4 || mon==6 || mon==9 || mon==11){
			System.out.println("30");
		}else{
			System.out.println("31");
		}
	}
}
