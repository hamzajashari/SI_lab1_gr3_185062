class Item {
	int id;
	String name;
	double price;
    char tip;

	public Item(int id, String name, double price, char ddv) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.ddv = ddv;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDdv(char ddv) {
		this.ddv = ddv;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public char getDdv() {
		return ddv;
	}
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		//TODO
		return price*0.15;
	}
}