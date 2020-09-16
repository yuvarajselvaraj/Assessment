package com.cresco.assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.AssesmentProperties;
@Repository
public interface AssesmentPropertyRepo extends JpaRepository<AssesmentProperties,Long> {
	@Query(value="select assessment_id from assessment where assessment_name=?1",nativeQuery=true)
	Long getidbyname(String AssessmentName);
	
}
