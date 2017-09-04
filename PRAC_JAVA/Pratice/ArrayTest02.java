import java.util.*;

class ArrayTest02{
	public static void main(String [] args){
		int age[] = {1,2,3,4,5,6};
		int sum=0;
		
		for(int i : age){
			sum+=i;
		}
		System.out.println("sum : " + sum);
	}
}
