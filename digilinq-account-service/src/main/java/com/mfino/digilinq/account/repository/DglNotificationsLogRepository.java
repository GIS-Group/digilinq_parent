package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglNotificationsLog;

/**
 * Spring Data  repository for the DglNotificationsLog entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglNotificationsLogRepository extends JpaRepository<DglNotificationsLog, Long> {
}
