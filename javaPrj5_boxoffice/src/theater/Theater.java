package theater;

public abstract class Theater {
	
	public static String Name01 = "Dolby Cinema";
	public static String Name02 = "IMAX";
	public static String Name03 = "일반 2D";
	public static String Name04 = "3D";
	
	public Theater(String name, int price) {
		this.name = name;
		this.price = price;
	}

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
