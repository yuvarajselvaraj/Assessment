package com.cresco.alltable.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.alltable.model.Assessment;
@Repository
public interface GetAllrepo extends JpaRepository<Assessment, Long> {
	/*@Query(value="select a.assessment_id,a.no_of_sections as assessment_noofsections,a.specialization as assessment_specialization,a.assessment_level as assessment_level,a.assessment_name as assessment_name,a.keywords as assessment_keywords,a.role as assessment_role,a.time as assessment_time,\r\n" + 
			"STRING_AGG(s.section_id::::character varying,','order by a.assessment_id) as section_id,\r\n" + 
			"STRING_AGG(s.no_of_questions::::character varying,','order by a.assessment_id) as section_noofquestions,\r\n" + 
			"STRING_AGG(s.section_no::::character varying,','order by a.assessment_id)as section_no,\r\n" + 
			"STRING_AGG(s.section_type::::character varying,','order by a.assessment_id) as section_type,\r\n" + 
			"STRING_AGG(s.time::::character varying,','order by a.assessment_id) as section_time,\r\n" + 
			"STRING_AGG(s.weightage::::character varying,','order by a.assessment_id) as section_weightage,\r\n" + 
			"STRING_AGG(q.question_id::::character varying,','order by a.assessment_id,s.section_id)as question_id,\r\n" + 
			"STRING_AGG(q.answer_type ::::character varying,','order by a.assessment_id,s.section_id)as question_answertype,\r\n" + 
			"STRING_AGG(q.logic_jump::::character varying,','order by a.assessment_id,s.section_id) as question_logicjump,\r\n" + 
			"STRING_AGG(q.no_of_options::::character varying,','order by a.assessment_id,s.section_id) as question_noofoptions,\r\n" + 
			"STRING_AGG(q.options::::character varying,','order by a.assessment_id,s.section_id) as question_options,\r\n" + 
			"STRING_AGG(q.question_no::::character varying,','order by a.assessment_id,s.section_id)as question_no,\r\n" + 
			"STRING_AGG(q.question_type::::character varying,','order by a.assessment_id,s.section_id)as question_type,\r\n" + 
			"STRING_AGG(q.score::::character varying,','order by a.assessment_id,s.section_id) as question_score,\r\n" + 
			"STRING_AGG(q.timer::::character varying,','order by a.assessment_id,s.section_id) as question_timer,\r\n" + 
			"STRING_AGG(acs.accessbility::::character varying,','order by a.assessment_id)as accessbility,\r\n" + 
			"STRING_AGG(acs.negative_mark::::character varying,','order by a.assessment_id) as accessbility_negativemark,\r\n" + 
			"STRING_AGG(dis.objectjson::::character varying,','order by a.assessment_id) as display_objectjson,\r\n" + 
			"STRING_AGG( es.internet_issue::::character varying,','order by a.assessment_id)as internet_issue,\r\n" + 
			"STRING_AGG( es.mic_issue::::character varying,','order by a.assessment_id)as mic_issue,\r\n" + 
			"STRING_AGG( es.proctor_alert::::character varying,','order by a.assessment_id) as proctor_alert,\r\n" + 
			"STRING_AGG( es.server_issue::::character varying,','order by a.assessment_id)as server_issue,\r\n" + 
			"STRING_AGG( es.webcam_issue::::character varying,','order by a.assessment_id) as webcam_issue,\r\n" + 
			"STRING_AGG( ss.shortcut::::character varying,','order by a.assessment_id)as shortcut,\r\n" + 
			"STRING_AGG( ss.no_of_options::::character varying,','order by a.assessment_id) as shortcut_noofoptions,\r\n" + 
			"STRING_AGG( ss.options ::::character varying,','order by a.assessment_id)as shortcut_options,\r\n" + 
			"STRING_AGG(ts.themes::::character varying,','order by a.assessment_id)as themes,\r\n" + 
			"STRING_AGG( ts.modes::::character varying,','order by a.assessment_id) as modes\r\n" + 
			"from assessment a left  join section s  on a.assessment_id=s.assessment_id \r\n" + 
			"left join question_prop q on s.assessment_id=q.assessment_id and s.section_id=q.section_id\r\n" + 
			"left join accessbility_settings acs on acs.assessment_id=a.assessment_id\r\n" + 
			"left join display_settings dis on dis.assessment_id=a.assessment_id\r\n" + 
			"left join error_settings es on es.assessment_id=a.assessment_id\r\n" + 
			"left join shortcut_settings ss on ss.assessment_id=a.assessment_id\r\n" + 
			"left join theme_settings ts on ts.assessment_id=a.assessment_id\r\n" + 
			"group by a.assessment_id,a.no_of_sections,a.specialization ,a.assessment_level ,a.assessment_name ,a.keywords ,a.role ,a.time;",nativeQuery=true)
	List<GetAll> getalltables();*/
	@Query(value="select * from assessment_view where assessment_id=?1 ",nativeQuery=true)
	Optional<Assessment> getbyid(Long id);
}
