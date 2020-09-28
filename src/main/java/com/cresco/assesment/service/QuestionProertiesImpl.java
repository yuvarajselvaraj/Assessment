package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.json.QOptions;
import com.cresco.assesment.json.Score;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.QuestionProperties;
import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.repository.QuestionPropertiesRepo;
import com.cresco.assesment.vo.Question;
@Service
public class QuestionProertiesImpl implements QuestionPropertiesService {
@Autowired
QuestionPropertiesRepo repo;
	@Override
	public List<QuestionProperties> getAllQuestionProp() {
		// TODO Auto-generated method stub
		List<QuestionProperties> properties=repo.findAll();
		return properties;
	}

	@Override
	public List<QuestionProperties> getQuestionByNumber(Long assessment_id,Long section_id) {
		// TODO Auto-generated method stub
		List<QuestionProperties> properties=repo.getbyids(assessment_id, section_id);
		return properties;
	}

	@Override
	public void UpdateQuestionProp(Question model) {
		QuestionProperties model1=new QuestionProperties();
		model1.setAnswer_type(model.getAnswer_type());
		model1.setLogic_jump(model.getLogic_jump());
		model1.setNo_of_options(model.getNo_of_options());
		QOptions n=new QOptions();
		n.setOptions(model.getOptions());
		model1.setOptions(n);
		model1.setQuestion_id(model.getQuestion_id());
		model1.setQuestion_no(model.getQuestion_no());
		model1.setQuestion_q(model.getQuestion_q());
		model1.setQuestion_type(model.getQuestion_type());
		Score sc=new Score();
		sc.setMark(model.getMark());
		sc.setNegativeMark(model.getNegative_mark());
		model1.setScore(sc);
		QOptions n1=new QOptions();
		n1.setOptions(model.getAnswer());
		model1.setAnswer(n1);
		model1.setTimer(model.getTimer());
		AssesmentProperties ap=new AssesmentProperties();
		ap.setAssessment_id(model.getAssessment_id());
		SectionProperties sp=new SectionProperties();
		sp.setSection_id(model.getSection_id());
		model1.setForeign_key1(ap);
		model1.setForeign_key2(sp);
		// TODO Auto-generated method stub
		repo.save(model1);
		
	}

	@Override
	public void deleteByQuestionNo(Long Questionid) {
		// TODO Auto-generated method stub
		Optional<QuestionProperties> property=repo.findById(Questionid);
		if(property.isPresent())
		{
			QuestionProperties pro=property.get();
			repo.deleteById(Questionid);
			repo.UpdateAfterDelete(pro.getForeign_key1().getAssessment_id(),pro.getForeign_key2().getSection_id(),pro.getQuestion_no());
		}
	}

}
