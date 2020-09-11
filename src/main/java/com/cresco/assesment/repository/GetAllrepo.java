package com.cresco.assesment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cresco.assesment.model.GetAll;

public interface GetAllrepo extends JpaRepository<GetAll, Long> {
	@Query(value="select a.assessment_id,a.no_of_sections as assessment_noofsections,a.specialization as assessment_specialization,a.assessment_level as assessment_level,a.assessment_name as assessment_name,a.keywords as assessment_keywords,a.role as assessment_role,a.time as assessment_time,\r\n" + 
			"s.section_id,s.no_of_questions as section_noofquestions,s.section_no,s.section_type,s.time as section_time,s.weightage as section_weightage,\r\n" + 
			"q.question_id,q.answer_type as question_answertype,q.logic_jump as question_logicjump,q.no_of_options as question_noofoptions,q.options as question_options,q.question_no,q.question_type,q.score as question_score,q.timer as question_timer,\r\n" + 
			"acs.accessbility,acs.negative_mark as accessbility_negativemark,\r\n" + 
			"dis.objectjson as display_objectjson,\r\n" + 
			"es.internet_issue,es.mic_issue,es.proctor_alert,es.server_issue,es.webcam_issue,\r\n" + 
			"ss.shortcut,ss.no_of_options as shortcut_noofoptions,ss.options as shortcut_options,\r\n" + 
			"ts.themes,ts.modes\r\n" + 
			"from assessment a left  join section s  on a.assessment_id=s.assessment_id \r\n" + 
			"left  join question_prop q on s.assessment_id=q.assessment_id and s.section_id=q.section_id\r\n" + 
			"left join accessbility_settings acs on acs.assessment_id=a.assessment_id\r\n" + 
			"left join display_settings dis on dis.assessment_id=a.assessment_id\r\n" + 
			"left join error_settings es on es.assessment_id=a.assessment_id\r\n" + 
			"left join shortcut_settings ss on ss.assessment_id=a.assessment_id\r\n" + 
			"left join theme_settings ts on ts.assessment_id=a.assessment_id\r\n" + 
			"order by a.assessment_id,s.section_id,q.question_id ;",nativeQuery=true)
	List<GetAll> getalltables();
}
