
/**
 * Class Admin herite de la classe User
 * @author Soni
 *
 */
public class Admin extends User{
	
	
	 // Constructeurs
	 
	
	/**
	 * @param login
	 * @param password
	 */
	public Admin (String login, String password) {
		super(login, password);
		super.Enregistrer();
		
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param profession
	 */
	public Admin (String nom, String prenom, String profession) {
		super(nom, prenom, profession);
		System.out.println(super.nom);
	}
	
	
	//  Redefinition de la methode Connecter
	
	/*
	 * (non-Javadoc)
	 * @see User#Connecter()
	 */
	public void Connecter(){
		System.out.println(" Connexion de l'administrateur " );	
		super.Connecter();
	}

	
	// Methode consulterPlateforme();
	
	public void consulterPlateforme(){
		System.out.println("L'abonné " + this.nom +"" +this.prenom + "consulte la plateforme");	
	}

}
