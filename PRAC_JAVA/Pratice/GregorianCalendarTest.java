import java.util.*;

class GregorianCalendarTest{
	public static void main(String [] args){
//		Calendar calendar=Calendar.getInstance();
		GregorianCalendar gc = new GregorianCalendar();
		int year=gc.get(Calendar.YEAR);
		System.out.println("year : " + year);
//		int mon=
		System.out.println(gc.get(Calendar.YEAR)+"년"+(gc.get(Calendar.MONTH)+1)+"월"+gc.get(Calendar.DATE)+"일");	
			if(gc.isLeapYear(Calendar.YEAR))
				System.out.println("올해는 윤년입니다.");
		else
				System.out.println("올해는 윤년이 아닙니다");
	}
}
