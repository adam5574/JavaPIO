package dicegame;

import java.util.Random;

/**
 *
 * @author olek
 */
public abstract class Player {

	private String name = "Domyślny Janusz";
	private final Random rand = new Random();

	/**
	 * Konstruktory.
	 */

	public Player() {
	}

	public Player(String name) {
		setName(name);
	}

	public abstract int guess(); // tworzenie klasy abstrakcyjnej, cala klasa rowniez musi byc abstrakcyjna

	/**
	 * Geter pola name.
	 * 
	 * @return imię gracza
	 */
	public String getName() {
		return name;
	}

	/**
	 * Seter pola name.
	 * 
	 * Sprawdza poprawność danych (nie null i niepuste).
	 * 
	 * @param name imię gracza
	 */
	public void setName(String name) {
		if (name != null && !name.isEmpty()) {
			this.name = name;
		}
	}

}