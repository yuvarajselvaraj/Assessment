package com.cresco.themes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.themes.model.ThemeSettings;
import com.cresco.themes.repo.ThemeSettingsRepo;
import com.cresco.themes.vo.Themes;
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
	public ThemeSettings createOrUpdateSettings(Themes model) {
		// TODO Auto-generated method stub
		ThemeSettings setting=new ThemeSettings();
		PrimaryKey key=new PrimaryKey();
		AssesmentProperties pro=new AssesmentProperties();
		pro.setAssessment_id(model.getAssessment_id());
		key.setAssessment(pro);
		setting.setPrimaryKey(key);
		setting.setModes(model.getModes());
		setting.setThemes(model.getThemes());
			ThemeSettings model1=repo.save(setting);
			return model1;
	}

}
