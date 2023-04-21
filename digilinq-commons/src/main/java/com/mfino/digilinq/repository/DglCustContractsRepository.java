package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCustContracts;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCustContracts entity.
 */
@Repository
public interface DglCustContractsRepository extends JpaRepository<DglCustContracts, Long> {
    default Optional<DglCustContracts> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustContracts> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustContracts> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustContracts from DglCustContracts dglCustContracts left join fetch dglCustContracts.accMno left join fetch dglCustContracts.receivingParty",
        countQuery = "select count(distinct dglCustContracts) from DglCustContracts dglCustContracts"
    )
    Page<DglCustContracts> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglCustContracts from DglCustContracts dglCustContracts left join fetch dglCustContracts.accMno left join fetch dglCustContracts.receivingParty"
    )
    List<DglCustContracts> findAllWithToOneRelationships();

    @Query(
        "select dglCustContracts from DglCustContracts dglCustContracts left join fetch dglCustContracts.accMno left join fetch dglCustContracts.receivingParty where dglCustContracts.id =:id"
    )
    Optional<DglCustContracts> findOneWithToOneRelationships(@Param("id") Long id);
}
