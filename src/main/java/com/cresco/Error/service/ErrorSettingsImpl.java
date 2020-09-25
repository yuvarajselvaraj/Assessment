package com.cresco.Error.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cresco.Error.model.ErrorSettings;
import com.cresco.Error.repo.ErrorSettingsRepo;
import com.cresco.Error.vo.Error;
import com.cresco.assesment.model.AssesmentProperties;
import com.cresco.assesment.model.PrimaryKey;
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
	public ErrorSettings createOrUpdateSettings(Error model) {
		// TODO Auto-generated method stub
		ErrorSettings settings=new ErrorSettings();
		PrimaryKey key=new PrimaryKey();
		AssesmentProperties pro=new AssesmentProperties();
		pro.setAssessment_id(model.getAssessment_id());
		key.setAssessment(pro);
		settings.setPrimaryKey(key);
		settings.setInternet_issue(model.getInternet_issue());
		settings.setMic_issue(model.getMic_issue());
		settings.setProctor_alert(model.getProctor_alert());
		settings.setServer_issue(model.getServer_issue());
		settings.setWebcam_issue(model.getWebcam_issue());
		ErrorSettings model1=repo.save(settings);
		return model1;
	}

}
