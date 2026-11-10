package tp1;
import java.util.*;

public class TestVehicules {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Vehicule vehicules[] = new Vehicule[5];
		
		int nb = 0;
		int choix;
		
	      do {

	            System.out.println("\n--- Menu Agence de Location ---");
	            System.out.println("1. Ajouter un véhicule");
	            System.out.println("2. Modifier les infos de location d'un véhicule");
	            System.out.println("3. Afficher tous les véhicules");
	            System.out.println("4. Quitter");

	            System.out.print("Choix : ");
	            choix = sc.nextInt();
	            sc.nextLine();

	            switch (choix) {

	                case 1:

	                    if (nb < vehicules.length) {

	                        System.out.print("Type (1-Voiture, 2-Camion) : ");
	                        int type = sc.nextInt();
	                        sc.nextLine();

	                        System.out.print("Matricule : ");
	                        String matricule = sc.nextLine();

	                        System.out.print("Marque : ");
	                        String marque = sc.nextLine();

	                        System.out.print("Année : ");
	                        int annee = sc.nextInt();

	                        if (type == 1) {

	                            System.out.print("Nombre de places : ");
	                            int nb_places = sc.nextInt();

	                            vehicules[nb] = new Voiture(
	                                    matricule, marque, annee, nb_places);

	                            nb++;

	                        } else if (type == 2) {

	                            System.out.print("Charge maximale (en tonnes) : ");
	                            double charge_max = sc.nextDouble();

	                            vehicules[nb] = new Camion(
	                                    matricule, marque, annee, charge_max);

	                            nb++;

	                        } else {

	                            System.out.println("Type invalide.");
	                        }

	                    } else {

	                        System.out.println("Le tableau est plein.");
	                    }

	                    break;

	                case 2:

	                    if (nb == 0) {

	                        System.out.println("Aucun véhicule enregistré.");

	                    } else {

	                        System.out.print("Entrez l'index du véhicule à modifier (0 à "
	                                + (nb - 1) + ") : ");

	                        int index = sc.nextInt();

	                        if (index >= 0 && index < nb) {

	                            if (vehicules[index] instanceof Voiture) {

	                                System.out.print("Nouveau nombre de places : ");
	                                int nb_places = sc.nextInt();

	                                ((Voiture) vehicules[index]).setNb_places(nb_places);

	                            } else if (vehicules[index] instanceof Camion) {

	                                System.out.print("Nouvelle charge maximale (en tonnes) : ");
	                                double charge_max = sc.nextDouble();

	                                ((Camion) vehicules[index]).setCharge_max(charge_max);
	                            }

	                            System.out.println("Modification effectuée avec succès.");

	                        } else {

	                            System.out.println("Index invalide.");
	                        }
	                    }

	                    break;

	                case 3:

	                    if (nb == 0) {

	                        System.out.println("Aucun véhicule enregistré.");

	                    } else {

	                        for (int i = 0; i < nb; i++) {

	                            System.out.println("\nVéhicule #" + i + ":");

	                            vehicules[i].afficherInfos();
	                        }
	                    }

	                    break;

	                case 4:

	                    System.out.println("Fermeture du programme.");

	                    break;

	                default:

	                    System.out.println("Choix invalide.");
	            }

	        } while (choix != 4);

	        
	    }
	

	}
