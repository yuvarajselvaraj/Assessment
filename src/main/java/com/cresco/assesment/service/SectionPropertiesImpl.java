package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.repository.QuestionPropertiesRepo;
import com.cresco.assesment.repository.SectionPropertiesRepo;

import ch.qos.logback.core.net.SyslogOutputStream;

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
	public SectionProperties createOrUpdateSections(SectionProperties properties) {
		// TODO Auto-generated method stub
		
		    if( properties.getSection_id()==null)
		    {
		    	properties.setSection_no((long) 0);
		    	SectionProperties model=repo.save(properties);
				Long no=repo.getnobyid(model.getForeign_key().getAssessment_id());
			
				System.out.println(model.getNo_of_questions());
				System.out.println(model.getForeign_key().getAssessment_id());
				System.out.println(model.getSection_id());
				//repo.updateafterinsert(no,model.getSection_id() );
				for(int i=1;i<=model.getNo_of_questions();i++)
				{
					repo1.populatequestion( (long)i,model.getForeign_key().getAssessment_id(),model.getSection_id());
				}
				
				return model;
				
		    }
			SectionProperties model=repo.save(properties);
			return model;
	}

	@Override
	public void deleteBySectionAndName(Long section) {
		Optional<SectionProperties> property=repo.findById(section);
		if(property.isPresent())
		{	
			SectionProperties pro=property.get();
			repo.deleteById(section);
			repo.updateAfterDelete(pro.getSection_id(),section);
		}
		// TODO Auto-generated method stub

	}

}
