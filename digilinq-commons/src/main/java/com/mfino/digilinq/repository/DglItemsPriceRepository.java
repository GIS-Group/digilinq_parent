package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglItemsPrice;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglItemsPrice entity.
 */
@Repository
public interface DglItemsPriceRepository extends JpaRepository<DglItemsPrice, Long> {
    default Optional<DglItemsPrice> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglItemsPrice> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglItemsPrice> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglItemsPrice from DglItemsPrice dglItemsPrice left join fetch dglItemsPrice.solution left join fetch dglItemsPrice.solItemVar",
        countQuery = "select count(distinct dglItemsPrice) from DglItemsPrice dglItemsPrice"
    )
    Page<DglItemsPrice> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglItemsPrice from DglItemsPrice dglItemsPrice left join fetch dglItemsPrice.solution left join fetch dglItemsPrice.solItemVar"
    )
    List<DglItemsPrice> findAllWithToOneRelationships();

    @Query(
        "select dglItemsPrice from DglItemsPrice dglItemsPrice left join fetch dglItemsPrice.solution left join fetch dglItemsPrice.solItemVar where dglItemsPrice.id =:id"
    )
    Optional<DglItemsPrice> findOneWithToOneRelationships(@Param("id") Long id);
}
