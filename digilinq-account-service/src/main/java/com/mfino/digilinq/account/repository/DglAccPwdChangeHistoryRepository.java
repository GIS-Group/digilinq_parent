package com.mfino.digilinq.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglAccPwdChangeHistory;

@Repository
public interface DglAccPwdChangeHistoryRepository extends JpaRepository<DglAccPwdChangeHistory, Long> {

	@Query("select dglAccPwdChangeHist from DglAccPwdChangeHistory dglAccPwdChangeHist where dglAccPwdChangeHist.userId =:userId order by dglAccPwdChangeHist.modifiedDate desc")
	List<DglAccPwdChangeHistory> fetchPwdChangeHistoryByUserId(@Param("userId") Long userId);
}
