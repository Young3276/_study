import java.util.*;

class CirMin{
	public static void main(String [] args){
		int h=0;
		int m=0;
		int s=0;
		int tot;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input time : ");
		tot=sc.nextInt();
		h=tot/3600;
		tot%=3600;
		m=tot/60;
		tot%=60;
		s=tot;
		System.out.println(h+"시간"+m+"분"+s+"초");
	}
}
