import java.util.*;

class StarMonthTest{
	public static void main(String [] args){
		String name,star="";
		int mon, day;
		Scanner sc=new Scanner(System.in);
		System.out.print("Input Name : ");
		name=sc.nextLine();
		System.out.print("Input Month : ");
		mon=sc.nextInt();
		System.out.print("Input day : ");
		day=sc.nextInt();
		switch(mon){
			case 1:
				if(day>=1 && day<=31)	if(day<20){ star="염소자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="물병자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 2:
				if(day>=1 && day<=28)	if(day<19){ star="물병자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="물고리자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 3:
				if(day>=1 && day<=31)	if(day<21){ star="물고리자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="양자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 4:
				if(day>=1 && day<=30)	if(day<20){ star="양자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="황소자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 5:
				if(day>=1 && day<=31)	if(day<21){ star="황소자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="쌍둥이자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 6:
				if(day>=1 && day<=30)	if(day<22){ star="쌍둥이자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="게자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 7:
				if(day>=1 && day<=31)	if(day<23){ star="게자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="사자자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 8:
				if(day>=1 && day<=31)	if(day<23){ star="사자자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="처녀자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 9:
				if(day>=1 && day<=30)	if(day<24){ star="처녀자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="천칭자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 10:
				if(day>=1 && day<=31)	if(day<23){ star="천칭자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="전갈자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 11:
				if(day>=1 && day<=30)	if(day<23){ star="전갈자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="사수자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			case 12:
				if(day>=1 && day<=31)	if(day<25){ star="사수자리";System.out.println(name+"님의 별자리는"+star+"입니다"); }else{ star="염소자리";System.out.println(name+"님의 별자리는"+star+"입니다");}
				else System.out.println("Input right day");break;
			default:
				System.out.println("Input Right Month");
				return;
		}
	}
} 
