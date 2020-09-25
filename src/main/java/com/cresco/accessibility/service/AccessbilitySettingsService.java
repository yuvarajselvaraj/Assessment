package com.cresco.accessibility.service;

import java.util.List;

import com.cresco.accessibility.model.AccessbilitySettings;
import com.cresco.accessibility.vo.Accessbility;

public interface AccessbilitySettingsService {
public List<AccessbilitySettings> getalloptions();
public List<AccessbilitySettings> getOptionsByName(Long id);
public AccessbilitySettings  createOrUpdateoptions(Accessbility settings);

}
