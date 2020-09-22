package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.DisplaySettings;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.models.Display;
import com.cresco.assesment.repository.DisplaySettingsRepo;
@Service
public class DisplaySettingsImpl implements DisplaySettingsService {
@Autowired
DisplaySettingsRepo repo;
	@Override
	public List<DisplaySettings> getAlloptions() {
		// TODO Auto-generated method stub
		
		List<DisplaySettings> options=repo.findAll();
		return options;
	}


	@Override
	public DisplaySettings getOptionsByaname(Long id) {
		Optional<DisplaySettings> options=repo.findbyid(id);
		return options.get();
	}


	@Override
	public DisplaySettings createOrUpdateoptions(Display model ) {
		// TODO Auto-generated method stub
		DisplaySettings settings=new DisplaySettings();
		PrimaryKey key=new PrimaryKey();
		AssesmentProperties pro=new AssesmentProperties();
		pro.setAssessment_id(model.getAssessment_id());
		key.setAssessment(pro);
		settings.setPrimarykey(key);
		settings.setAjson(model.getAjson());
		DisplaySettings model1=repo.save(settings);
		return model1;
		
	}


	


}
