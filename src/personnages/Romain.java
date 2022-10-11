package personnages;

public class Romain {
	private String nom;
	private static int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	

	public static void parler(Romain romain,String texte) {
		System.out.println(prendreParole(romain.getNom()) + "< " + texte + " >");
	}

	public static String prendreParole(String nom) {
		return "Le romain " + nom + " : ";
	}

	public static void recevoirCoup(Romain romain,int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler(romain,"Aïe");
		} else {
			parler(romain,"J'abandonne...");
		}
	}
	
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
		
	}
	
	public static void main(String[] args) {
		
}
}
