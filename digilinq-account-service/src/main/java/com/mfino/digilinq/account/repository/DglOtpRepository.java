package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglOtp;

@Repository
public interface DglOtpRepository extends JpaRepository<DglOtp, Long> {

	DglOtp findByReferenceId(Long referenceId);
}
