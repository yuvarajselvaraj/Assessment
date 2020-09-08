package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.ShortcutSettings;

public interface ShortcutSettingsService {
public List<ShortcutSettings> getallSettings();
public List<ShortcutSettings> getSettingsByName(Long id);
public ShortcutSettings createOrUpdateSettings(ShortcutSettings settings);
}
