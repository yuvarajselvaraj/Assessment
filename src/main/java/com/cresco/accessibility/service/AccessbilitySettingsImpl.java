package com.cresco.accessibility.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.accessibility.model.AccessbilitySettings;
import com.cresco.accessibility.repo.AccessbilitySettingsRepo;
import com.cresco.accessibility.vo.Accessbility;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.PrimaryKey;
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
	public List<AccessbilitySettings> getOptionsByName(Long id) {
		// TODO Auto-generated method stub
		List<AccessbilitySettings> model=new ArrayList<AccessbilitySettings>();
		Optional<AccessbilitySettings> settings=repo.getbyid(id);
		model.add(settings.get());
		return model;
	}

	@Override
	public AccessbilitySettings createOrUpdateoptions(Accessbility model) {
		// TODO Auto-generated method stub
		AccessbilitySettings setting=new AccessbilitySettings();
		AssesmentProperties ap=new AssesmentProperties();
		ap.setAssessment_id(model.getAssessment_id());
		PrimaryKey key=new PrimaryKey();
		key.setAssessment(ap);
		setting.setPrimarykey(key);
		setting.setAccessbility(model.getAccessbility());
		setting.setNegative_mark(model.getNegative_mark());
		AccessbilitySettings models=repo.save(setting);
		return models;
	}

}
