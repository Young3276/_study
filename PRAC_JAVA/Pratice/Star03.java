import java.util.*;

class Star03{
	public static void main(String [] args){
		int line;
		System.out.print("줄 수 입력 : ");
		Scanner sc = new Scanner(System.in);
		line=sc.nextInt();
		
		for(int i=1; i<=line; i++){
			for(int j=0; j<i; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
