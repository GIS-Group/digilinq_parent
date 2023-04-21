package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglOrdPayments;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOrdPayments entity.
 */
@Repository
public interface DglOrdPaymentsRepository extends JpaRepository<DglOrdPayments, Long> {
    default Optional<DglOrdPayments> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglOrdPayments> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglOrdPayments> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglOrdPayments from DglOrdPayments dglOrdPayments left join fetch dglOrdPayments.ord",
        countQuery = "select count(distinct dglOrdPayments) from DglOrdPayments dglOrdPayments"
    )
    Page<DglOrdPayments> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglOrdPayments from DglOrdPayments dglOrdPayments left join fetch dglOrdPayments.ord")
    List<DglOrdPayments> findAllWithToOneRelationships();

    @Query("select dglOrdPayments from DglOrdPayments dglOrdPayments left join fetch dglOrdPayments.ord where dglOrdPayments.id =:id")
    Optional<DglOrdPayments> findOneWithToOneRelationships(@Param("id") Long id);
}
