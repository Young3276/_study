import java.util.*;

class DateTest03{
	public static void main(String [] args){
		String week[]={"일","월", "화", "수","목","금","토"};
		int endDay[]={31,28,31,30,31,30,31,31,30,31,30,31};
		Date d1 = new Date();
		int year=d1.getYear();		//현재 년도
		int mon=d1.getMonth();		//현재 달
		int day=endDay[mon];	//현재 달의 끝 날
		Date d2 = new Date(year,mon,1);		//현재 날짜에 대한 객체 생성
		int fday=d2.getDay();			//요일 값(0~6)
//		System.out.println(fday);


		/* OUTPUT */
		System.out.println();
		System.out.println("******************* "+(1900+year)+"년 "+(mon+1)+"월 *******************");
		System.out.println("===================================================");
		System.out.println();
		for(int i=0; i<week.length;i++)
			System.out.print(week[i]+"\t");
		System.out.println();
		for(int i=0; i<fday; i++){
			System.out.print("\t");
		}
		for(int i=1; i<=day; i++){
			System.out.print(i+"\t");
			fday++;
			if(fday==7){
				System.out.println();
				fday=0;
			}
		}
	}
} 
