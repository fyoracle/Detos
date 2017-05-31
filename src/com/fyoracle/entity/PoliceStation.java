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
@Table(name = "policestation")
public class PoliceStation implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private PoliceStation policestation;
	private Region region;
	private String name;
	private Set<DetoPolice> detopolices = new HashSet<DetoPolice>();
	private Set<PoliceStation> policestations = new HashSet<PoliceStation>();
	//private Set communities = new HashSet(0);

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

	@ManyToOne(fetch=FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })  
    @JoinColumn(name = "pId") 
	public PoliceStation getPolicestation() {
		return policestation;
	}

	public void setPolicestation(PoliceStation policestation) {
		this.policestation = policestation;
	}

	@ManyToOne(fetch=FetchType.LAZY,cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })  
    @JoinColumn(name = "regId") // 外键字段 
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

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, 
			targetEntity = DetoPolice.class, // 多方类 
			mappedBy = "policestation")  // 在本类定义的属性
	public Set<DetoPolice> getDetopolices() {
		return detopolices;
	}

	public void setDetopolices(Set<DetoPolice> detopolices) {
		this.detopolices = detopolices;
	}

	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, 
			targetEntity = PoliceStation.class, mappedBy = "policestation") 
	public Set<PoliceStation> getPolicestations() {
		return policestations;
	}

	public void setPolicestations(Set<PoliceStation> policestations) {
		this.policestations = policestations;
	}

	
}