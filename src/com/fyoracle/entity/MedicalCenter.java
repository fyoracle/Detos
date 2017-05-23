package com.fyoracle.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "medicalCenter")
public class MedicalCenter {

	// Fields

	private Integer id;
	private String name;
	private String address;
	private Set<UrineTest> urinetests = new HashSet<UrineTest>();
	
	@Id
    @Column(name = "id", nullable = false, unique = true)
	@GenericGenerator(name = "generator", strategy = "native")
    @GeneratedValue(generator = "generator")
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "medicalcenter")
	public Set<UrineTest> getUrinetests() {
		return urinetests;
	}
	public void setUrinetests(Set<UrineTest> urinetests) {
		this.urinetests = urinetests;
	}
	
	
	public MedicalCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MedicalCenter(String name, String address, Set<UrineTest> urinetests) {
		super();
		this.name = name;
		this.address = address;
		this.urinetests = urinetests;
	}

	
}