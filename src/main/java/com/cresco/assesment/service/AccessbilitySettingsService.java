package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.AccessbilitySettings;

public interface AccessbilitySettingsService {
public List<AccessbilitySettings> getalloptions();
public AccessbilitySettings getOptionsByName(Long id);
public AccessbilitySettings  createOrUpdateoptions(AccessbilitySettings settings);

}
