import java.util.*;

class FourPillars{
	public static void main(String [] args){
		int flag, num, mon, day, time;
		String name;
		String result="";
		String [] str1={"천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"};
		String [] str2={"귀인대첩", "액땜", "권력, 리더십", "파동있는삶", "인간성이 좋음", "머리좋음", "복을갖고 태어남", "외로움", "역마살,새로움", "남편복,바람기", "손재주,기술", "오래산다"}; 
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 ?");
		name=sc.nextLine();
		System.out.print("띠[쥐:1 소:2 범:3 토끼:4 용:5 뱀:6 말:7 양:8 원숭이:9 닭:10 개:11 돼지:12]");
		num=sc.nextInt();
		System.out.print("생월(1~12)");
		mon=sc.nextInt();	
		System.out.print("생일(1~31)");
		day=sc.nextInt();
		System.out.print("생시[자시:1 축시:2 인시:3 묘시:4 진시:5 사시:6 오시:7 미시:8 신시:9 유시:10 술시:11 해시:12]");
		time=sc.nextInt();
		
	}
}
