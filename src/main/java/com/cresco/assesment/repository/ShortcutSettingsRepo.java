package com.cresco.assesment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.PrimaryKey;
import com.cresco.assesment.model.ShortcutSettings;
@Repository
public interface ShortcutSettingsRepo extends JpaRepository<ShortcutSettings, PrimaryKey> {
	@Query(value="select * from shortcut_settings where assessment_id=?1",nativeQuery=true)
	List<ShortcutSettings> findByassessmentid(Long id);
}
