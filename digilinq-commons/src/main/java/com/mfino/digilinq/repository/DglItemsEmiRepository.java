package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglItemsEmi;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglItemsEmi entity.
 */
@Repository
public interface DglItemsEmiRepository extends JpaRepository<DglItemsEmi, Long> {
    default Optional<DglItemsEmi> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglItemsEmi> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglItemsEmi> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglItemsEmi from DglItemsEmi dglItemsEmi left join fetch dglItemsEmi.sol left join fetch dglItemsEmi.solItemVar",
        countQuery = "select count(distinct dglItemsEmi) from DglItemsEmi dglItemsEmi"
    )
    Page<DglItemsEmi> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglItemsEmi from DglItemsEmi dglItemsEmi left join fetch dglItemsEmi.sol left join fetch dglItemsEmi.solItemVar"
    )
    List<DglItemsEmi> findAllWithToOneRelationships();

    @Query(
        "select dglItemsEmi from DglItemsEmi dglItemsEmi left join fetch dglItemsEmi.sol left join fetch dglItemsEmi.solItemVar where dglItemsEmi.id =:id"
    )
    Optional<DglItemsEmi> findOneWithToOneRelationships(@Param("id") Long id);
}
