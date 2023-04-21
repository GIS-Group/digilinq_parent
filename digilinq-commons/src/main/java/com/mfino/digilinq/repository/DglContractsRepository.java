package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglContracts;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglContracts entity.
 */
@Repository
public interface DglContractsRepository extends JpaRepository<DglContracts, Long> {
    default Optional<DglContracts> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglContracts> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglContracts> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglContracts from DglContracts dglContracts left join fetch dglContracts.accMno left join fetch dglContracts.receivingParty",
        countQuery = "select count(distinct dglContracts) from DglContracts dglContracts"
    )
    Page<DglContracts> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglContracts from DglContracts dglContracts left join fetch dglContracts.accMno left join fetch dglContracts.receivingParty"
    )
    List<DglContracts> findAllWithToOneRelationships();

    @Query(
        "select dglContracts from DglContracts dglContracts left join fetch dglContracts.accMno left join fetch dglContracts.receivingParty where dglContracts.id =:id"
    )
    Optional<DglContracts> findOneWithToOneRelationships(@Param("id") Long id);
}
