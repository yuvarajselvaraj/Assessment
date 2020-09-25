package com.cresco.Error.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.Error.model.ErrorSettings;
import com.cresco.assesment.model.PrimaryKey;
@Repository
public interface ErrorSettingsRepo extends JpaRepository<ErrorSettings, PrimaryKey> {
	@Query(value="select * from error_settings where assessment_id=?1",nativeQuery=true)
	Optional<ErrorSettings> getbyid(Long AssessmentId);
}
