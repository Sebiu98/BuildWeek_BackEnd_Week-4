package it.epicode.be.trasporti.model.veicoli;

import java.util.List;

import javax.persistence.Entity;

import it.epicode.be.trasporti.model.Tratta;

@Entity
public class Tram extends Mezzo {

	public Tram() {

	}

	public Tram(String targa, List<Tratta> elencoTratte, StatoMezzo status) {
		super(targa, elencoTratte, status);
		
		this.setNumPosti(103);
		
	}

	@Override
	public String toString() {
		return "Tram [getTarga()=" + getTarga() + ", getNumPosti()=" + getNumPosti() + ", getElencoTratte()="
				+ getElencoTratte() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
