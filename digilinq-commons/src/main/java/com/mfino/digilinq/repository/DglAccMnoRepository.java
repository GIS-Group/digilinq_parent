package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglAccMno;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglAccMno entity.
 */
@Repository
public interface DglAccMnoRepository extends JpaRepository<DglAccMno, Long> {
    default Optional<DglAccMno> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglAccMno> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglAccMno> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglAccMno from DglAccMno dglAccMno left join fetch dglAccMno.accParent left join fetch dglAccMno.accMnoParent",
        countQuery = "select count(distinct dglAccMno) from DglAccMno dglAccMno"
    )
    Page<DglAccMno> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglAccMno from DglAccMno dglAccMno left join fetch dglAccMno.accParent left join fetch dglAccMno.accMnoParent")
    List<DglAccMno> findAllWithToOneRelationships();

    @Query(
        "select dglAccMno from DglAccMno dglAccMno left join fetch dglAccMno.accParent left join fetch dglAccMno.accMnoParent where dglAccMno.id =:id"
    )
    Optional<DglAccMno> findOneWithToOneRelationships(@Param("id") Long id);
}
