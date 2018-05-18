import java.util.Scanner;

/**
 * Classe User
 * @author Soni
 *
 */
public class User {
	
	// Attributs
	protected int identifiant;
	protected String nom;
    protected String prenom;
    protected int age;
    protected String cin;
    protected String profession;
    protected int telephone;
    protected String email;
    protected String adresse;
    protected String login;
	protected String passeword;
	
	
	
	
	// Getters & Setters
	
	/**
	 * @return identifiant
	 */
	public int getIdentifiant() {
		return identifiant;
	}
	
	/**
	 * @param identifiant
	 */
	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}
	
	/**
	 * @return 
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * @return 
	 */
	public String getPrenom() {
		return prenom;
	}
	
	/**
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**
	 * @return 
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return 
	 */
	public String getCin() {
		return cin;
	}
	
	/**
	 * @param cin
	 */
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	/**
	 * @return 
	 */
	public String getProfession() {
		return profession;
	}
	
	/**
	 * @param profession
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	/**
	 * @return 
	 */
	public int getTelephone() {
		return telephone;
	}
	
	/**
	 * @param telephone
	 */
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * @return 
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * @return 
	 */
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * @return 
	 */
	public String getLogin() {
		return login;
	}
	
	/**
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}
	
	/**
	 * @return 
	 */
	public String getPasseword() {
		return passeword;
	}
	
	/**
	 * @param passeword
	 */
	public void setPasseword(String passeword) {
		this.passeword = passeword;
	}
	
	
	
	
	
	/**
	 * Constructeurs
	 */
	
	public User() {
		super();
	}
	
	/**
	 * @param nom
	 * @param prenom
	 */
	public User(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	

	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 */
	public User(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
	/**
	 * @param nom
	 * @param prenom
	 * @param profession
	 */
	public User(String nom, String prenom, String profession) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.profession = profession;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param passeword
	 */
	public User(String nom, String prenom, String login, String passeword) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.passeword = passeword;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param profession
	 * @param email
	 * @param adresse
	 */
	public User(String nom, String prenom, String profession, String email, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.profession = profession;
		this.email = email;
		this.adresse = adresse;
	}
	
	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param cin
	 * @param profession
	 * @param telephone
	 * @param email
	 * @param adresse
	 */
	public User(String nom, String prenom, int age, String cin, String profession, int telephone,
			String email, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cin = cin;
		this.profession = profession;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
	}
		
	/**
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param cin
	 * @param profession
	 * @param telephone
	 * @param email
	 * @param adresse
	 * @param login
	 * @param passeword
	 */
	public User(String nom, String prenom, int age, String cin, String profession, int telephone, String email,
			String adresse, String login, String passeword) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cin = cin;
		this.profession = profession;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.login = login;
		this.passeword = passeword;
	}
	
	
	/**
	 * @param identifiant
	 * @param nom
	 * @param prenom
	 * @param age
	 * @param cin
	 * @param profession
	 * @param telephone
	 * @param email
	 * @param adresse
	 * @param login
	 * @param passeword
	 */
	public User(int identifiant, String nom, String prenom, int age, String cin, String profession, int telephone,
			String email, String adresse, String login, String passeword) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.cin = cin;
		this.profession = profession;
		this.telephone = telephone;
		this.email = email;
		this.adresse = adresse;
		this.login = login;
		this.passeword = passeword;
	}
	
   
	/**
	 * Methode d'enregistrement d'un utilisateur
	 *
	 */
	public void Enregistrer() {
		// Affichage d'une instruction
    	System.out.println("Souhaitez-vous vous enregistrer? (O/N)");
    	
    	// Declaration de la reponse de l'utilisateur 
    	char reponse = 'O';		
    	
    	// Instanciation de l'objet sc de type Scanner
    	Scanner sc = new Scanner(System.in);	
    	
    	// Recuperation de la réponse de l'utilisateur dans une variable de type caractere
    	reponse = sc.nextLine().charAt(0);		
    								
    	if (reponse == 'O') {
    	// Affichage d'une instruction
    		System.out.println("Veuillez saisir le formulaire suivant pour votre enregistrement ");
    		
    	// Saisie des donnees de l'utilisateur						 
    		System.out.print("Nom: ");
    		setNom(sc.nextLine());
    							  
    		System.out.print("Prenom: ");
    		setPrenom(sc.nextLine());			
    							  		  
    		System.out.print("Telephone: ");
    		setTelephone(sc.nextInt());
    		sc.nextLine();
    								  
    		System.out.print("Profession: ");
    		setProfession(sc.nextLine());
    								  
    		System.out.print("Username: ");
    		setLogin(sc.nextLine()); 
    								  
    		System.out.print("Mot de passe: ");
    		setPasseword(sc.nextLine());
    		
    		// Affichage d'instructions
    		System.out.println("Verifiez les donnees saisies");
    											 
    		System.out.println("Le nom de l'utilisateur est :" + getNom() );
    		System.out.println("Le prenom de l'utilisateur:" + getPrenom() );
    		System.out.println("le numero de telephone :" + getTelephone());
    		System.out.println("la profession :" + getProfession());
    							  
    		System.out.print("Les donnees sont correctes.");
    		System.out.println(" Vous etes maintenant enregistres.");
    					
    			}
    											
    			else {
    					System.out.println("Voulez-vous reessayer?");
    			}	  	
    }
	
	
	 
	/**
	 * Methode de Connexion
	 *
	 */
	
	public void Connecter() {
			
		    System.out.println("Voulez-vous vous connecter? (O/N)");
			char reponse = 'O';		
			Scanner sc = new Scanner(System.in);	
			//On récupère la réponse de l'utilisateur
			reponse = sc.nextLine().charAt(0);
			
			if (reponse == 'O') {
																	
			System.out.println("Saisissez vos identifiants: ");	
					
					// Saisie du login et passeword 
					System.out.print("Login : ");
					String log  = sc.nextLine();
					System.out.print("Pwd : ");
					String pwd = sc.nextLine();	
					
				
					// Verification de la conformité des identifiants entrés à l'inscription et ceux saisis au moment de la connexion			
					while(!log.equals(getLogin()) && !pwd.equals(getPasseword())) {
						 	System.out.println("Veuillez reessayer");
						 	System.out.print("Login : ");
							log  = sc.nextLine();
							System.out.print("Pwd : ");
							pwd = sc.nextLine();		
					 		}
					 
					System.out.print("Connexion reussie");
					}
					else {
							System.out.println("Aurevoir");
					}			
	}

}
