package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglAccMnoCustomFields;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglAccMnoCustomFields entity.
 */
@Repository
public interface DglAccMnoCustomFieldsRepository extends JpaRepository<DglAccMnoCustomFields, Long> {
    default Optional<DglAccMnoCustomFields> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglAccMnoCustomFields> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglAccMnoCustomFields> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglAccMnoCustomFields from DglAccMnoCustomFields dglAccMnoCustomFields left join fetch dglAccMnoCustomFields.accMno",
        countQuery = "select count(distinct dglAccMnoCustomFields) from DglAccMnoCustomFields dglAccMnoCustomFields"
    )
    Page<DglAccMnoCustomFields> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglAccMnoCustomFields from DglAccMnoCustomFields dglAccMnoCustomFields left join fetch dglAccMnoCustomFields.accMno"
    )
    List<DglAccMnoCustomFields> findAllWithToOneRelationships();

    @Query(
        "select dglAccMnoCustomFields from DglAccMnoCustomFields dglAccMnoCustomFields left join fetch dglAccMnoCustomFields.accMno where dglAccMnoCustomFields.id =:id"
    )
    Optional<DglAccMnoCustomFields> findOneWithToOneRelationships(@Param("id") Long id);
}
