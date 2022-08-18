package spa.simone;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public class EsameClinico implements Comparable<EsameClinico> {

	private String codice;
	private TipoEsame tipo;
	private float costo;
	private boolean esente;
	private String risultatoReferto;
	private Dottore dottore;

	public EsameClinico() {
		// per default non sono esenti.
		esente = false;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public TipoEsame getTipo() {
		return tipo;
	}

	public void setTipo(TipoEsame tipo) {
		this.tipo = tipo;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public boolean isEsente() {
		return esente;
	}

	public void setEsente(boolean esente) {
		this.esente = esente;
	}

	public String getRisultatoReferto() {
		return risultatoReferto;
	}

	public void setRisultatoReferto(String risultatoReferto) {
		this.risultatoReferto = risultatoReferto;
	}

	public Dottore getDottore() {
		return dottore;
	}

	public void setDottore(Dottore dottore) {
		this.dottore = dottore;
	}

	@Override
	public int compareTo(EsameClinico o) {
		if (this.costo < o.costo) {
			return -1;
		} else if (this.costo > o.costo) {
			return +1;
		} else {
			return this.codice.compareTo(o.codice);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		result = prime * result + Float.floatToIntBits(costo);
		result = prime * result + ((dottore == null) ? 0 : dottore.hashCode());
		result = prime * result + (esente ? 1231 : 1237);
		result = prime * result + ((risultatoReferto == null) ? 0 : risultatoReferto.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		EsameClinico other = (EsameClinico) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		if (Float.floatToIntBits(costo) != Float.floatToIntBits(other.costo))
			return false;
		if (dottore == null) {
			if (other.dottore != null)
				return false;
		} else if (!dottore.equals(other.dottore))
			return false;
		if (esente != other.esente)
			return false;
		if (risultatoReferto == null) {
			if (other.risultatoReferto != null)
				return false;
		} else if (!risultatoReferto.equals(other.risultatoReferto))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}

}