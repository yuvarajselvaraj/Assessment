package com.cresco.accessibility.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cresco.accessibility.model.AccessbilitySettings;
import com.cresco.assesment.model.PrimaryKey;
@Repository
public interface AccessbilitySettingsRepo extends JpaRepository<AccessbilitySettings,PrimaryKey> {

	@Query(value="select * from accessbility_settings where assessment_id=?1",nativeQuery=true)
	Optional<AccessbilitySettings> getbyid(Long AssessmentId);
}
