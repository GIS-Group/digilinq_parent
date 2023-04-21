package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglOrdItems;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOrdItems entity.
 */
@Repository
public interface DglOrdItemsRepository extends JpaRepository<DglOrdItems, Long> {
    default Optional<DglOrdItems> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglOrdItems> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglOrdItems> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglOrdItems from DglOrdItems dglOrdItems left join fetch dglOrdItems.ordInfo",
        countQuery = "select count(distinct dglOrdItems) from DglOrdItems dglOrdItems"
    )
    Page<DglOrdItems> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglOrdItems from DglOrdItems dglOrdItems left join fetch dglOrdItems.ordInfo")
    List<DglOrdItems> findAllWithToOneRelationships();

    @Query("select dglOrdItems from DglOrdItems dglOrdItems left join fetch dglOrdItems.ordInfo where dglOrdItems.id =:id")
    Optional<DglOrdItems> findOneWithToOneRelationships(@Param("id") Long id);
}
