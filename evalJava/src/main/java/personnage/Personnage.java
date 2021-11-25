package personnage;

public  abstract class Personnage implements IPersonnage{
	
	private String nom;
	private int pointsDeVie;
	//private boolean seProteger;
	//private boolean seSoigner;
	
	public Personnage(String nom, int pointsDeVie) {
		this.nom = nom;
		this.pointsDeVie = pointsDeVie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointsDeVie() {
		return pointsDeVie;
	}

	public void setPointsDeVie(int pointsDeVie) {
		this.pointsDeVie = pointsDeVie;
	}
	
	public void seSoigner() {
		System.out.println(this + " a ,maintenant "+ getPointsDeVie() + " Points de vie ");
	}
	
	public void seProteger() {
		System.out.println(this.getNom() + " a ,maintenant "+ getPointsDeVie() + " Points de vie ");
	}
	
	public boolean estVivant() {
		
		return this.getPointsDeVie() > 0;
	}
	

	/*public void subirDegats() {
		int  degats = (int)(Math.random() * 10);
		
		 this.setPointsDeVie(this.getPointsDeVie() - degats);
		
	}*/
	
	public void frapper(Personnage personnage) {
		
			int  degats = (int)(Math.random() * 10);
	        if(this !=personnage) {
	        	personnage.setPointsDeVie(personnage.getPointsDeVie() - degats);
	        	System.out.println("Aie Aie, " + personnage.getNom() + " a maintenant " + personnage.getPointsDeVie() + " Points de vie");
	        }
	        else {
	        	System.out.println(this.getNom() + " ne peux pas se frapper lui-même.");
	        }
	        if(! personnage.estVivant())
	        {
	        	System.out.println(personnage.getNom() + " est décédé ce n'est plus la peine de l'attaquer");
	        }
	}

	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", pointsDeVie=" + pointsDeVie + ", getNom()=" + getNom()
				+ ", getPointsDeVie()=" + getPointsDeVie() + ", estVivant()=" + estVivant() + "]";
	}
	
	
}
