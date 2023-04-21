package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCatSolItems;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatSolItems entity.
 */
@Repository
public interface DglCatSolItemsRepository extends JpaRepository<DglCatSolItems, Long> {
    default Optional<DglCatSolItems> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCatSolItems> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCatSolItems> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCatSolItems from DglCatSolItems dglCatSolItems left join fetch dglCatSolItems.sol",
        countQuery = "select count(distinct dglCatSolItems) from DglCatSolItems dglCatSolItems"
    )
    Page<DglCatSolItems> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCatSolItems from DglCatSolItems dglCatSolItems left join fetch dglCatSolItems.sol")
    List<DglCatSolItems> findAllWithToOneRelationships();

    @Query("select dglCatSolItems from DglCatSolItems dglCatSolItems left join fetch dglCatSolItems.sol where dglCatSolItems.id =:id")
    Optional<DglCatSolItems> findOneWithToOneRelationships(@Param("id") Long id);
}
