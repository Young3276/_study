import java.util.*;

class HanUtil{
	
	public int getMax(int a, int b){
		int max=(a>b)?a:b;
		return max;
	}
	public double getMax(double a, double b){
		double max=(a>b)?a:b;
		return max;
	}
}
class OverloadingTest01{
	public static void main(String [] args){
		HanUtil hu;
		hu=new HanUtil();

		System.out.println(hu.getMax(26,24));
		System.out.println(hu.getMax(178.8, 180.5));
	}
}
