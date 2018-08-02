
import java.util.*;

public class Metier {

	public Metier() {
	}

	private String name;

	private int ID;

	private int DateDebut;

	private int DateFin;

	private String Type;

	public void AjouterMetier() {
		// TODO implement here
	}

	public void SuprimeMetier() {
		// TODO implement here
	}

	public void MajMetier() {
		// TODO implement here
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DateDebut;
		result = prime * result + DateFin;
		result = prime * result + ID;
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Metier other = (Metier) obj;
		if (DateDebut != other.DateDebut)
			return false;
		if (DateFin != other.DateFin)
			return false;
		if (ID != other.ID)
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getDateDebut() {
		return DateDebut;
	}

	public void setDateDebut(int dateDebut) {
		DateDebut = dateDebut;
	}

	public int getDateFin() {
		return DateFin;
	}

	public void setDateFin(int dateFin) {
		DateFin = dateFin;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

}