package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglNotificationsLog;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglNotificationsLog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglNotificationsLogRepository extends JpaRepository<DglNotificationsLog, Long> {}
