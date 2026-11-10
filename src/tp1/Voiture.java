package tp1;

public class Voiture extends Vehicule{

		int nb_places;

		public Voiture(String matricule, String marque, int annee, int nb_places) {
			super(matricule, marque, annee);
			this.nb_places = nb_places;
		}
		
		public double calculerTarifLocation(int jour) {
			return (3000 * jour) + (100 * nb_places);
		}
		
		public void afficherInfos()
		{
			super.afficherInfos(); //donc ici en fait attention il faut ajouter super pour faire initialiser la methode du n'autre classe .  
		}

		public int getNb_places() {
			return nb_places;
		}

		public void setNb_places(int nb_places) {
			this.nb_places = nb_places;
		}
		
		
		
}
