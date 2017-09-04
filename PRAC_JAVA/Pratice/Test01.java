import java.util.*;

class Test01{
	public static void main(String [] args){
		int i=0, sum=0;
		while(i<10){
			i++;
			if(i%3==0)
				continue;
			System.out.println(i);
			sum+=i;
			if(sum>20)
				break;
		}
		System.out.println("i : " + i);
		System.out.println("sum : " +sum);
	}
}
