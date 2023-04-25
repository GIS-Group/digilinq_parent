package com.mfino.digilinq.account.repository;

import com.mfino.digilinq.domain.DglCustRoles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the DglCustRoles entity.
 */
@Repository
public interface DglCustRolesRepository extends JpaRepository<DglCustRoles, Long> {
    default Optional<DglCustRoles> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustRoles> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustRoles> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustRoles from DglCustRoles dglCustRoles left join fetch dglCustRoles.cust",
        countQuery = "select count(distinct dglCustRoles) from DglCustRoles dglCustRoles"
    )
    Page<DglCustRoles> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCustRoles from DglCustRoles dglCustRoles left join fetch dglCustRoles.cust")
    List<DglCustRoles> findAllWithToOneRelationships();

    @Query("select dglCustRoles from DglCustRoles dglCustRoles left join fetch dglCustRoles.cust where dglCustRoles.id =:id")
    Optional<DglCustRoles> findOneWithToOneRelationships(@Param("id") Long id);
}
