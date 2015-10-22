package perso;

public class EnseignantChercheur extends Enseignant implements IChercheur{


	//Implémenter les classes EnseignantChercheur à partir de l'interface IChercheur
	//et la classe Enseignant. Utiliser un tableau pour stocker les publications 

	private Publication Publications[] ;

	private int numPub ;
	private String Liste_Pub = new String();
	
	//Constructor
	public EnseignantChercheur(String nom, int age, int heures) {
		super(nom, age, heures);

		Publications = new Publication[10];   //max 10 publications
		this.numPub = 0;
		Liste_Pub = new String();
	}

	@Override
	public void ajouterPublication(Publication p) {

		if(this.numPub < 10)
		{
			this.Publications[numPub] = p ;
			numPub++;
		}
		else
		{
			System.out.println("On a déjà atteint le nb de publications maximum") ;
		}


	}

	@Override
	public String listerPublications() {



		for(int i=0; i < this.numPub ;i++ )
		{
			Liste_Pub += ((this.Publications[i]).toString() + ", ");
			//Liste_Pub.concat((this.Publications[i]).toString() + ", ");
		}

		return Liste_Pub;
	} 

	public String getMaclasse()
	{
		return "Enseignant chercheur";
		
	}

	public String toString()
	{

		return (super.toString() + " et j'ai publié " + this.listerPublications() );

	}
}
