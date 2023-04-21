package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCshbkSettleTrans;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCshbkSettleTrans entity.
 */
@Repository
public interface DglCshbkSettleTransRepository extends JpaRepository<DglCshbkSettleTrans, Long> {
    default Optional<DglCshbkSettleTrans> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCshbkSettleTrans> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCshbkSettleTrans> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCshbkSettleTrans from DglCshbkSettleTrans dglCshbkSettleTrans left join fetch dglCshbkSettleTrans.order",
        countQuery = "select count(distinct dglCshbkSettleTrans) from DglCshbkSettleTrans dglCshbkSettleTrans"
    )
    Page<DglCshbkSettleTrans> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCshbkSettleTrans from DglCshbkSettleTrans dglCshbkSettleTrans left join fetch dglCshbkSettleTrans.order")
    List<DglCshbkSettleTrans> findAllWithToOneRelationships();

    @Query(
        "select dglCshbkSettleTrans from DglCshbkSettleTrans dglCshbkSettleTrans left join fetch dglCshbkSettleTrans.order where dglCshbkSettleTrans.id =:id"
    )
    Optional<DglCshbkSettleTrans> findOneWithToOneRelationships(@Param("id") Long id);
}
