package com.mfino.digilinq.account.repository;

import com.mfino.digilinq.domain.DglCustUsers;
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
 * Spring Data JPA repository for the DglCustUsers entity.
 */
@Repository
public interface DglCustUsersRepository extends JpaRepository<DglCustUsers, Long> {
    default Optional<DglCustUsers> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustUsers> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustUsers> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustUsers from DglCustUsers dglCustUsers left join fetch dglCustUsers.role left join fetch dglCustUsers.acc",
        countQuery = "select count(distinct dglCustUsers) from DglCustUsers dglCustUsers"
    )
    Page<DglCustUsers> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCustUsers from DglCustUsers dglCustUsers left join fetch dglCustUsers.role left join fetch dglCustUsers.acc")
    List<DglCustUsers> findAllWithToOneRelationships();

    @Query(
        "select dglCustUsers from DglCustUsers dglCustUsers left join fetch dglCustUsers.role left join fetch dglCustUsers.acc where dglCustUsers.custUserId =:id"
    )
    Optional<DglCustUsers> findOneWithToOneRelationships(@Param("id") Long id);

    Optional<DglCustUsers> findByAcc(DglCustomer customerId);
    List<DglCustUsers> findAllByCustType(String customerType);
}
