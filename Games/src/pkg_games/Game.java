package pkg_games;

public class Game {
	private String name;
	private int price;
	public Game(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void print() {
		System.out.println("model of the bike is: "+name);
		System.out.println("purchase year is: "+price);
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("the game is:"+name);
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
		System.out.println("the game price is:"+price);
	}
	
	@Override
	public String toString() {
		return "Game [name=" + name + ", price=" + price + "]";
	}
	
}
