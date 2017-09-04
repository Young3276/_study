import java.util.*;

class ArrayTest03{
	public static void main(String [] args){
		int [] age={26, 35, 25, 23, 28, 26, 26, 26, 24, 34, 30, 33};
		int max=age[0];
		for(int i=0; i<age.length; i++){
			max=(max>age[i])?max:age[i];
		}		
		System.out.println(max);
	}
}
