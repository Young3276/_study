import java.util.*;

class GuguDan{
	public static void main(String [] args){
		for(int k=0; k<3; k++){
			for(int i=1; i<=9; i++){
				for(int j=3*k+1; j<=3*(k+1); j++){
					System.out.print(j+"*"+i+"="+i*j+"\t");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
