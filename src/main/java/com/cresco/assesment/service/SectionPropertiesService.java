package com.cresco.assesment.service;

import java.util.List;

import com.cresco.assesment.model.SectionProperties;

public interface SectionPropertiesService {
public List<SectionProperties> getAllSections();
public List<SectionProperties> getSectionsByname(Long id);
public SectionProperties createOrUpdateSections(SectionProperties properties);
public void deleteBySectionAndName(Long section);
}
