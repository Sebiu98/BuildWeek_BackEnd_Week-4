package it.epicode.be.trasporti.model.vendita;

public class Rivenditore extends Vendita {

	public Rivenditore() {
	}

	public Rivenditore(Integer contBiglietti) {
		super(contBiglietti);
	}
	
	@Override
	public String toString() {
		return "Rivenditore [getContBiglietti()=" + getContBiglietti() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
