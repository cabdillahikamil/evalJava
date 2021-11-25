package personnage;

public interface IPersonnage {
	
	public void frapper(Personnage personnage);
	
	//public void subirDegats();
	
	public void seSoigner();
	
	public void seProteger();
	
	public boolean estVivant();
	
	public String toString();

}
