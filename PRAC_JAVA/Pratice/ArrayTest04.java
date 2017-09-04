import java.util.*;

class ArrayTest04{
	public static void main(String [] args){
		String [] name={"a","b","c","d","e"};
		int [] age={26, 35, 25, 23, 28};

		int min=0;
		for(int i=0; i<age.length; i++){
			if(age[min]>age[i])
				min=i;
		}
		System.out.println(name[min]);
	}
}
