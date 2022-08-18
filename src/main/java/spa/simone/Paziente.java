package spa.simone;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public class Paziente extends Persona {

	private String codTesseraSanitaria;

	public String getCodTesseraSanitaria() {
		return codTesseraSanitaria;
	}

	public void setCodTesseraSanitaria(String codTesseraSanitaria) {
		this.codTesseraSanitaria = codTesseraSanitaria;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((codTesseraSanitaria == null) ? 0 : codTesseraSanitaria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Paziente))
			return false;
		Paziente other = (Paziente) obj;
		if (codTesseraSanitaria == null) {
			if (other.codTesseraSanitaria != null)
				return false;
		} else if (!codTesseraSanitaria.equals(other.codTesseraSanitaria))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Paziente [codTesseraSanitaria=").append(codTesseraSanitaria)
				.append(", codiceFiscale=").append(getCodiceFiscale()).append(", nome=")
				.append(getNome()).append(", cognome=").append(getCognome()).append(", dataNascita=")
				.append(getDataNascita()).append("]");
		return builder.toString();
	}

}