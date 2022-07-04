package com.tfg.attijarieBank.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tfg.attijarieBank.Models.ListeDTfj;

public interface RepositoaryLDTFJ extends JpaRepository<ListeDTfj, String > {


	public List<ListeDTfj> findAllByOrderByDUREEDesc();
}
  