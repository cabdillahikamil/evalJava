package personnage;

public class Chevalier extends Personnage{
	
	
	public Chevalier(String nom, int pointsDeVie) {
		super(nom, pointsDeVie);
	}

	@Override
	public void seProteger() {
		//int pointAvantFrappe = this.getPointsDeVie()+ degats;-
		this.setPointsDeVie(100);
		System.out.println(this.getNom() + " a ,maintenant "+ getPointsDeVie() + " Points de vie ");
	}


}
