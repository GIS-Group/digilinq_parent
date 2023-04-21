package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCustCustomFields;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCustCustomFields entity.
 */
@Repository
public interface DglCustCustomFieldsRepository extends JpaRepository<DglCustCustomFields, Long> {
    default Optional<DglCustCustomFields> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustCustomFields> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustCustomFields> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustCustomFields from DglCustCustomFields dglCustCustomFields left join fetch dglCustCustomFields.cust",
        countQuery = "select count(distinct dglCustCustomFields) from DglCustCustomFields dglCustCustomFields"
    )
    Page<DglCustCustomFields> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCustCustomFields from DglCustCustomFields dglCustCustomFields left join fetch dglCustCustomFields.cust")
    List<DglCustCustomFields> findAllWithToOneRelationships();

    @Query(
        "select dglCustCustomFields from DglCustCustomFields dglCustCustomFields left join fetch dglCustCustomFields.cust where dglCustCustomFields.id =:id"
    )
    Optional<DglCustCustomFields> findOneWithToOneRelationships(@Param("id") Long id);
}
