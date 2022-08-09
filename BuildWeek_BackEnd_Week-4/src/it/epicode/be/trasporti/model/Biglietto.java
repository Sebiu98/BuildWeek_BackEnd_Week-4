package it.epicode.be.trasporti.model;

import java.time.LocalDate;

public class Biglietto extends TitoliViaggio {

	private boolean status;

	public Biglietto(Integer id, LocalDate dataInizio, double prezzo, boolean status) {
		super(id, dataInizio, prezzo);
		this.status = status;
	}

	public Biglietto() {
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Biglietto [status=" + status + "]";
	}

}
