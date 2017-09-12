import java.util.*;


class IdNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String line=sc.next();
		String temp[]=line.split("-");
		int sum=0, j=1;
		int result,rst; 
		line="";
		for(int i=0; i<temp.length; i++)
			line+=temp[i];
		char tmp[]=line.toCharArray();
		rst=Integer.parseInt(tmp[tmp.length-1]+"");	//checksum;

		for(int i=0; i<tmp.length-1; i++){	
			j++;
			sum+=j*Integer.parseInt(tmp[i]+"");
			if(j==9){
				j=1;
			}
		}
		result = 11-(sum%11);
		if(result>=10)
			result%=10;

		if(rst==result)
			System.out.println("Perfect");
		else
			System.out.println("No good");
		

	}	
}
