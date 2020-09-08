package com.cresco.assesment.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.SectionProperties;
@Repository
public interface SectionPropertiesRepo extends JpaRepository<SectionProperties,Long > {
	@Query(value="select * from section where assessment_id=?1",nativeQuery=true)
	List<SectionProperties> findByassessmentid(Long id);

@Transactional
@Modifying
@Query(value="UPDATE section SET section_no=section_no-1 where assessment_id=?1 and section_no>?2",nativeQuery=true)
void updateAfterDelete(Long AssessmentId,Long section);
@Query(value="delete * from section where assessment_id=?1 and section_no=?2",nativeQuery=true)
void deletebyid(Long id,Long section);
@Query(value="select * from section where assessment_id=?1 and section_no=?2",nativeQuery=true)
Optional<SectionProperties> findbyidandno(Long id,Long no);
}