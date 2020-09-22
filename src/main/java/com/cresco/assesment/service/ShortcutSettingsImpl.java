package com.cresco.assesment.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.ShortcutSettings;
import com.cresco.assesment.model.models.Shortcut;
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
	public ShortcutSettings createOrUpdateSettings(Shortcut model) {
		// TODO Auto-generated method stub
		ShortcutSettings settings=new ShortcutSettings();
		PrimaryKey key=new PrimaryKey();
		AssesmentProperties pro=new AssesmentProperties();
		pro.setAssessment_id(model.getAssessment_id());
		key.setAssessment(pro);
		settings.setPrimaryKey(key);
		settings.setNo_of_options(model.getNo_of_options());
		settings.setOptions(model.getOptions());
		settings.setShortcut(model.getShortcut());
		ShortcutSettings model1=repo.save(settings);
		return model1;
	}

}
