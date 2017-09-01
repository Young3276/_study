import java.util.*;

class LastDaySwitch{
	public static void main(String [] args){
		int mon,day;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Month Number : ");
		mon=sc.nextInt();
		switch(mon){
			case 2: day=28; break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:day=31;	break;
			case 4:
			case 6:
			case 9:
			case 11:day=30;	break;
			default:
				System.out.println("Input Error!");
				return;
		}
		System.out.println(mon+"월은 "+day+"까지 있음");
	}
}
