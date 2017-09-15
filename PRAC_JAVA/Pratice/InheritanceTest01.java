class Person{
	private String name;
	private String addr;
	private String tel;

	/* getter & setter */
	public void setName(String name){
		this.name=name;
	}
	public void setAddr(String addr){
		this.addr=addr;
	}
	public void setTel(String tel){
		this.tel=tel;
	}
	public String getName(){
		return this.name;
	}
	public String getAddr(){
		return this.addr;
	}
	public String getTel(){
		return this.tel;
	}
	
}

class Customer extends Person{
	private int cusNum;
	private int mileage;

	/* getter & setter */
	public void setCusNum(int cusNum){
		this.cusNum=cusNum;
	}
	public void setMileage(int mileage){
		this.mileage=mileage;
	}
	public int getCusNum(){
		return this.cusNum;
	}	
	public int getMileage(){
		return this.mileage;
	}
}

class InheritanceTest01{
	public static void main(String [] args){
		Customer c1 = new Customer();
		c1.setName("young");
		c1.setAddr("Seoul");
		c1.setTel("010-2201-3276");
		c1.setCusNum(100);
		c1.setMileage(1000);

		System.out.println(c1.getName());
		System.out.println(c1.getAddr());
		System.out.println(c1.getTel());
		System.out.println(c1.getCusNum());
		System.out.println(c1.getMileage());
	}
}
