package com.mfino.digilinq.account.repository;

import com.mfino.digilinq.domain.DglRoles;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data JPA repository for the DglRoles entity.
 */
@Repository
public interface DglRolesRepository extends JpaRepository<DglRoles, Long> {
    default Optional<DglRoles> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglRoles> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglRoles> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglRoles from DglRoles dglRoles left join fetch dglRoles.accMno",
        countQuery = "select count(distinct dglRoles) from DglRoles dglRoles"
    )
    Page<DglRoles> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglRoles from DglRoles dglRoles left join fetch dglRoles.accMno")
    List<DglRoles> findAllWithToOneRelationships();

    @Query("select dglRoles from DglRoles dglRoles left join fetch dglRoles.accMno where dglRoles.id =:id")
    Optional<DglRoles> findOneWithToOneRelationships(@Param("id") Long id);
}
