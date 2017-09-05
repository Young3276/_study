import java.util.*;

class MatrixTest02Sample{
	public static void main(String [] args){
		int a[][]=new int[4][6];
		int n=1;

		/* INPUT DATA INTEGRATION */		
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				a[i][j]=n++;
				a[i][5]+=a[i][j];
				a[3][j]+=a[i][j];
				a[3][5]+=a[i][j];
			}
		}

		/* OUTPUT DATA */
		for(int i=0; i<4; i++){
			for(int j=0; j<6; j++){
				System.out.print(a[i][j] +"\t");
			}
			System.out.println("");
		}
	}
}
