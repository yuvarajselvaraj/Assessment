package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.AccessbilitySettings;
import com.cresco.assesment.model.models.Accessbility;

public interface AccessbilitySettingsService {
public List<AccessbilitySettings> getalloptions();
public List<AccessbilitySettings> getOptionsByName(Long id);
public AccessbilitySettings  createOrUpdateoptions(Accessbility settings);

}
