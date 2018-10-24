package dicegame;

import java.util.Scanner;

public class PlayerHuman extends Player {
	private Scanner s = new Scanner(System.in);

	public PlayerHuman() {

	}

	public PlayerHuman(String name) {
		super(name); // żeby nie powtarzac kodu, nie trzeba pisac setName, tylko super ( odwolanie
						// sie do konstruktowa wyzej )

	}

	// piszemy przyslanianie, czyli modyfikacje tego co dzedziczymy

	public int guess() {
		System.out.println("Podaj liczbę od 1-6");

		return s.nextInt();

	}

}
