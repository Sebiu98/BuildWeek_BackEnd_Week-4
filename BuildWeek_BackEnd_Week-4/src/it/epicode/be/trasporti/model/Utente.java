package it.epicode.be.trasporti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	@Id
	private Integer id;
	private String nome;
	private String cognome;
	private int numTessera;
	private boolean validita;
	
	public Utente(Integer id, String nome, String cognome, int numTessera, boolean validita) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.numTessera = numTessera;
		this.validita = validita;
	}

	public Utente() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getNumTessera() {
		return numTessera;
	}

	public void setNumTessera(int numTessera) {
		this.numTessera = numTessera;
	}

	public boolean isValidita() {
		return validita;
	}

	public void setValidita(boolean validita) {
		this.validita = validita;
	}

	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", numTessera=" + numTessera
				+ ", validita=" + validita + "]";
	}
	
}
