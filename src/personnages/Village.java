package personnages;

import javafx.scene.control.Tab;

public class Village {
	
		private String nom;
		private Chef chef;
		private Gaulois[] villageois;
		private int nbVillageois=0;
		
		public Village(int nbVillageoisMaximum, String nom) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
		}
		
		
		public void setChef(Chef chef) {
		this.chef = chef;
		}
		
		public void ajouterHabitant (Gaulois gaulois) {
        villageois[nbVillageois] = gaulois;
        nbVillageois += 1;
		}
		
		public int getNbVillageois() {
			return nbVillageois;
		}
		
		public Gaulois trouverHabitant(int numVillageois) {
			return villageois[numVillageois];			
		}
		
		public void afficherVillageois(Village village) {
			System.out.println("Dans le " + village.nom + " du chef " + village.chef.getNom() + " vivent les légendaires gaulois : \n");
			for(int i=0;i<village.getNbVillageois();i++) {
				
				System.out.println("- " + (village.villageois[i]).getNom() + "\n");
			}
			
		}
		public static void main(String[] args) {
			Village village = new Village(30,"Village des Irréductibles");
			Chef chef = new Chef("Abraracourcix",6,village);
			village.setChef(chef);
			Gaulois asterix = new Gaulois("Astérix",8);
			village.ajouterHabitant(asterix);
			Gaulois obelix = new Gaulois("Obélix",10);
			village.ajouterHabitant(obelix);
			village.afficherVillageois(village);
						
		}
}
