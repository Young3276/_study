import java.util.*;

class PerfectNum{
	public static void main(String [] args){
		int i, j, sum;
		System.out.print("Perfect Number : ");
		for(i=1; i<=1000; i++){
			sum=0;
			for(j=1; j<i; j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(i==sum){
				System.out.print(i+" ");
			}
		}
		System.out.println("");
	}
}
