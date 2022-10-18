package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion=1;

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
this.nom = nom;
this.effetPotionMin = effetPotionMin;
this.effetPotionMax = effetPotionMax;

}

	public String getNom() {
		return nom;
	}

	public void parler(Druide druide,String texte) {
		System.out.println(prendreParole(druide.nom) + "� " + texte + "�");
	}

	private String prendreParole(String nom) {
		return "Le druide " + nom + " : ";
	}
	
	public void preparerPotion(Druide druide) {
		Random random = new Random();
		int effet = random.nextInt(druide.effetPotionMax);
		if (effet>7) {
			parler(druide,"< J'ai préparé une super potion de force " + effet + " >");
		}
		else {
			parler(druide,"< Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + effet + " >");
		}
		
	}
	
	
	
	public static void main() {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler(panoramix,"Bonjour, je suis le druide " + panoramix.nom + " et ma potion peut aller d'une force " + panoramix.effetPotionMin + " � "
+ panoramix.effetPotionMax + ".");
		panoramix.preparerPotion(panoramix);
	}
	
	
}
