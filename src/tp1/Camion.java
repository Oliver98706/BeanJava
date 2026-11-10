package tp1;

public class Camion extends Vehicule {
		double charge_max;

		public Camion(String matricule, String marque, int annee, double charge_max) {
			super(matricule, marque, annee);
			this.charge_max = charge_max;
		}
		
		@Override
		public double calculerTarifLocation(int jour) {
			return (5000 * jour) + (200 * this.charge_max);
		}
		
		public void afficherInfos()
		{
			super.afficherInfos();
			System.out.println("la charge max est " + this.charge_max);
		}

		public double getCharge_max() {
			return charge_max;
		}

		public void setCharge_max(double charge_max) {
			this.charge_max = charge_max;
		}
		
		
		
		
}
