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
	private String address;
	private String contactNum;
	private Set<DetoWorker> detoworkers = new HashSet<DetoWorker>(0);
		
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
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
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, 
			targetEntity = DetoWorker.class, mappedBy = "community")
	public Set<DetoWorker> getDetoworkers() {
		return detoworkers;
	}
	public void setDetoworkers(Set<DetoWorker> detoworkers) {
		this.detoworkers = detoworkers;
	}
	
	public Community() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}