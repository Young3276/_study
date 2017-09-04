import java.util.*;

class WhileTest{
	public static void main(String [] args){
		int n, i=1;;
		Scanner sc=new Scanner(System.in);
		System.out.print("몇 단을 출력할까요?");
		n=sc.nextInt();

		while(i<10){
			System.out.println(i+"*"+n+"="+i*n);
			i++;
		}
	}
}
