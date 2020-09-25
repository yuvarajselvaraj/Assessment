package com.cresco.Error.service;

import java.util.List;

import com.cresco.Error.model.ErrorSettings;
import com.cresco.Error.vo.Error;

public interface ErrorSettingsService {
public List<ErrorSettings> getallSettings();
public ErrorSettings getSettingsByName(Long id);
public ErrorSettings createOrUpdateSettings(Error model);
}
