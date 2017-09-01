import java.util.*;

class ScoreCalc{
	public static void main(String [] args){
		int kor, math, eng;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input Kor Score : ");
		kor = sc.nextInt();
		System.out.print("Input math Score : ");
		math = sc.nextInt();
		System.out.print("Input eng Score : ");
		eng = sc.nextInt();
		avg=(kor+math+eng)/3;

		System.out.println("avg : " + avg);
		if(avg>=60)
			System.out.println("Pass");
		else
			System.out.println("Fail");	
	}
}
