package com.fyoracle.entity;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "signRecord")
public class SignRecord {

	// Fields

	private Integer id;
	private DetoUser detouser;
	private String longitude;
	private String dimension;
	private String photo;
	private String vedio;
	private Timestamp signTime;
	
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
    @JoinColumn(name = "detoUserId") 
	public DetoUser getDetouser() {
		return detouser;
	}
	public void setDetouser(DetoUser detouser) {
		this.detouser = detouser;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getDimension() {
		return dimension;
	}
	public void setDimension(String dimension) {
		this.dimension = dimension;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getVedio() {
		return vedio;
	}
	public void setVedio(String vedio) {
		this.vedio = vedio;
	}
	public Timestamp getSignTime() {
		return signTime;
	}
	public void setSignTime(Timestamp signTime) {
		this.signTime = signTime;
	}
	
	
	
	public SignRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SignRecord(DetoUser detouser, String longitude, String dimension, String photo, String vedio,
			Timestamp signTime) {
		super();
		this.detouser = detouser;
		this.longitude = longitude;
		this.dimension = dimension;
		this.photo = photo;
		this.vedio = vedio;
		this.signTime = signTime;
	}

	// Constructors
	
}