class Item {
	int id;
	String name;
	double price;
	char tip;

	public Item(int id, String name, double price, char tip) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.tip = tip;
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

	public void settip(char tip) {
		this.tip = tip;
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

	public char gettip() {
		return tip;
	}
	//TODO add variable.

	//TODO constructor

	//TODO setters and getters

	double taxReturn() {
		//TODO
		return price * 0.15;
	}

	@Override
	public String toString() {
		return "Item{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				", tip=" + tip +" taxReturn= "+ taxReturn();
	}
}

class Receipt {
	ArrayList<Item> lista = new ArrayList<>();
	public void print() {

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).toString());
		}
	}
}