import java.util.Scanner;

import personnage.Archer;
import personnage.Chevalier;
import personnage.Mage;

public class Application {

	public static void main(String[] args) {
		
		Archer archer = new Archer("Abdo", 100);
		Mage mage = new Mage("Keita", 100);
		Chevalier chevalier = new Chevalier("Alex", 100);
		
		
		 
		 archer.frapper(mage);
		 mage.seSoigner();
		 mage.frapper(chevalier);
		 chevalier.seProteger();
		 mage.frapper(chevalier);
		 mage.frapper(mage);
	}

}
