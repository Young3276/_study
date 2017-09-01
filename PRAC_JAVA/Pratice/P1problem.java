import java.util.*;

class P1problem{
	public static void main(String [] args){
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input horizon length : ");
		x=sc.nextInt();
		System.out.print("Input vertical length : ");
		y=sc.nextInt();
		System.out.print("Input height length : ");
		z=sc.nextInt();
		System.out.println("Volume : " + x*y*z);
	}
}
