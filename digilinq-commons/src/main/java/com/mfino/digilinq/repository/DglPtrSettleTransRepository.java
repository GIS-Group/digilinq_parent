package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglPtrSettleTrans;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglPtrSettleTrans entity.
 */
@Repository
public interface DglPtrSettleTransRepository extends JpaRepository<DglPtrSettleTrans, Long> {
    default Optional<DglPtrSettleTrans> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglPtrSettleTrans> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglPtrSettleTrans> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglPtrSettleTrans from DglPtrSettleTrans dglPtrSettleTrans left join fetch dglPtrSettleTrans.order",
        countQuery = "select count(distinct dglPtrSettleTrans) from DglPtrSettleTrans dglPtrSettleTrans"
    )
    Page<DglPtrSettleTrans> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglPtrSettleTrans from DglPtrSettleTrans dglPtrSettleTrans left join fetch dglPtrSettleTrans.order")
    List<DglPtrSettleTrans> findAllWithToOneRelationships();

    @Query(
        "select dglPtrSettleTrans from DglPtrSettleTrans dglPtrSettleTrans left join fetch dglPtrSettleTrans.order where dglPtrSettleTrans.id =:id"
    )
    Optional<DglPtrSettleTrans> findOneWithToOneRelationships(@Param("id") Long id);
}
