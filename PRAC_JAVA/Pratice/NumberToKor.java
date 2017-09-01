import java.util.*;

class NumberToKor{
	public static void main(String [] args){
		int num,temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number(0~99) : ");
		num=sc.nextInt();
		if(num>=100 || num<0){
			System.out.println("100이상의 숫자 입력");
			return;
		}
		temp=num/10;
		num=num%10;
		if(temp !=0){
			if(temp==1){
				System.out.print("십");
			}else if(temp==2){
				System.out.print("이십");
			}else if(temp==3){
				System.out.print("삼십");
			}else if(temp==4){
				System.out.print("사십");
			}else if(temp==5){
				System.out.print("오십");
			}else if(temp==6){
				System.out.print("육십");
			}else if(temp==7){
				System.out.print("칠십");
			}else if(temp==8){
				System.out.print("팔십");
			}else if(temp==9){
				System.out.print("구십");
			}
		}
		if(num==0){
			if(temp==0)
				System.out.println("영");
			else
				System.out.println("");	
		}else if(num==1){
			System.out.println("일");
		}else if(num==2){
			System.out.println("이");
		}else if(num==3){
			System.out.println("삼");
		}else if(num==4){
			System.out.println("사");
		}else if(num==5){
			System.out.println("오");
		}else if(num==6){
			System.out.println("육");
		}else if(num==7){
			System.out.println("칠");
		}else if(num==8){
			System.out.println("팔");
		}else {
			System.out.println("구");
		}
	}

}
