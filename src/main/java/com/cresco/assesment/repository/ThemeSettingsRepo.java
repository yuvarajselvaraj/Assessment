package com.cresco.assesment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.SectionProperties;
import com.cresco.assesment.model.ThemeSettings;
@Repository
public interface ThemeSettingsRepo extends JpaRepository<ThemeSettings, PrimaryKey> {
	@Query(value="select * from theme_settings where assessment_id=?1",nativeQuery=true)
	List<ThemeSettings> findByassessmentid(Long id);
}
