package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCatItemVar;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatItemVar entity.
 */
@Repository
public interface DglCatItemVarRepository extends JpaRepository<DglCatItemVar, Long> {
    default Optional<DglCatItemVar> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCatItemVar> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCatItemVar> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCatItemVar from DglCatItemVar dglCatItemVar left join fetch dglCatItemVar.item",
        countQuery = "select count(distinct dglCatItemVar) from DglCatItemVar dglCatItemVar"
    )
    Page<DglCatItemVar> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCatItemVar from DglCatItemVar dglCatItemVar left join fetch dglCatItemVar.item")
    List<DglCatItemVar> findAllWithToOneRelationships();

    @Query("select dglCatItemVar from DglCatItemVar dglCatItemVar left join fetch dglCatItemVar.item where dglCatItemVar.id =:id")
    Optional<DglCatItemVar> findOneWithToOneRelationships(@Param("id") Long id);
}
