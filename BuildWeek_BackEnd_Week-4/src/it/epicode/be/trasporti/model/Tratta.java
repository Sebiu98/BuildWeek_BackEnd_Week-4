package it.epicode.be.trasporti.model;

public class Tratta {

	private String zonaPartenza;
	private String capolinea;
	private Double tempoPercorrenza;
	private Integer contMezzi;

	public Tratta(String zonaPartenza, String capolinea, Double tempoPercorrenza, Integer contMezzi) {
		this.zonaPartenza = zonaPartenza;
		this.capolinea = capolinea;
		this.tempoPercorrenza = tempoPercorrenza;
		this.contMezzi = contMezzi;
	}

	public Tratta() {
	}

	public String getZonaPartenza() {
		return zonaPartenza;
	}

	public void setZonaPartenza(String zonaPartenza) {
		this.zonaPartenza = zonaPartenza;
	}

	public String getCapolinea() {
		return capolinea;
	}

	public void setCapolinea(String capolinea) {
		this.capolinea = capolinea;
	}

	public Double getTempoPercorrenza() {
		return tempoPercorrenza;
	}

	public void setTempoPercorrenza(Double tempoPercorrenza) {
		this.tempoPercorrenza = tempoPercorrenza;
	}

	public Integer getContMezzi() {
		return contMezzi;
	}

	public void setContMezzi(Integer contMezzi) {
		this.contMezzi = contMezzi;
	}

	@Override
	public String toString() {
		return "Tratta [zonaPartenza=" + zonaPartenza + ", capolinea=" + capolinea + ", tempoPercorrenza="
				+ tempoPercorrenza + ", contMezzi=" + contMezzi + "]";
	}

}
