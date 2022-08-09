package it.epicode.be.trasporti.model.veicoli;

import java.time.LocalDate;

public class Manutenzione {

	private Mezzo mezzo;
	
	private LocalDate dataInizio;
	
	private LocalDate dataFine;

	public Manutenzione(Mezzo mezzo, LocalDate dataInizio, LocalDate dataFine) {
		
		this.mezzo = mezzo;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		
	}

	public Manutenzione() {

	}

	public Mezzo getMezzo() {
		return mezzo;
	}

	public void setMezzo(Mezzo mezzo) {
		this.mezzo = mezzo;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public LocalDate getDataFine() {
		return dataFine;
	}

	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	
	
	
	
	
}
