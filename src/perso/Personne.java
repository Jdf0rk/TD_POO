package perso;


public class Personne {

	private String nom;
	private int age;



	public Personne(String nom, int age)
	{
		setAge(age);
		setNom(nom);
	}



	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public String getMaclasse()
	{
		return "Personne";
		
	}
	
	public String toString()
	{
		return ("I'am a " + this.getMaclasse() + " my name is " + this.getNom() + " i am " + this.getAge() + "years old." );
		
	}

}
