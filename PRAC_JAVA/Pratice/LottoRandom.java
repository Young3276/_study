import java.util.*;
import java.lang.ArrayIndexOutOfBoundsException;
class LottoRandom{
	public static void main(String [] args){
		int [] lotto=new int[6];
		int num, flag, count=0;
		int i;
		Random r = new Random();

		for(; count<lotto.length; ){
			flag=0;
			num=r.nextInt(46);
			for(i=0; i<lotto.length; i++){
				if(num==lotto[i]){
					flag=1;
					break;
				}
			}
			if(flag==0){
				lotto[count]=num;
				count++;
			}
		}

		/* OUPUT */
		System.out.println("Lotto Number Generation");
		for(i=0; i<lotto.length; i++){
			System.out.print(lotto[i]+" ");
		}
		System.out.println("");
	}
}
