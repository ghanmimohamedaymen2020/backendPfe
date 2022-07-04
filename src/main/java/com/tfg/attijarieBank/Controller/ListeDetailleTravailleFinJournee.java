package com.tfg.attijarieBank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tfg.attijarieBank.Models.ListeDTfj;
import com.tfg.attijarieBank.Repository.RepositoaryLDTFJ;


@RestController
@CrossOrigin(origins = "*")
public class ListeDetailleTravailleFinJournee {
	
	@Autowired
	private RepositoaryLDTFJ repositoaryDTFJ ;
	
	@RequestMapping(path = "/DetailleTFJ" , method = RequestMethod.GET)
	public List<ListeDTfj>getDetailleTravailleFinJournee() {
		
		System.out.println(repositoaryDTFJ.findAll().toString());
		return repositoaryDTFJ.findAllByOrderByDUREEDesc();
		
	}
	
	
	

}
