import java.util.*;

class MatrixTest02{
	public static void main(String [] args){
		int a[][]=new int[4][6];
		int n=1,sum;
		/* INPUT DATA */
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				a[i][j]=n++;
			}
		}


		/* ROW DATA SUM */
		for(int i=0; i<3; i++){
			sum=0;
			for(int j=0; j<6; j++){
				sum+=a[i][j];
				if(j==5){
					a[i][j]=sum;
				}
			}
		}

		/* COL DATA SUM */


		/* OUTPUT DATA */
		for(int i=0; i<4; i++){
			for(int j=0; j<6; j++){
				System.out.print(a[i][j]+"\t");
			}	
			System.out.println("");
		}
	}
}
