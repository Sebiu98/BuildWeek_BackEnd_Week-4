package it.epicode.be.trasporti.model.biglietteria;

import java.time.LocalDate;
import javax.persistence.Entity;

import it.epicode.be.trasporti.model.Utente;

@Entity
public class Abbonamento extends TitoliViaggio {

	private DurataAbbonamento durataAbonamento;

	private Utente utente;

	public Abbonamento(Integer id, LocalDate dataInizio, double prezzo, DurataAbbonamento durataAbonamento,
			Utente utente) {
		super(id, dataInizio, prezzo);
		this.durataAbonamento = durataAbonamento;
		this.utente = utente;
	}

	public Abbonamento() {
	}

	public DurataAbbonamento getDurataAbonamento() {
		return durataAbonamento;
	}

	public void setDurataAbonamento(DurataAbbonamento durataAbonamento) {
		this.durataAbonamento = durataAbonamento;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	@Override
	public String toString() {
		return "Abbonamento [durataAbonamento=" + durataAbonamento + ", utente=" + utente + "]";
	}

}
