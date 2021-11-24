package personnage;

public class Mage extends Personnage {
	
	private boolean soins;

	public Mage(String nom, int pointsDevie, boolean soins) {
		super(nom, pointsDevie);
		this.soins = soins;
	}

	public boolean hasSoins() {
		return soins;
	}

	public void setSoins(boolean soins) {
		this.soins = soins;
	}

	public void frapper(Personnage personnage) {
		// TODO Auto-generated method stub
		
	}

	public void subirDegats(int degats) {
		// TODO Auto-generated method stub
		
	}

	public void seSoigner(int degats) {
		// TODO Auto-generated method stub
		
	}

	public boolean estVivant() {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
