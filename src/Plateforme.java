import java.util.Scanner;

/**
 * Plateforme est la classe principale du projet
 * 
 * @author soni
 *
 */
public class Plateforme {

	public static void main(String[] args) {
	
	// Creation d'un objet u par instanciation de la Classe User
	User u = new User();
	
	// Creation d'un objet sc pour lire les chaines de caractères
	Scanner sc = new Scanner(System.in); 
			
	
	// Affichage du menu principal
	
		System.out.println (" *** Bienvenue dans mon application de Gestion de Comptes Bancaires *** ");
		System.out.println ("A. Enregistrement");
		System.out.println ("B. Connexion");
		System.out.println ("C. Selection d'une banque");
		System.out.println ("D. Ouverture de Compte");
		System.out.println ("E. Consultation de la fiche client");
		System.out.println ("Taper A, B, C, D ou E");							
		
		
		//declaration et affectation de la reponse de l'utilisateur dans une variable de type caractere
		char choix= sc.nextLine().charAt(0);
				
		
		//Tant que la réponse donnée est égale à oui…
		while (choix == 'A' || choix ==  'B' || choix ==  'C' || choix ==  'D' || choix == 'E'){
			
			switch (choix){
			
			case 'A':
				
				//Appel de la methode qui permettra d'enregistrer un utilisateur
				 
				u.Enregistrer();
				break;
			case 'B':
				
				//Appel de la methode qui permettra à un utilisateur de se connecter 	 
				u.Connecter();
				break;
			case 'C':
				
				//Selectionner une banque 
				 
				System.out.println("Selection d'une banque");
				break;
			case 'D':
				
				//Remplir le formulaire d'ouverture de compte
				 
				System.out.println("Ouverture de Compte");
				break;
			case 'E':
				
				//Afficher la fiche client 
				System.out.println("Consulter votre fiche client");
				break;
			default:
				//Message par defaut
				 
				System.out.println("Merci");
			}
			
			//Refaire un essai
			System.out.println("Retour au menu. Faites votre choix en entrant A, B, C, D ou E et N pour sortir"); 
			
			 //Recuperation dans la variable choix de la réponse saisie par l'utilisateur	 
		  choix = sc.nextLine().charAt(0);
		  } 	  
		
		  //Quitter la plateforme
		  System.out.println("Quitter");		
		}
	
}
