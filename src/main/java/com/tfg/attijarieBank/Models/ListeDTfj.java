package com.tfg.attijarieBank.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "fjo_stat1")
@IdClass(ProgrammeId.class)
public class ListeDTfj implements Serializable{
	
	@Id
    private String	PROG ;
	//@JsonFormat(pattern="yyyy-MM-dd")
	@Id
	private Date DCO ;	
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date DATD ;	
	
	private String  HEURD ;
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date DATF ;	
	private String HEURF ;	
	private String DUREE ;
	private String CUTI ;	
	private int ETAPE ;
	
	
	
@ManyToOne()
@JoinColumn(name = "ListeTfj_id" )

private ListeTfj listeTFJ ;



public ListeDTfj() {}



public ListeDTfj(String pROG, Date dCO, Date dATD, String hEURD, Date dATF, String hEURF, String dUREE, String cUTI,
		int eTAPE, ListeTfj listeTFJ) {
	super();
	PROG = pROG;
	DCO = dCO;
	DATD = dATD;
	HEURD = hEURD;
	DATF = dATF;
	HEURF = hEURF;
	DUREE = dUREE;
	CUTI = cUTI;
	ETAPE = eTAPE;
	this.listeTFJ = listeTFJ;
}



public String getPROG() {
	return PROG;
}



public void setPROG(String pROG) {
	PROG = pROG;
}

 

public Date getDCO() {
	return DCO;
}



public void setDCO(Date dCO) {
	DCO = dCO;
}



public Date getDATD() {
	return DATD;
}



public void setDATD(Date dATD) {
	DATD = dATD;
}



public String getHEURD() {
	return HEURD;
}



public void setHEURD(String hEURD) {
	HEURD = hEURD;
}



public Date getDATF() {
	return DATF;
}



public void setDATF(Date dATF) {
	DATF = dATF;
}



public String getHEURF() {
	return HEURF;
}



public void setHEURF(String hEURF) {
	HEURF = hEURF;
}



public String getDUREE() {
	return DUREE;
}



public void setDUREE(String dUREE) {
	DUREE = dUREE;
}



public String getCUTI() {
	return CUTI;
}



public void setCUTI(String cUTI) {
	CUTI = cUTI;
}



public int getETAPE() {
	return ETAPE;
}



public void setETAPE(int eTAPE) {
	ETAPE = eTAPE;
}



public ListeTfj getListeTFJ() {
	return listeTFJ;
}



public void setListeTFJ(ListeTfj listeTFJ) {
	this.listeTFJ = listeTFJ;
}
	

	
	

}
