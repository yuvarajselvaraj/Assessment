package com.cresco.assesment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.DisplaySettings;
import com.cresco.assesment.model.PrimaryKey;
@Repository
public interface DisplaySettingsRepo extends JpaRepository<DisplaySettings, PrimaryKey> {
@Query(value="select * from display_settings where assessment_id=?1",nativeQuery=true)
Optional<DisplaySettings> findbyid(Long AssessmentId);

}
