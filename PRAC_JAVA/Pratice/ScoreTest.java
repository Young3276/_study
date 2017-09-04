import java.util.*;

class ScoreTest{
	public static void main(String [] args){
		int score;
		Scanner sc=new Scanner(System.in);
		System.out.print("성적을 입력하시오: ");
		score =sc.nextInt();
		if(score<50)
			System.out.println("불합격입니다!");
		else if(score>=50 && score<60)
			System.out.println("안타깝게 불합격입니다");
		else if(score>=60 && score<70)
			System.out.println("합격입니다");
		else if(score>=70 && score<80)
			System.out.println("우수하게 합격하였습니다");
		else
			System.out.println("아주 우수하게 합격하였습니다");
	}
}
