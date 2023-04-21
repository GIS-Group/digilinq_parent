package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglItemTax;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglItemTax entity.
 */
@Repository
public interface DglItemTaxRepository extends JpaRepository<DglItemTax, Long> {
    default Optional<DglItemTax> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglItemTax> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglItemTax> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglItemTax from DglItemTax dglItemTax left join fetch dglItemTax.item",
        countQuery = "select count(distinct dglItemTax) from DglItemTax dglItemTax"
    )
    Page<DglItemTax> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglItemTax from DglItemTax dglItemTax left join fetch dglItemTax.item")
    List<DglItemTax> findAllWithToOneRelationships();

    @Query("select dglItemTax from DglItemTax dglItemTax left join fetch dglItemTax.item where dglItemTax.id =:id")
    Optional<DglItemTax> findOneWithToOneRelationships(@Param("id") Long id);
}
