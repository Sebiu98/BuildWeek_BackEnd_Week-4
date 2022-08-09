package it.epicode.be.trasporti.model;

import java.time.LocalDate;

public abstract class TitoliViaggio {
	
	private Integer id;
	
	private LocalDate dataInizio;

	private double prezzo;

	public TitoliViaggio(Integer id, LocalDate dataInizio, double prezzo) {
		this.id = id;
		this.dataInizio = dataInizio;
		this.prezzo = prezzo;
	}

	public TitoliViaggio() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	
	
}
