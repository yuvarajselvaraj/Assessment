package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.repository.SectionPropertiesRepo;

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
