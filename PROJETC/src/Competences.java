
import java.util.*;

public class Competences {

	public Competences() {
	}

	private String name;

	private int nombre;

	private int Lvl;

	public void AjouterCompetences() {
		// TODO implement here
	}

	public void SuprimeCompetences() {
		// TODO implement here
	}

	public void MajCompetences() {
		// TODO implement here
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Lvl;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + nombre;
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
		Competences other = (Competences) obj;
		if (Lvl != other.Lvl)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nombre != other.nombre)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getLvl() {
		return Lvl;
	}

	public void setLvl(int lvl) {
		Lvl = lvl;
	}

}
