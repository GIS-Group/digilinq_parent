package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglNotifications;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglNotifications entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglNotificationsRepository extends JpaRepository<DglNotifications, Long> {}
