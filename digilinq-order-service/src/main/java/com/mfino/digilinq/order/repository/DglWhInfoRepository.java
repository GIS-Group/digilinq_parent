package com.mfino.digilinq.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.domain.DglWhInfo;



/**
 * @author Sai Srinivas M
 *
 */
@Repository
public interface DglWhInfoRepository extends JpaRepository<DglWhInfo, Integer> {

}
