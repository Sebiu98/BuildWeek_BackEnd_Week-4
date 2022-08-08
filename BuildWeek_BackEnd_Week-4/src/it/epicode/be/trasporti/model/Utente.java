package it.epicode.be.trasporti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Utente {
	@Id
	private String nome;
}
