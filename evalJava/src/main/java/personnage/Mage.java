package personnage;

public class Mage extends Personnage {
	

	public Mage(String nom, int pointsDevie) {
		super(nom, pointsDevie);
	}

@Override
	public void seSoigner() {
	 this.setPointsDeVie(getPointsDeVie() + 1);
		System.out.println(this.getNom() + " a ,maintenant "+ getPointsDeVie() + " Points de vie ");
	}
	

}
