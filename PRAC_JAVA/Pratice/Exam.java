import java.util.*;
import java.io.IOException;

class Exam{
	public static void main(String [] args){
		String [] problem={"한국수도?", "일본수도?", "미국수도?", "인도수도?", "캐나다수도?", "중국수도?", "태국수도", "이탈리아수도?","독일수도?", "프랑스수도"};
		String [] example={"a.서울","b.도쿄","c.워싱턴","a.도쿄","b.서울","c.워싱턴","a.서울","b.도쿄","c.워싱턴","a.뉴델리","b.서울","c.도쿄","a.서울","b.도쿄","c.오타와", "a.서울","b.도쿄","c.베이징","a.방콕","b.서울","c.도쿄","a.서울","b.도쿄","c.로마","a.베를린","b.서울","c.도쿄","a.파리","b.서울","c.도쿄"};
		char []answer={'a','a','c','a','c','c','a','c','a','a'};
		boolean []rst=new boolean[10];
		char asr;
		Scanner sc=new Scanner(System.in);

		/* 문제 풀기 */
		for(int i=0; i<problem.length; i++){
			System.out.println(i+1+"."+problem[i]);
			for(int j=3*i;j<=3*(i+1)-1;j++){
				System.out.print(example[j]+"\t");
			}
			System.out.printf("\n");
			System.out.print("Answer : ");
			try{
				asr=(char)System.in.read();
				if(asr<97 && asr>99){
					System.out.println("입력오류");
					return;
				}
				System.in.read();
				rst[i]=isPassed(answer, i, asr);
				System.out.println("");
			}catch(IOException e){
				System.out.println("Input Error!");		
			}
		}
		System.out.println("정답 수 : " + correctAnswer(rst));
		System.out.println("오답 수 : " + incorrectAnswer(rst));

	}

	/* 정답 개수 확인 */
	public static int correctAnswer(boolean [] rst){
		int count=0;
		for(int i=0; i<rst.length; i++){
			if(rst[i]==true)
				count++;
		}
		return count;
	}

	/* 오답 개수 확인 */
	public static int incorrectAnswer(boolean [] rst){
		int count=0;
		for(int i=0; i<rst.length; i++){
			if(rst[i]==false)
				count++;
		}
		return count;
	}

	/* 채점 결과 배열 */
	public static boolean isPassed(char []answer, int num, char asr){
		boolean rst=false;
		if(answer[num] == asr){
			rst=true;
		}
		return rst;
	}
}
