import java.util.*;

class ArrayTest01{
	public static void main(String [] args){
		int age[]={20, 23, 26, 27, 27, 25};
		int sum=0;
		double avg=0;
		for(int i=0; i<age.length; i++){
			sum+=age[i];
		}
		avg=(double) sum/age.length;
		System.out.printf("%.2f\n",avg);
	}
}
