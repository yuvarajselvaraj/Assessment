package com.cresco.shortcut.service;

import java.util.List;

import com.cresco.shortcut.model.ShortcutSettings;
import com.cresco.shortcut.vo.Shortcut;

public interface ShortcutSettingsService {
public List<ShortcutSettings> getallSettings();
public List<ShortcutSettings> getSettingsByName(Long id);
public ShortcutSettings createOrUpdateSettings(Shortcut settings);
}
