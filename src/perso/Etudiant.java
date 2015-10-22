package perso;


public class Etudiant extends Personne{

	private float note;

	public Etudiant(String nom, int age, float note) {
		super(nom, age);
		setNote(note);
	}

	public float getNote() {
		return note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public String getMaclasse()
	{
		return "Etudiant";
		
	}
	
	public String toString()
	{
		return (super.toString()+ "years old and my mark is " + this.getNote() );
		
	}

}
