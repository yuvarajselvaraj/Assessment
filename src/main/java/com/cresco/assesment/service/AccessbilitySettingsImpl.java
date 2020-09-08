package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AccessbilitySettings;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.repository.AccessbilitySettingsRepo;
@Service
public class AccessbilitySettingsImpl implements AccessbilitySettingsService {
@Autowired
AccessbilitySettingsRepo repo;
	@Override
	public List<AccessbilitySettings> getalloptions() {
		// TODO Auto-generated method stub
		List<AccessbilitySettings> settings=repo.findAll();
		return settings;
	}

	@Override
	public AccessbilitySettings getOptionsByName(Long id) {
		// TODO Auto-generated method stub
		Optional<AccessbilitySettings> settings=repo.getbyid(id);
		return settings.get();
	}

	@Override
	public AccessbilitySettings createOrUpdateoptions(AccessbilitySettings settings) {
		// TODO Auto-generated method stub
		AccessbilitySettings model=repo.save(settings);
		return model;
	}

}
