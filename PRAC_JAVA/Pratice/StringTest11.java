import java.util.*;


class StringTest11{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String idNum=sc.next();
		int flag=Integer.parseInt(idNum.charAt(7)+"");
		if(flag==1)
			System.out.println("남");
		else
			System.out.println("여");
	}
}
