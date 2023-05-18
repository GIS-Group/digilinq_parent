package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglAccUniqueFeilds;

@Repository
public interface DglAccUniqueFeildsRepository extends JpaRepository<DglAccUniqueFeilds, Long>{
   
	DglAccUniqueFeilds findByName(String name);
}
