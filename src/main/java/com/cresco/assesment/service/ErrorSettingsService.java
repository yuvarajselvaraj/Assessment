package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.ErrorSettings;

public interface ErrorSettingsService {
public List<ErrorSettings> getallSettings();
public ErrorSettings getSettingsByName(Long id);
public ErrorSettings createOrUpdateSettings(ErrorSettings settings);
}
