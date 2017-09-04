import java.util.*;

class Lab01{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];

		for(int i=0; i<arr.length; i++){
			System.out.print("정수입력"+i+ " : " );
			arr[i]=sc.nextInt();
		}

		/* Output */
		for(int i=0; i<arr.length; i++){
			System.out.println("정수 값 : " + arr[i]);
		}	
	}
}

