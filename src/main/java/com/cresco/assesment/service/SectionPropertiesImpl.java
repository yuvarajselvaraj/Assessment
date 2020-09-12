package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.repository.SectionPropertiesRepo;

import ch.qos.logback.core.net.SyslogOutputStream;

@Service
public class SectionPropertiesImpl implements SectionPropertiesService {
@Autowired
SectionPropertiesRepo repo;
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
		
		    if(properties.getSection_no()==null)
		    {
		    	properties.setSection_no((long) 0);
		    }
			SectionProperties model=repo.save(properties);
			System.out.print("hi");
			Long no=repo.getnobyid(model.getForeign_key().getAssessment_id());
			System.out.println(no);
			System.out.print("hi");
			repo.updateafterinsert(no,model.getSection_id() );
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
