package personnage;

public class Archer extends Personnage{

	public Archer(String nom, int pointsDevie) {
		super(nom, pointsDevie);
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

	@Override
	public String toString() {
		return "Archer [estVivant()=" + estVivant() + "]";
	}
	
	

}
