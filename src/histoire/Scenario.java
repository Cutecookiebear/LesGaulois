package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

     public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 9);
		Romain minus = new Romain("Minus",7);
		Gaulois.parler(asterix,"Bonjour à tous");
		Romain.parler(minus,"UN GAU... UN GAUGAU...");
		while(minus.getForce() >0) {
		Gaulois.frapper(asterix,minus);
		}

	}


}
