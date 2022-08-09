package it.epicode.be.trasporti.model.veicoli;

import java.util.List;

import it.epicode.be.trasporti.model.Tratta;

public abstract class Mezzo {

	private String targa;
	
	private int numPosti;
	
	private List<Tratta> elencoTratte;
	
	private StatoMezzo status;

	public Mezzo(String targa, List<Tratta> elencoTratte, StatoMezzo status) {
		this.targa = targa;
		this.elencoTratte = elencoTratte;
		this.status = status;
	}

	public Mezzo() {
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getNumPosti() {
		return numPosti;
	}

	public void setNumPosti(int numPosti) {
		this.numPosti = numPosti;
	}

	public List<Tratta> getElencoTratte() {
		return elencoTratte;
	}

	public void setElencoTratte(List<Tratta> elencoTratte) {
		this.elencoTratte = elencoTratte;
	}

	public StatoMezzo getStatus() {
		return status;
	}

	public void setStatus(StatoMezzo status) {
		this.status = status;
	}
	
	
	
}
