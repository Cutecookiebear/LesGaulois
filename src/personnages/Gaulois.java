package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(Gaulois gaulois,String texte) {
		System.out.println(prendreParole(gaulois.getNom()) + "< " + texte + " >");
	}

	public static String prendreParole(String nom) {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Gaulois gaulois,Romain romain) {
		System.out.println(gaulois.getNom() + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup(romain,force / 3);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
public static void main(String[] args) {
}

}
		
		
