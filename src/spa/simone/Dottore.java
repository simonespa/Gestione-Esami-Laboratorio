package spa.simone;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public class Dottore extends Persona {

	private Mansione mansione;

	public Mansione getMansione() {
		return mansione;
	}

	public void setMansione(Mansione mansione) {
		this.mansione = mansione;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mansione == null) ? 0 : mansione.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Dottore))
			return false;
		Dottore other = (Dottore) obj;
		if (mansione != other.mansione)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dottore [mansione=").append(mansione).append(", codiceFiscale=")
				.append(getCodiceFiscale()).append(", nome=").append(getNome()).append(", cognome=")
				.append(getCognome()).append(", dataNascita=").append(getDataNascita()).append("]");
		return builder.toString();
	}

}