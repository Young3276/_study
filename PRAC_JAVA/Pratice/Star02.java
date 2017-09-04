import java.util.*;

class Star02{
	public static void main(String [] args){
		int row, col;
		Scanner sc = new Scanner(System.in);
		System.out.print("줄 수 입력 : ");
		row=sc.nextInt();
		System.out.print("칸 수 입력 : ");
		col=sc.nextInt();		
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
