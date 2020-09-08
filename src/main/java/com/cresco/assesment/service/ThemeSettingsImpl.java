package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.ThemeSettings;
import com.cresco.assesment.repository.ThemeSettingsRepo;
@Service
public class ThemeSettingsImpl implements ThemeSettingsService {
@Autowired
ThemeSettingsRepo repo;
	@Override
	public List<ThemeSettings> getallSettings() {
		// TODO Auto-generated method stub
		List<ThemeSettings> themes=repo.findAll();
		return themes;
	}

	@Override
	public List<ThemeSettings> getSetingsByName(Long id) {
		// TODO Auto-generated method stub
		List<ThemeSettings> themes=repo.findByassessmentid(id);
		return themes;
	}

	@Override
	public ThemeSettings createOrUpdateSettings(ThemeSettings settings) {
		// TODO Auto-generated method stub
		
			ThemeSettings model=repo.save(settings);
			return model;
	}

}
