package com.tfg.attijarieBank.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfg.attijarieBank.Models.ListeDTfj;
import com.tfg.attijarieBank.Models.ProgrammeId;

public interface RepositoaryLDTFJ extends JpaRepository<ListeDTfj, ProgrammeId > {


	public List<ListeDTfj> findAllByOrderByDUREEDesc();
}
  
