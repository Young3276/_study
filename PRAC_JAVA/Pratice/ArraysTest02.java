import java.util.*;

class ArraysTest02{
	public static void main(String [] args){
		int a[]={10,20,30,40,50};
		int b[]={10,20,30,40,50};
		
		if(Arrays.equals(a,b))
			System.out.println("Same");
		else
			System.out.println("Difference");
	}
}
