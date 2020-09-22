package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.DisplaySettings;
import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.models.Display;

public interface DisplaySettingsService {
public List<DisplaySettings> getAlloptions();
public DisplaySettings getOptionsByaname(Long id);
public DisplaySettings createOrUpdateoptions(Display displaysettings);
}
