package com.fyoracle.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "region")
public class Region implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	// Fields

	private Integer id;
	private Region region;
	private String name;
	private String regionCode;
	private Set<Region> regions = new HashSet<Region>();
	private Set<PoliceStation> policestations = new HashSet<PoliceStation>();
	//private Set<DetoUser> detousers = new HashSet<DetoUser>();

	// Constructors

	@Id
    @Column(name = "id", nullable = false, unique = true)
	@GenericGenerator(name = "generator", strategy = "native")
    @GeneratedValue(generator = "generator")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)  
    @JoinColumn(name = "pId") 
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegionCode() {
		return regionCode;
	}

	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, 
			targetEntity = Region.class, mappedBy = "region") 
	public Set<Region> getRegions() {
		return regions;
	}

	public void setRegions(Set<Region> regions) {
		this.regions = regions;
	}

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, 
			targetEntity = PoliceStation.class, mappedBy = "region")
	public Set<PoliceStation> getPolicestations() {
		return policestations;
	}

	public void setPolicestations(Set<PoliceStation> policestations) {
		this.policestations = policestations;
	}

	/*
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, 
			targetEntity = DetoUser.class, mappedBy = "region")
	public Set<DetoUser> getDetousers() {
		return detousers;
	}
	
	public void setDetousers(Set<DetoUser> detousers) {
		this.detousers = detousers;
	}
	*/
	
	
}