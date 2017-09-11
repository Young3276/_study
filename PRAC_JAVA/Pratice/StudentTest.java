import java.util.*;

class StudentTest{
	public static void main(String [] args){
		String [] name={"Song", "Kang", "Han", "Kim", "Jo"};
		int [] kor={40, 80, 100, 60, 70};
		sortArr(name, kor);
		printArr(name, kor);	
	}
	public static void sortArr(String name[], int kor[]){
		String tmp;
		int temp;
		for(int i=0; i<kor.length-1; i++){
			for(int j=i+1; j<kor.length; j++){
				if(kor[i] <kor[j]){
					temp=kor[i];
					kor[i]=kor[j];
					kor[j]=temp;
					tmp=name[i];
					name[i]=name[j];
					name[j]=tmp;
				}
			}
		}
	}
	public static void printArr(String name[], int kor[]){
		for(int i=0; i<name.length; i++){
			System.out.print(name[i] + "\t");
		}
		System.out.println("");
		for(int i=0; i<kor.length; i++){
			System.out.print(kor[i] + "\t");
		}
		System.out.println("");
	}
}
