import java.util.*;

class RegArea{
	public static void main(String [] args){
		int width, height;
		int area;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input width : ");
		width=sc.nextInt();
		System.out.print("Input height : ");
		height=sc.nextInt();
		area=width*height;

		System.out.println("RegArea : " + area);
	}
}
