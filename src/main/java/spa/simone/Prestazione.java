package spa.simone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public class Prestazione {

	private String codice;
	private Date dataEffettuazione;
	// può essere null se il paziente non ha effettuato il ritiro
	private Date dataConsegna;
	private Paziente paziente;
	private List<EsameClinico> esamiClinici;

	public Prestazione() {
		esamiClinici = new ArrayList<EsameClinico>();
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Date getDataEffettuazione() {
		return dataEffettuazione;
	}

	public void setDataEffettuazione(Date dataEffettuazione) {
		this.dataEffettuazione = dataEffettuazione;
	}

	public Date getDataConsegna() {
		return dataConsegna;
	}

	public void setDataConsegna(Date dataConsegna) {
		this.dataConsegna = dataConsegna;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public List<EsameClinico> getEsamiClinici() {
		Collections.sort(esamiClinici);
		return esamiClinici;
	}

	public void setEsamiClinici(List<EsameClinico> esamiClinici) {
		this.esamiClinici = esamiClinici;
	}

	/**
	 * Restituisce il costo (per il paziente) della prestazione, calcolato su
	 * tutti gli esami clinici effettuati non in esenzione.
	 */
	public float getCosto() {
		float costoTotale = 0;
		for (EsameClinico e : esamiClinici) {
			if (!e.isEsente()) {
				costoTotale += e.getCosto();
			}
		}
		return costoTotale;
	}

	/**
	 * Restituisce il ricavo (per il laboratorio) della prestazione. Viene
	 * calcolato sul costo di tutti gli esami clinici effettuati (anche quelli
	 * non in esenzione, perché vengono rimborsati).
	 */
	public float getIncasso() {
		float incasso = 0;
		for (EsameClinico e : esamiClinici) {
			incasso += e.getCosto();
		}
		return incasso;
	}

}