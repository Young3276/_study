import java.util.*;

class SwitchCase{
	public static void main(String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Number : ");
		num=sc.nextInt();
		switch(num){
			case 0:
				System.out.println("영");
				break;
			case 1:
				System.out.println("일");
				break;
			case 2:
				System.out.println("이");
				break;
			case 3:
				System.out.println("삼");
				break;
			case 4:
				System.out.println("사");
				break;
			case 5:
				System.out.println("오");
				break;
			case 6:
				System.out.println("육");
				break;
			case 7:
				System.out.println("칠");
				break;
			case 8:
				System.out.println("팔");
				break;
			case 9:
				System.out.println("구");
				break;
		}
	}
}
