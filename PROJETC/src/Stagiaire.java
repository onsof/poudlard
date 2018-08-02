
import java.util.*;

public class Stagiaire {

	public Stagiaire() {
	}

	private String Nom;

	private int DateNaissance;

	private int Age;

	private Boolean Genre;

	private int ID;

	public void CreeCompte() {
		// TODO implement here
	}

	public void Visualisation() {
		// TODO implement here
	}

	public void Authentification() {
		// TODO implement here
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Age;
		result = prime * result + DateNaissance;
		result = prime * result + ((Genre == null) ? 0 : Genre.hashCode());
		result = prime * result + ID;
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stagiaire other = (Stagiaire) obj;
		if (Age != other.Age)
			return false;
		if (DateNaissance != other.DateNaissance)
			return false;
		if (Genre == null) {
			if (other.Genre != null)
				return false;
		} else if (!Genre.equals(other.Genre))
			return false;
		if (ID != other.ID)
			return false;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		return true;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getDateNaissance() {
		return DateNaissance;
	}

	public void setDateNaissance(int dateNaissance) {
		DateNaissance = dateNaissance;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public Boolean getGenre() {
		return Genre;
	}

	public void setGenre(Boolean genre) {
		Genre = genre;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

}