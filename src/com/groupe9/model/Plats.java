package com.groupe9.model;
// Generated 9 mars 2022, 10:44:53 by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Plats generated by hbm2java
 */
@Entity
@Table(name = "plats", catalog = "restaurant")
public class Plats implements java.io.Serializable {

	private Integer id;
	private String nom;
	private String type;
	private byte[] image;
	private String prix;
	private Set<Periodes> periodeses = new HashSet<Periodes>(0);
	private Set<ComandePlats> comandePlatses = new HashSet<ComandePlats>(0);

	public Plats() {
	}

	public Plats(String nom, String type, byte[] image, String prix) {
		this.nom = nom;
		this.type = type;
		this.image = image;
		this.prix = prix;
	}

	public Plats(String nom, String type, byte[] image, String prix, Set<Periodes> periodeses,
			Set<ComandePlats> comandePlatses) {
		this.nom = nom;
		this.type = type;
		this.image = image;
		this.prix = prix;
		this.periodeses = periodeses;
		this.comandePlatses = comandePlatses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nom", nullable = false, length = 50)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "image", nullable = false)
	public byte[] getImage() {
		return this.image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Column(name = "prix", nullable = false, length = 50)
	public String getPrix() {
		return this.prix;
	}

	public void setPrix(String prix) {
		this.prix = prix;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plats")
	public Set<Periodes> getPeriodeses() {
		return this.periodeses;
	}

	public void setPeriodeses(Set<Periodes> periodeses) {
		this.periodeses = periodeses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plats")
	public Set<ComandePlats> getComandePlatses() {
		return this.comandePlatses;
	}

	public void setComandePlatses(Set<ComandePlats> comandePlatses) {
		this.comandePlatses = comandePlatses;
	}

}