package com.mytool.productmanager.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product implements Serializable{  //apprendre serializable
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "preis")
	private int preis;
	
	public Product() {
		
	}
	
	public Product( String name, String description, String image, int preis) {
		this.name = name;
		this.description = description;
		this.image = image;
		this.preis = preis;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setID(Long id) {
		this.id =id ;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public int getPreis() {
		return preis;
	}
	
	public void setPreis(int preis) {
		this.preis= preis;
	}

}

