package com.backend.Backend;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID")
	private long ID;
    @Column(name = "FIRST_NAME")
	private String FIRST_NAME;
    @Column(name = "LAST_NAME")
	private String LAST_NAME;
    @Column(name = "ADDRESS")
	private String ADDRESS;
    @Column(name = "CITY")
	private String CITY;
    @Column(name = "STATE")
	private String STATE;
    @Column(name = "ZIP")
	private String ZIP;
    @Column(name = "CELL_PHONE")
	private String CELL_PHONE;
    @Column(name = "HOME_PHONE")
	private String HOME_PHONE;
    @Column(name = "EMAIL")
	private String EMAIL;
    
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public String getFIRST_NAME() {
		return FIRST_NAME;
	}
	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}
	public String getLAST_NAME() {
		return LAST_NAME;
	}
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	public String getADDRESS() {
		return ADDRESS;
	}
	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}
	public String getCITY() {
		return CITY;
	}
	public void setCITY(String cITY) {
		CITY = cITY;
	}
	public String getSTATE() {
		return STATE;
	}
	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}
	public String getZIP() {
		return ZIP;
	}
	public void setZIP(String zIP) {
		ZIP = zIP;
	}
	public String getCELL_PHONE() {
		return CELL_PHONE;
	}
	public void setCELL_PHONE(String cELL_PHONE) {
		CELL_PHONE = cELL_PHONE;
	}
	public String getHOME_PHONE() {
		return HOME_PHONE;
	}
	public void setHOME_PHONE(String hOME_PHONE) {
		HOME_PHONE = hOME_PHONE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	
	
	
}
