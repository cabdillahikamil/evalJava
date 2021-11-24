package personnage;

public  abstract class Personnage implements IPersonnage{
	
	private String nom;
	private int pointsDevie;
	//private boolean seProteger;
	//private boolean seSoigner;
	
	public Personnage(String nom, int pointsDevie) {
		this.nom = nom;
		this.pointsDevie = pointsDevie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPointsDevie() {
		return pointsDevie;
	}

	public void setPointsDevie(int pointsDevie) {
		this.pointsDevie = pointsDevie;
	}
	
	
	
}
