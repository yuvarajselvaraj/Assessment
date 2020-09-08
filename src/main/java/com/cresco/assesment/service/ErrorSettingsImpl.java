package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.ErrorSettings;
import com.cresco.assesment.repository.ErrorSettingsRepo;
@Service
public class ErrorSettingsImpl implements ErrorSettingsService {
@Autowired
ErrorSettingsRepo repo;
	@Override
	public List<ErrorSettings> getallSettings() {
		// TODO Auto-generated method stub
		List<ErrorSettings> settings=repo.findAll();
		return settings;
	}

	@Override
	public ErrorSettings getSettingsByName(Long id) {
		// TODO Auto-generated method stub
		Optional<ErrorSettings> settings=repo.getbyid(id);
		return settings.get();
	}

	@Override
	public ErrorSettings createOrUpdateSettings(ErrorSettings settings) {
		// TODO Auto-generated method stub
		ErrorSettings model=repo.save(settings);
		return model;
	}

}
