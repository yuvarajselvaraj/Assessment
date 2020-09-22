package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.model.models.Section;
import com.cresco.assesment.repository.QuestionPropertiesRepo;
import com.cresco.assesment.repository.SectionPropertiesRepo;

@Service
public class SectionPropertiesImpl implements SectionPropertiesService {
@Autowired
SectionPropertiesRepo repo;
@Autowired
QuestionPropertiesRepo repo1;
	@Override
	public List<SectionProperties> getAllSections() {
		// TODO Auto-generated method stub
		List<SectionProperties> properties=repo.findAll();
		
		return properties;
	}

	@Override
	public List<SectionProperties> getSectionsByname(Long id) {
		// TODO Auto-generated method stub
		List<SectionProperties> properties=repo.findByassessmentid(id);
		return properties;
	}

	@Override
	public SectionProperties createSections(Section model) {
		// TODO Auto-generated method stub
		
		    if( model.getSection_id()==null)
		    {
		    	model.setSection_no((long) 0);
		    }
		    	
		    	
		    	SectionProperties model1=new SectionProperties();
		    	AssesmentProperties property=new AssesmentProperties();
		    	property.setAssessment_id(model.getAssessment_id());
		    model1.setForeign_key(property);
		    	model1.setSection_no(model.getSection_no());
		    	model1.setNo_of_questions(model.getNo_of_questions());
		    	model1.setSection_type(model.getSection_type());
		    	model1.setSection_no(model.getSection_no());
		    	model1.setTime(model.getTime());
		    	model1.setWeightage(model.getWeightage());
		    	
		    	SectionProperties model2=repo.save(model1);
		    	Long no=repo.getnobyid(model2.getForeign_key().getAssessment_id());
				repo.updateafterinsert(no,model2.getSection_id() );
				for(int i=1;i<=model.getNo_of_questions();i++)
				{
					repo1.populatequestion( (long)i,model2.getForeign_key().getAssessment_id(),model2.getSection_id());
				}
				
				return model2;
	}

	@Override
	public void deleteBySectionAndName(Long section) {
		Optional<SectionProperties> property=repo.findById(section);
		if(property.isPresent())
		{	
			SectionProperties pro=property.get();
			repo.deletebyid(section);
			repo.updateAfterDelete(pro.getForeign_key().getAssessment_id(),pro.getSection_no());
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSections(Section model) {
		// TODO Auto-generated method stub
		SectionProperties model1=new SectionProperties();
		AssesmentProperties property=new AssesmentProperties();
		property.setAssessment_id(model.getAssessment_id());
	model1.setForeign_key(property);
		model1.setSection_no(model.getSection_no());
		model1.setSection_no(model.getSection_no());
		model1.setNo_of_questions(model.getNo_of_questions());
		model1.setSection_type(model.getSection_type());
		model1.setTime(model.getTime());
		model1.setWeightage(model.getWeightage());
		model1.setSection_id(model.getSection_id());
		repo.save(model1);
	}

}
