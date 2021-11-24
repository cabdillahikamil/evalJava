package personnage;

public interface IPersonnage {
	
	public void frapper(Personnage personnage);
	
	public void subirDegats(int degats);
	
	//public void seProtéger();
	
	public void seSoigner(int degats);
	
	public boolean estVivant();
	
	public String toString();

}
