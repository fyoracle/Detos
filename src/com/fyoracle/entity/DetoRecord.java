package com.fyoracle.entity;

import java.sql.Timestamp;
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
@Table(name = "detoRecord")
public class DetoRecord {

	// Fields

	private Integer id;
	private DetoUser detouser;
	private Timestamp registerTime;
	private Timestamp registerVerifyTime;
	private Timestamp communityReceiveTime;
	private Integer recordState;
	private Set<UrineTest> urinetests = new HashSet<UrineTest>();
	private Set<SignRecord> signrecords = new HashSet<SignRecord>();
	
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
	public Timestamp getRegisterTime() {
		return registerTime;
	}
	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}
	public Timestamp getRegisterVerifyTime() {
		return registerVerifyTime;
	}
	public void setRegisterVerifyTime(Timestamp registerVerifyTime) {
		this.registerVerifyTime = registerVerifyTime;
	}
	public Timestamp getCommunityReceiveTime() {
		return communityReceiveTime;
	}
	public void setCommunityReceiveTime(Timestamp communityReceiveTime) {
		this.communityReceiveTime = communityReceiveTime;
	}
	public Integer getRecordState() {
		return recordState;
	}
	public void setRecordState(Integer recordState) {
		this.recordState = recordState;
	}
	
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy = "detouser")
	public Set<UrineTest> getUrinetests() {
		return urinetests;
	}
	public void setUrinetests(Set<UrineTest> urinetests) {
		this.urinetests = urinetests;
	}
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.EAGER, mappedBy = "detouser")
	public Set<SignRecord> getSignrecords() {
		return signrecords;
	}
	public void setSignrecords(Set<SignRecord> signrecords) {
		this.signrecords = signrecords;
	}
	
	public DetoRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}