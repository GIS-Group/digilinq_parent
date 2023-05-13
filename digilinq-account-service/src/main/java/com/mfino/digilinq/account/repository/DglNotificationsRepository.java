package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglNotifications;

/**
 * Spring Data  repository for the DglNotifications entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglNotificationsRepository extends JpaRepository<DglNotifications, Long> {
}
