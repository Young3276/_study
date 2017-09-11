import java.util.*;

class Television{
	String brand;
	
	void setBrand(String b){
		this.brand=b;
	}
	String getBrand(){
		return this.brand;
	}
	String getManufacturer(Television t){
		return t.getBrand() + "Electronics";
	}
}

public class TelevisionTest{
	public static void main(String [] args){
		Television t=new Television();
		t.setBrand("Samsung");
		String b=t.getBrand();
		Television t2=new Television();
		System.out.println(t2.getManufacturer(t));
	}
}
