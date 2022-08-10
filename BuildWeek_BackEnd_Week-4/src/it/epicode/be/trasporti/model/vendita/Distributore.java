package it.epicode.be.trasporti.model.vendita;

import it.epicode.be.trasporti.model.veicoli.StatoMezzo;

public class Distributore extends Vendita {

	private StatoMezzo status;

	public Distributore(Integer contBiglietti, StatoMezzo status) {
		super(contBiglietti);
		this.status = status;
	}
	

	public Distributore() {
	}


	public Distributore(Integer contBiglietti) {
		super(contBiglietti);
	}

	public StatoMezzo getStatus() {
		return status;
	}

	public void setStatus(StatoMezzo status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Distributore [status=" + status + "]";
	}
	
	

}
