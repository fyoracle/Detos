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
@Table(name="community")
public class Community implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private PoliceStation policestation;
	private String name;
	private Set<DetoWorker> detoworkers = new HashSet<DetoWorker>(0);
	private Set<DetoUser> detousers = new HashSet<DetoUser>();
	
	
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
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH })  
    @JoinColumn(name = "policeSationId") 
	public PoliceStation getPolicestation() {
		return policestation;
	}
	public void setPolicestation(PoliceStation policestation) {
		this.policestation = policestation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, 
			targetEntity = DetoWorker.class, mappedBy = "community")
	public Set<DetoWorker> getDetoworkers() {
		return detoworkers;
	}
	public void setDetoworkers(Set<DetoWorker> detoworkers) {
		this.detoworkers = detoworkers;
	}
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, 
			targetEntity = DetoUser.class, mappedBy = "community")
	public Set<DetoUser> getDetousers() {
		return detousers;
	}
	public void setDetousers(Set<DetoUser> detousers) {
		this.detousers = detousers;
	}
	
	
	
	public Community() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Community(PoliceStation policestation, String name, Set<DetoWorker> detoworkers, Set<DetoUser> detousers) {
		super();
		this.policestation = policestation;
		this.name = name;
		this.detoworkers = detoworkers;
		this.detousers = detousers;
	}

	
}