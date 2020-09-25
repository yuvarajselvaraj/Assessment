package com.cresco.themes.service;

import java.util.List;

import com.cresco.themes.model.ThemeSettings;
import com.cresco.themes.vo.Themes;

public interface ThemeSettingsService {
public List<ThemeSettings> getallSettings();
public List<ThemeSettings> getSetingsByName(Long id);
public ThemeSettings createOrUpdateSettings(Themes settings);


}
