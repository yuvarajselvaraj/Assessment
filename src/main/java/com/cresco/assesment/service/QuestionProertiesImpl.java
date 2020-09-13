package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.QuestionProperties;
import com.cresco.assesment.repository.QuestionPropertiesRepo;
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
	public QuestionProperties createOrUpdateQuestionProp(QuestionProperties properties) {
		// TODO Auto-generated method stub
		if(properties.getQuestion_no()==null)
		{
			properties.setQuestion_no((long) 0);
		}
			QuestionProperties model=repo.save(properties);
			Long no=repo.getnobyid(model.getForeign_key2().getSection_id());
			repo.updateafterinsert(no, model.getQuestion_id());
			return model;
		
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
