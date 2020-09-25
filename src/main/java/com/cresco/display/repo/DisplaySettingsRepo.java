package com.cresco.display.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.assesment.model.PrimaryKey;
import com.cresco.display.model.DisplaySettings;
@Repository
public interface DisplaySettingsRepo extends JpaRepository<DisplaySettings, PrimaryKey> {
@Query(value="select * from display_settings where assessment_id=?1",nativeQuery=true)
Optional<DisplaySettings> findbyid(Long AssessmentId);

}
