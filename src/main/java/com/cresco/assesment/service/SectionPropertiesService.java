package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.vo.Section;

public interface SectionPropertiesService {
public List<SectionProperties> getAllSections();
public List<SectionProperties> getSectionsByname(Long id);
public SectionProperties createSections(Section properties);
public void deleteBySectionAndName(Long section);
public void updateSections(Section properties);
}
