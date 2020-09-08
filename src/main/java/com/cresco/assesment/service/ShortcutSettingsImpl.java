package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.ShortcutSettings;
import com.cresco.assesment.repository.ShortcutSettingsRepo;
@Service
public class ShortcutSettingsImpl implements ShortcutSettingsService {
@Autowired
ShortcutSettingsRepo repo;
	@Override
	public List<ShortcutSettings> getallSettings() {
		// TODO Auto-generated method stub
		List<ShortcutSettings> settings=repo.findAll();
		return settings;
	}

	@Override
	public List<ShortcutSettings> getSettingsByName(Long id) {
		// TODO Auto-generated method stub
		List<ShortcutSettings> settings=repo.findByassessmentid(id);
		return settings;
	}

	@Override
	public ShortcutSettings createOrUpdateSettings(ShortcutSettings settings) {
		// TODO Auto-generated method stub
		ShortcutSettings model=repo.save(settings);
		return model;
	}

}
