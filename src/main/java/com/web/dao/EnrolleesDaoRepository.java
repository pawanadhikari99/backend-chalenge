package com.web.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.dao.entity.Enrollees;

public interface EnrolleesDaoRepository extends JpaRepository<Enrollees, Integer>{

	
	/* public Optional<Enrollees> findByUsername(String username); */
	
	public Optional<Enrollees> findByUsernameAndPassword(String username,String password);
	
	public long deleteByUsername(String username);
}
