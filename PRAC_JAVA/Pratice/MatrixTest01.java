import java.util.*;

class MatrixTest01{
	public static void main(String [] args){
		int a[][]=new int[3][5];
		int n=1;

		Random r = new Random();		
		/* Input Data */
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				a[i][j]=r.nextInt(46);
			}
		}

		/* Output Data */
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("");
		}
	}
}
