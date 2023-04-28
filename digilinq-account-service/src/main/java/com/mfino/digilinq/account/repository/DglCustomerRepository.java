package com.mfino.digilinq.account.repository;

import com.mfino.digilinq.domain.DglCustomer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the DglCustomer entity.
 */
@Repository
public interface DglCustomerRepository extends JpaRepository<DglCustomer, Integer> {
    default Optional<DglCustomer> findOneWithEagerRelationships(Integer id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustomer> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustomer> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustomer from DglCustomer dglCustomer left join fetch dglCustomer.accMnoParent",
        countQuery = "select count(distinct dglCustomer) from DglCustomer dglCustomer"
    )
    Page<DglCustomer> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglCustomer from DglCustomer dglCustomer left join fetch dglCustomer.accMnoParent"
    )
    List<DglCustomer> findAllWithToOneRelationships();

    @Query(
        "select dglCustomer from DglCustomer dglCustomer left join fetch dglCustomer.accMnoParent where dglCustomer.customerId =:id"
    )
    Optional<DglCustomer> findOneWithToOneRelationships(@Param("id") Integer id);
}
