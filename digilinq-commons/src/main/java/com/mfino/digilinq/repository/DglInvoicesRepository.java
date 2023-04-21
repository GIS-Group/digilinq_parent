package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglInvoices;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglInvoices entity.
 */
@Repository
public interface DglInvoicesRepository extends JpaRepository<DglInvoices, Long> {
    default Optional<DglInvoices> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglInvoices> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglInvoices> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglInvoices from DglInvoices dglInvoices left join fetch dglInvoices.order",
        countQuery = "select count(distinct dglInvoices) from DglInvoices dglInvoices"
    )
    Page<DglInvoices> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglInvoices from DglInvoices dglInvoices left join fetch dglInvoices.order")
    List<DglInvoices> findAllWithToOneRelationships();

    @Query("select dglInvoices from DglInvoices dglInvoices left join fetch dglInvoices.order where dglInvoices.id =:id")
    Optional<DglInvoices> findOneWithToOneRelationships(@Param("id") Long id);
}
