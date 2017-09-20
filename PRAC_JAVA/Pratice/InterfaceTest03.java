import java.util.*;

interface Buyable{
	public abstract int getPrice();
}

class Television implements Buyable{
	String model;
	String maker;
	int price;
	public Television(){};
	public Television(String model, String maker, int price){
		this.model=model;
		this.maker=maker;
		this.price=price;
		printPrice(this);
	}
	private static void printPrice(Buyable item){
		System.out.printf("%10d",item.getPrice());
		System.out.println();
	}	
	public int getPrice(){
		return this.price;
	}
	public String getModel(){
		return this.model;
	}
	public String getMaker(){
		return this.maker;
	}
	public void setPrice(int price){
		this.price=price;
	}
	public void setModel(String model){
		this.model=model;
	}
	public void setMaker(String maker){
		this.maker=maker;
	}
}

class Refrigerator implements Buyable{
	String model;
	String maker;
	int price;
	public Refrigerator(){};
	public Refrigerator(String model, String maker, int price){
		this.model=model;
		this.maker=maker;
		this.price=price;
		printPrice(this);
	}
	private static void printPrice(Buyable item){
		System.out.printf("%10d",item.getPrice());
		System.out.println();
	}
        public int getPrice(){
                return this.price;
        }
        public String getModel(){
                return this.model;
        }
        public String getMaker(){
                return this.maker;
        }
        public void setPrice(int price){
                this.price=price;
        }
        public void setModel(String model){
                this.model=model;
        }
        public void setMaker(String maker){
                this.maker=maker;
        }
}


class InterfaceTest03{
	public static void main(String [] args){
		Buyable p1 = new Television("ZD-360", "SAMSUNG", 1000);
		Buyable p2 = new Refrigerator("ZD-340", "LG", 10000);
	}
}
