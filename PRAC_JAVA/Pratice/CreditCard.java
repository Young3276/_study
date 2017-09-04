import java.util.*;
	
class CreditCard{
	public static void main(String [] args){
		double arr[]=new double[12];
		double temp;
		Scanner sc=new Scanner(System.in);
		/* Input */
		for(int i=0; i<arr.length; i++){
			System.out.print(i+1+"월 사용금액 : ");
			temp=sc.nextDouble();
			if( temp<0){
				i--;
				continue;
			}
			arr[i]=temp;
		}			
		System.out.println("*******************************");
		System.out.println("Total사용금액 : " + TotalMoney(arr));
		System.out.println("Average 사용금액 : " + AvrMoney(arr));
		System.out.println("가장 많이 쓴 달 : " + BigOutputMonth(arr) + "월");
		System.out.println("가장 적게 쓴 달: " + SmallOutputMonth(arr)+"월");
		System.out.println("*******************************");
	}

	public static double TotalMoney(double [] arr){
		double total=0;
		for(int i=0; i<arr.length; i++){
			total+=arr[i];
		}
		return total;
	}
	public static double AvrMoney(double [] arr){
		double avr,total=0;
		for(int i=0; i<arr.length; i++){
			total+=arr[i];
		}
		avr=total/arr.length;
		return avr;
	}
	public static int BigOutputMonth(double [] arr){
		int mon=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]>arr[mon])
				mon=i;
		}
		mon+=1;
		return mon;
	}
	public static int SmallOutputMonth(double [] arr){
		int mon=0;
		for(int i=0; i<arr.length; i++){
			if(arr[i] < arr[mon])
				mon=i;
		}
		mon+=1;
		return mon;
	}
} 
