import java.util.*;

class Test05{
	public static void main(String [] args){
		int [] ages={33, 26, 26, 26, 24, 20, 30};
		int r = getSumArr(ages);
		System.out.println("나이의 총합 : " +r);
		System.out.println("나이의 평균 : " + getAvgArr(ages));
	}
		
	public static int getSumArr(int [] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}
	public static double getAvgArr(int [] arr){
		return getSumArr(arr)/arr.length;
	
	}
}
