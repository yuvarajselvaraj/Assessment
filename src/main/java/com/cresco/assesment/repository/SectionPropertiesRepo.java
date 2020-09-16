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
	/*@Transactional
	@Modifying
	@Query(value="update set section_no=")*/
@Query(value="select max(section_no)+1 from section where assessment_id=?1",nativeQuery=true)
Long getnobyid(Long assessment_id);
@Transactional
@Modifying
@Query(value="do $$\r\n" + 
		"declare\r\n" + 
		"	n integer:=1;\r\n" + 
		"begin\r\n" + 
		"	loop\r\n" + 
		"		exit when n>?1;\r\n" + 
		"		if(n<=?1) then\r\n" + 
		"			insert into question_prop(answer_type,logic_jump,no_of_options,options,question_no,question_q,question_type,score,timer,assessment_id,section_id)  \r\n" + 
		"			values(null,null,null,null,n,null,null,null,null,?2,?3);\r\n" + 
		"		end if;\r\n" + 
		"		n:=n+1;\r\n" + 
		"	end loop;\r\n" + 
		"end;$$",nativeQuery=true)
void populatequestion(Long noofquestions,Long assessmentid,Long sectionid);
@Transactional
@Modifying
@Query(value="update section set section_no=?1  where section_id=?2",nativeQuery=true)
void updateafterinsert(Long section_no,Long section_id);
@Transactional
@Modifying
@Query(value="UPDATE section SET section_no=section_no-1 where assessment_id=?1 and section_no>?2",nativeQuery=true)
void updateAfterDelete(Long AssessmentId,Long section);
@Query(value="delete * from section where assessment_id=?1 and section_no=?2",nativeQuery=true)
void deletebyid(Long id,Long section);
@Query(value="select * from section where assessment_id=?1 and section_no=?2",nativeQuery=true)
Optional<SectionProperties> findbyidandno(Long id,Long no);
}
