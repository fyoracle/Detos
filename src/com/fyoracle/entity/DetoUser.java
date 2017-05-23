package com.fyoracle.entity;

import java.util.Date;
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
@Table(name = "detoUser")
public class DetoUser implements java.io.Serializable {

	// Fields

	private static final long serialVersionUID = 1L;
	private Integer id;
	private Community community;
	private String name;
	private String aliasName;
	private String loginName;
	private String password;
	private String mobileNumber;
	private Integer sex;
	private String nation;
	private String idCardNum;
	private Date birthDate;
	private Integer height;
	private String permanentAddress;
	private String permanetPoliceStation;
	private String residentialAddress;
	private String residentialPoliceStation;
	private String headPortrait;
	private Set<UrineTest> urinetests = new HashSet<UrineTest>();
	private Set<SignRecord> signrecords = new HashSet<SignRecord>();
	private Set<DetoRecord> detorecords = new HashSet<DetoRecord>();
	
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
    @JoinColumn(name = "communityId")
	public Community getCommunity() {
		return community;
	}
	public void setCommunity(Community community) {
		this.community = community;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getIdCardNum() {
		return idCardNum;
	}
	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public String getPermanetPoliceStation() {
		return permanetPoliceStation;
	}
	public void setPermanetPoliceStation(String permanetPoliceStation) {
		this.permanetPoliceStation = permanetPoliceStation;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getResidentialPoliceStation() {
		return residentialPoliceStation;
	}
	public void setResidentialPoliceStation(String residentialPoliceStation) {
		this.residentialPoliceStation = residentialPoliceStation;
	}
	public String getHeadPortrait() {
		return headPortrait;
	}
	public void setHeadPortrait(String headPortrait) {
		this.headPortrait = headPortrait;
	}
	
	//
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "detouser")
	public Set<UrineTest> getUrinetests() {
		return urinetests;
	}
	public void setUrinetests(Set<UrineTest> urinetests) {
		this.urinetests = urinetests;
	}
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "detouser")
	public Set<SignRecord> getSignrecords() {
		return signrecords;
	}
	public void setSignrecords(Set<SignRecord> signrecords) {
		this.signrecords = signrecords;
	}
	@OneToMany(cascade = { CascadeType.ALL }, fetch = FetchType.LAZY, mappedBy = "detouser")
	public Set<DetoRecord> getDetorecords() {
		return detorecords;
	}
	public void setDetorecords(Set<DetoRecord> detorecords) {
		this.detorecords = detorecords;
	}
	
	
}