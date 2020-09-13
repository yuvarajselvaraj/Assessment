package com.cresco.assesment.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.QuestionProperties;
@Repository
public interface QuestionPropertiesRepo extends JpaRepository<QuestionProperties,Long> {
	@Query(value="select max(question_no)+1 from question_prop where section_id=?1",nativeQuery=true)
	Long getnobyid(Long section_id);
	@Transactional
	@Modifying
	@Query(value="update question_prop set question_no=?1  where question_id=?2",nativeQuery=true)
	void updateafterinsert(Long Question_no,Long question_id);
	@Transactional
@Modifying
@Query(value="UPDATE question_prop SET question_no=question_no-1 WHERE assesment_id=?1 AND section_id=?2 AND question_no>?3",nativeQuery = true)
void UpdateAfterDelete(Long assessmentId, Long section, Long questionno);
@Query(value="select * from question_prop where assessment_id=?1 and section_id=?2",nativeQuery=true)
List<QuestionProperties> getbyids(Long assessment_id,Long section_id);
}
