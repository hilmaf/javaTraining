package theater;

public abstract class Theater {
	
	public Theater(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public static Theater Name01;
	public static Theater Name02;
	public static Theater Name03;
	public static Theater Name04;
	
	String name;
	int price;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
}
