package com.cresco.assesment.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.service.AssesmentPropertiesImpl;

@RestController
@CrossOrigin
public class AssesmentPropertiesController {
	@Autowired
	AssesmentPropertiesImpl properties;
	private List<Map<String, Object>> resultSetToList(ResultSet rs) throws SQLException {
	    ResultSetMetaData md = rs.getMetaData();
	    int columns = md.getColumnCount();
	    List<Map<String, Object>> rows = new ArrayList<Map<String, Object>>();
	    while (rs.next()){
	        Map<String, Object> row = new HashMap<String, Object>(columns);
	        for(int i = 1; i <= columns; ++i){
	            row.put(md.getColumnName(i), rs.getObject(i));
	        }
	        rows.add(row);
	    }
	    return rows;
	}
@RequestMapping(value="/AssesmentProperty",method=RequestMethod.GET)
public ResponseEntity<List<AssesmentProperties>> getalloptions()
{
	
	List<AssesmentProperties> model=properties.getAllAssesment();
	return new ResponseEntity<List<AssesmentProperties>>(model,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty/{AssesmentId}",method=RequestMethod.GET)
public ResponseEntity<AssesmentProperties> getproperty(@PathVariable("AssesmentId") Long id)
{
	AssesmentProperties model=properties.getAssesmentById(id);
	return new ResponseEntity<AssesmentProperties>(model,new HttpHeaders(), HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty",method=RequestMethod.POST)
public ResponseEntity<AssesmentProperties> createOrUpdateoptions(@RequestBody AssesmentProperties model)
{
	AssesmentProperties updated=properties.createOrUpdateAssesment(model);
	return new ResponseEntity<AssesmentProperties>(updated,new HttpHeaders(),HttpStatus.OK);
}
@RequestMapping(value="/AssesmentProperty/{AssesmentId}",method=RequestMethod.DELETE)
public HttpStatus deleteproperty(@PathVariable("AssesmentId") Long id)
{
	properties.deleteById(id);
	return HttpStatus.ACCEPTED;
}
@RequestMapping(value="/Getall",method=RequestMethod.GET)
public List<Map<String,Object>> getallcolumns()
{Connection c = null;
Statement stmt = null;
ResultSet  rs=null;
try {
   Class.forName("org.postgresql.Driver");
   c = DriverManager
      .getConnection("jdbc:postgresql://localhost:5432/assesment",
      "postgres", "postgres");
   c.setAutoCommit(false);
   System.out.println("Opened database successfully");
List l=new ArrayList();
   stmt = c.createStatement();
   rs = stmt.executeQuery( "select a.assessment_id,a.no_of_sections as assessment_noofsections,a.specialization as assessment_specialization,a.assessment_level as assessment_level,a.assessment_name as assessment_name,a.keywords as assessment_keywords,a.role as assessment_role,a.time as assessment_time,\r\n" + 
   		"s.section_id,s.no_of_questions as section_noofquestions,s.section_no,s.section_type,s.time as section_time,s.weightage as section_weightage,\r\n" + 
   		"q.question_id,q.answer_type as question_answertype,q.logic_jump as question_logicjump,q.no_of_options as question_noofoptions,q.options as question_options,q.question_no,q.question_type,q.score as question_score,q.timer as qustion_timer,\r\n" + 
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
   		"order by a.assessment_id,s.section_id,q.question_id ;" );
   return resultSetToList(rs);
   
  
   
} catch ( Exception e ) {
   System.err.println( e.getClass().getName()+": "+ e.getMessage() );
   System.exit(0);
   
}
System.out.println("Operation done successfully");
return null;
}
}
