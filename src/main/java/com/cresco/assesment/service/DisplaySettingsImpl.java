package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.DisplaySettings;
import com.cresco.assesment.model.PrimaryKey;
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
	public DisplaySettings createOrUpdateoptions(DisplaySettings displaymodel ) {
		// TODO Auto-generated method stub
		
			DisplaySettings model=repo.save(displaymodel);
			return model;
		
	}


	


}
