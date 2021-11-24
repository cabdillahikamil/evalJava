package personnage;

public class Chevalier extends Personnage{
	
	private boolean protection;

	public Chevalier(String nom, int pointsDevie, boolean protection) {
		super(nom, pointsDevie);
		this.protection = protection;
	}
	
	


	public boolean hasProtection() {
		return protection;
	}




	public void setProtection(boolean protection) {
		this.protection = protection;
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
