package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglProvSettleTrans;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglProvSettleTrans entity.
 */
@Repository
public interface DglProvSettleTransRepository extends JpaRepository<DglProvSettleTrans, Long> {
    default Optional<DglProvSettleTrans> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglProvSettleTrans> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglProvSettleTrans> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglProvSettleTrans from DglProvSettleTrans dglProvSettleTrans left join fetch dglProvSettleTrans.order",
        countQuery = "select count(distinct dglProvSettleTrans) from DglProvSettleTrans dglProvSettleTrans"
    )
    Page<DglProvSettleTrans> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglProvSettleTrans from DglProvSettleTrans dglProvSettleTrans left join fetch dglProvSettleTrans.order")
    List<DglProvSettleTrans> findAllWithToOneRelationships();

    @Query(
        "select dglProvSettleTrans from DglProvSettleTrans dglProvSettleTrans left join fetch dglProvSettleTrans.order where dglProvSettleTrans.id =:id"
    )
    Optional<DglProvSettleTrans> findOneWithToOneRelationships(@Param("id") Long id);
}
