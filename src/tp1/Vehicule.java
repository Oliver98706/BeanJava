package tp1;

abstract class Vehicule {
		private String Matricule;
		private String Marque ;
		private int annee;
		
		
		public Vehicule(String matricule, String marque, int annee) {
			super();
			Matricule = matricule;
			Marque = marque;
			this.annee = annee;
		}
		
		public void afficherInfos()
		{
			System.out.println(" Le matricule du vehicule est : " + this.Matricule);
			System.out.println(" La marque  du vehicule est : " + this.Marque);
			System.out.println(" L'anne  du vehicule est : " + this.annee);
		}
		
		public abstract double calculerTarifLocation(int jour); // il faut pas ajouter un body ici ( {} not ) 	
		
		
}
