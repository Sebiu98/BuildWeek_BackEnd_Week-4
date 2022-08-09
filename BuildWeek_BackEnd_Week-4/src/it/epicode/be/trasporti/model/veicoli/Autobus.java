package it.epicode.be.trasporti.model.veicoli;

import java.util.List;

import javax.persistence.Entity;

import it.epicode.be.trasporti.model.Tratta;

@Entity
public class Autobus extends Mezzo {

	public Autobus() {
	}

	public Autobus(String targa, List<Tratta> elencoTratte, StatoMezzo status) {
		super(targa, elencoTratte, status);
		
		this.setNumPosti(70);
		
	}

	@Override
	public String toString() {
		return "Autobus [getTarga()=" + getTarga() + ", getNumPosti()=" + getNumPosti() + ", getElencoTratte()="
				+ getElencoTratte() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
