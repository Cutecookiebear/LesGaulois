package personnages;

import java.util.Random;
import java.util;
public class Druide {
	private String nom;
	private static int effetPotionMin;
	private static int effetPotionMax;
	private int forcePotion=1;

public Druide(String nom, int effetPotionMin, int effetPotionMax) {
this.nom = nom;
this.effetPotionMin = effetPotionMin;
this.effetPotionMax = effetPotionMax;
parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � "
+ effetPotionMax + ".");
}

	public String getNom() {
		return nom;
	}

	public static void parler(Druide druide,String texte) {
		System.out.println(prendreParole(druide.nom) + "� " + texte + "�");
	}

	private static String prendreParole(String nom) {
		return "Le druide " + nom + " : ";
	}
	
	public static void preparerPotion(Druide druide) {
		Random random = new Random();
		int effet = random.nextInt(druide.effetPotionMin,druide.effetPotionMax);
		if (effet>7) {
			parler(druide,"< J'ai préparé une super potion de force " + effet + " >");
		}
		else {
			parler(druide,"< Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force" + effet + " >");
		}
		
	}
	
	
	
	public static void main() {
		Druide panoramix = new Druide("Panoramix",5,10);
		preparerPotion(panoramix);
	}
	
	
}
