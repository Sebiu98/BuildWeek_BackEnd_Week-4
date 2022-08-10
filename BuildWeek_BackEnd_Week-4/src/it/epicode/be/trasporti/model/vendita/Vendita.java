package it.epicode.be.trasporti.model.vendita;

public abstract class Vendita {
	
	private Integer contBiglietti;

	public Vendita(Integer contBiglietti) {
		this.contBiglietti = contBiglietti;
	}

	public Vendita() {
	}

	public Integer getContBiglietti() {
		return contBiglietti;
	}

	public void setContBiglietti(Integer contBiglietti) {
		this.contBiglietti = contBiglietti;
	}

	@Override
	public String toString() {
		return "Vendita [contBiglietti=" + contBiglietti + "]";
	}
	
}
