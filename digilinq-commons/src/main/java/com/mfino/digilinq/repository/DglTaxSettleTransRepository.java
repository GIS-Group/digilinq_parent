package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglTaxSettleTrans;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglTaxSettleTrans entity.
 */
@Repository
public interface DglTaxSettleTransRepository extends JpaRepository<DglTaxSettleTrans, Long> {
    default Optional<DglTaxSettleTrans> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglTaxSettleTrans> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglTaxSettleTrans> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglTaxSettleTrans from DglTaxSettleTrans dglTaxSettleTrans left join fetch dglTaxSettleTrans.order",
        countQuery = "select count(distinct dglTaxSettleTrans) from DglTaxSettleTrans dglTaxSettleTrans"
    )
    Page<DglTaxSettleTrans> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglTaxSettleTrans from DglTaxSettleTrans dglTaxSettleTrans left join fetch dglTaxSettleTrans.order")
    List<DglTaxSettleTrans> findAllWithToOneRelationships();

    @Query(
        "select dglTaxSettleTrans from DglTaxSettleTrans dglTaxSettleTrans left join fetch dglTaxSettleTrans.order where dglTaxSettleTrans.id =:id"
    )
    Optional<DglTaxSettleTrans> findOneWithToOneRelationships(@Param("id") Long id);
}
