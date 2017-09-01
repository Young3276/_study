import java.util.*;

class GameTest{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int user, com;
		System.out.println("Select : 0[Scissor], 1[Rock], 2[Paper]");
		System.out.print("Select user : ");
		user=sc.nextInt();
		com=r.nextInt()%3;
		System.out.println("** 게임 결과 **");
		if(user==0){
			if(com==0){
				System.out.println("사용자 : 가위[0]");
				System.out.println("컴퓨터 : 가위[0]");
				System.out.println("비겼습니다.");
			}else if(com==1){
				System.out.println("사용자 : 가위[0]");
				System.out.println("컴퓨터 : 바위[1]");
				System.out.println("당신이 졌습니다.");

			}else{
				System.out.println("사용자 : 가위[0]");
				System.out.println("컴퓨터 : 보[2]");
				System.out.println("당신이 이겼습니다.");

			}
		}else if(user==1){
			if(com==0){
				System.out.println("사용자 : 바위[1]");
				System.out.println("컴퓨터 : 가위[0]");
				System.out.println("당신이 이겼습니다.");

			}else if(com==1){
				System.out.println("사용자 : 바위[1]");
				System.out.println("컴퓨터 : 바위[0]");
				System.out.println("비겼습니다.");

			}else{
				System.out.println("사용자 : 바위[1]");
				System.out.println("컴퓨터 : 보[2]");
				System.out.println("당신이 졌습니다.");
			
			}
		}else{
			if(com==0){
				System.out.println("사용자 : 보[2]");
				System.out.println("컴퓨터 : 가위[0]");
				System.out.println("당신이 졌습니다.");

			}else if(com==1){
				System.out.println("사용자 : 보[2]");
				System.out.println("컴퓨터 : 바위[1]");
				System.out.println("당신이 이겼습니다.");

			}else{
				System.out.println("사용자 : 보[2]");
				System.out.println("컴퓨터 : 보[2]");
				System.out.println("비겼습니다.");
		
			}
		}
	}
}
