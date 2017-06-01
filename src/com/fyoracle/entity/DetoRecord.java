package com.fyoracle.entity;

import java.sql.Timestamp;
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
@Table(name = "detoRecord")
public class DetoRecord {

	// Fields

	private Integer id;
	private DetoUser detouser;
	private String detoUserName;
	// 抓获。 查获部门、查获地点、查获时间、查获毒品(多种)、尿检结果、尿检信息、吸毒事实 。。。
	
	private Integer catchPoliceStationID;
	private String catchPoliceStationName;
	private String catchPlace;
	private Date catchDate;
	private String Detos;
	private Integer urineTest;
	private String urineTestInfo;
	private String detoReality;
	
	private Integer registerUserId;
	private String RegisterUserName;
	private Timestamp registerTime;
	private Timestamp registerVerifyTime;
	
	private Integer recordState;
	// 处置
	
	// 接收
	private Timestamp communityReceiveTime;
	// 变更执行地
	
	// 终止
	
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
	
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.EAGER, mappedBy = "detouser")
	public Set<UrineTest> getUrinetests() {
		return urinetests;
	}
	public void setUrinetests(Set<UrineTest> urinetests) {
		this.urinetests = urinetests;
	}
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.MERGE}, fetch = FetchType.EAGER, mappedBy = "detouser")
	public Set<SignRecord> getSignrecords() {
		return signrecords;
	}
	public void setSignrecords(Set<SignRecord> signrecords) {
		this.signrecords = signrecords;
	}
	
	
	public Integer getCatchPoliceStationID() {
		return catchPoliceStationID;
	}
	public void setCatchPoliceStationID(Integer catchPoliceStationID) {
		this.catchPoliceStationID = catchPoliceStationID;
	}
	public String getCatchPoliceStationName() {
		return catchPoliceStationName;
	}
	public void setCatchPoliceStationName(String catchPoliceStationName) {
		this.catchPoliceStationName = catchPoliceStationName;
	}
	public String getCatchPlace() {
		return catchPlace;
	}
	public void setCatchPlace(String catchPlace) {
		this.catchPlace = catchPlace;
	}
	public Date getCatchDate() {
		return catchDate;
	}
	public void setCatchDate(Date catchDate) {
		this.catchDate = catchDate;
	}
	public String getDetos() {
		return Detos;
	}
	public void setDetos(String detos) {
		Detos = detos;
	}
	public Integer getUrineTest() {
		return urineTest;
	}
	public void setUrineTest(Integer urineTest) {
		this.urineTest = urineTest;
	}
	public String getUrineTestInfo() {
		return urineTestInfo;
	}
	public void setUrineTestInfo(String urineTestInfo) {
		this.urineTestInfo = urineTestInfo;
	}
	public String getDetoReality() {
		return detoReality;
	}
	public void setDetoReality(String detoReality) {
		this.detoReality = detoReality;
	}
	public Integer getRegisterUserId() {
		return registerUserId;
	}
	public void setRegisterUserId(Integer registerUserId) {
		this.registerUserId = registerUserId;
	}
	public String getRegisterUserName() {
		return RegisterUserName;
	}
	public void setRegisterUserName(String registerUserName) {
		RegisterUserName = registerUserName;
	}
	
	public String getDetoUserName() {
		return detoUserName;
	}
	public void setDetoUserName(String detoUserName) {
		this.detoUserName = detoUserName;
	}
	public DetoRecord() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}