package com.tfg.attijarieBank.Models;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ProgrammeId implements Serializable  {
	
	
    private String	PROG ;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date DATD ;
	public ProgrammeId() {
		
	}
	
	public ProgrammeId(String pROG, Date dATD) {
		PROG = pROG;
		DATD = dATD;
	}

	@Override
	public int hashCode() {
		return Objects.hash(PROG, DATD);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProgrammeId programmeid = (ProgrammeId) obj;
        return PROG.equals(programmeid.PROG) &&
        		DATD.equals(programmeid.DATD);
	}	
	
	
	
	
}
