package com.mfino.digilinq.catalog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.domain.DglCatSolItems;

/**
 * Spring Data JPA repository for the DglCatSolItems entity.
 */
@Repository
public interface DglCatSolItemsRepository extends JpaRepository<DglCatSolItems, Integer> {
    default Optional<DglCatSolItems> findOneWithEagerRelationships(Integer id) {
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
    Optional<DglCatSolItems> findOneWithToOneRelationships(@Param("id") Integer id);
}
