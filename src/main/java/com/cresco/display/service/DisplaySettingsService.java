package com.cresco.display.service;

import java.util.List;

import com.cresco.assesment.model.PrimaryKey;
import com.cresco.display.model.DisplaySettings;
import com.cresco.display.vo.Display;

public interface DisplaySettingsService {
public List<DisplaySettings> getAlloptions();
public DisplaySettings getOptionsByaname(Long id);
public DisplaySettings createOrUpdateoptions(Display displaysettings);
}
