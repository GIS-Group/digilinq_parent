package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCustomer;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCustomer entity.
 */
@Repository
public interface DglCustomerRepository extends JpaRepository<DglCustomer, Long> {
    default Optional<DglCustomer> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustomer> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustomer> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustomer from DglCustomer dglCustomer left join fetch dglCustomer.custParent left join fetch dglCustomer.accMnoParent",
        countQuery = "select count(distinct dglCustomer) from DglCustomer dglCustomer"
    )
    Page<DglCustomer> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglCustomer from DglCustomer dglCustomer left join fetch dglCustomer.custParent left join fetch dglCustomer.accMnoParent"
    )
    List<DglCustomer> findAllWithToOneRelationships();

    @Query(
        "select dglCustomer from DglCustomer dglCustomer left join fetch dglCustomer.custParent left join fetch dglCustomer.accMnoParent where dglCustomer.id =:id"
    )
    Optional<DglCustomer> findOneWithToOneRelationships(@Param("id") Long id);
}
