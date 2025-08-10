package pkg_games;

public class GameName {

	public static void main(String[] args) {
		Game game1=new Game("God of war",200);
		System.out.println(game1);
		game1.setName("san andreas");
		game1.setPrice(500);
		Game game2=new Game("urban",400);
		System.out.println(game2);

	}

}
