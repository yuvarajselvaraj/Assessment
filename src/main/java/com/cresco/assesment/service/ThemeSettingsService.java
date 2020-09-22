package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.ThemeSettings;
import com.cresco.assesment.model.models.Themes;

public interface ThemeSettingsService {
public List<ThemeSettings> getallSettings();
public List<ThemeSettings> getSetingsByName(Long id);
public ThemeSettings createOrUpdateSettings(Themes settings);


}
