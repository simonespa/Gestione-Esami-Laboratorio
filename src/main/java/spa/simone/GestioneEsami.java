package spa.simone;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Simone Spaccarotella {spa.simone@gmail.com}
 */
public class GestioneEsami {

	private List<Prestazione> prestazioniMediche;
	private List<Dottore> dottori;
	private List<Paziente> pazienti;

	public GestioneEsami() {
		prestazioniMediche = new LinkedList<Prestazione>();
		dottori = new LinkedList<Dottore>();
		pazienti = new LinkedList<Paziente>();
	}

	public int incassoGiornaliero(Date dataInizio, Date dataFine) {
		int incassoGiornaliero = 0;
		for (Prestazione prestazione : prestazioniMediche) {
			Date data = prestazione.getDataConsegna();
			if (data != null && data.compareTo(dataInizio) >= 0 && data.compareTo(dataFine) <= 0) {
				incassoGiornaliero += prestazione.getIncasso();
			}
		}
		return incassoGiornaliero;
	}

	public LinkedList<EsameClinico> dammiReferti(Paziente paziente) {
		LinkedList<EsameClinico> esamiClinici = new LinkedList<EsameClinico>();
		for (Prestazione prestazione : prestazioniMediche) {
			if (prestazione.getPaziente().equals(paziente)) {
				if (prestazione.getDataConsegna() == null) {
					esamiClinici.addAll(prestazione.getEsamiClinici());
					prestazione.setDataConsegna(new Date());
				}
			}
		}
		return esamiClinici;
	}

	public static void main(String[] args) {
		
	}

}
