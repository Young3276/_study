import java.util.*;

class DateTest01{
	public static void main(String [] args){
		Date d=new Date();
		System.out.println(d.getYear()+1900+"년"+ (d.getMonth()+1)+"월"+d.getDate()+"일");
		System.out.println(d.getHours()+"시"+d.getMinutes()+"분");
		
	}
}
