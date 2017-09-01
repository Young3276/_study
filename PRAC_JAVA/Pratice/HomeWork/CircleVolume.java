import java.util.*;

class CircleVolume{
	public static void main(String [] args){
		double pi=3.141;
		double r, h;
		double v;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input r : ");
		r=sc.nextDouble();
		System.out.print("Input h : ");
		h=sc.nextDouble();
		v=pi*r*r*h;

		System.out.println("Volume = "+v);
	}
}
