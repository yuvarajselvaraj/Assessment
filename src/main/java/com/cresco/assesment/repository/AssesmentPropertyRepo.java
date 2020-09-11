package com.cresco.assesment.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.AccessbilitySettings;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.GetAll;
@Repository
public interface AssesmentPropertyRepo extends JpaRepository<AssesmentProperties,Long> {
	@Query(value="select assessment_id from assessment where assessment_name=?1",nativeQuery=true)
	Long getidbyname(String AssessmentName);
	
}
