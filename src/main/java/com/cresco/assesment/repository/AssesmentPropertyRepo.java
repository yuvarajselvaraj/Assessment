package com.cresco.assesment.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.AssesmentProperties;
@Repository
public interface AssesmentPropertyRepo extends JpaRepository<AssesmentProperties,Long> {
	
}
