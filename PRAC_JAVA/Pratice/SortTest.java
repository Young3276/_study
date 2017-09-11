import java.util.*;

class SortTest{
	public static void main(String [] args){
		int []lotto={7, 19, 23, 41, 39, 11};
		SortArr(lotto);
		printArr(lotto);
	}
	public static void SortArr(int [] lotto){
		int temp;
		for(int i=0; i<lotto.length-1; i++){
			for(int j=i+1; j<lotto.length; j++){
				if(lotto[i]>lotto[j]){
					temp=lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
		}
	}
	public static void printArr(int [] lotto){
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i] + " ");
		}
		System.out.println("");
	}
}
