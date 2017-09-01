import java.util.*;

class StandardWeight{
	public static void main(String [] args){
		double height, weight;
		double std;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input height : ");
		height=sc.nextDouble();
		System.out.print("Input weight : ");
		weight=sc.nextDouble();
		std=(height-100)*0.9;
		if(std-1<=weight && std+1>=weight){
			System.out.println("Standard Weight");
		}else if(std-1>weight){
			System.out.println("Low Weight");
		}else{
			System.out.println("High Weight");
		}
	}
}
