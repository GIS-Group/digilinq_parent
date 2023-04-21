package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCustFiles;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCustFiles entity.
 */
@Repository
public interface DglCustFilesRepository extends JpaRepository<DglCustFiles, Long> {
    default Optional<DglCustFiles> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustFiles> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustFiles> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustFiles from DglCustFiles dglCustFiles left join fetch dglCustFiles.docPol left join fetch dglCustFiles.cust",
        countQuery = "select count(distinct dglCustFiles) from DglCustFiles dglCustFiles"
    )
    Page<DglCustFiles> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglCustFiles from DglCustFiles dglCustFiles left join fetch dglCustFiles.docPol left join fetch dglCustFiles.cust"
    )
    List<DglCustFiles> findAllWithToOneRelationships();

    @Query(
        "select dglCustFiles from DglCustFiles dglCustFiles left join fetch dglCustFiles.docPol left join fetch dglCustFiles.cust where dglCustFiles.id =:id"
    )
    Optional<DglCustFiles> findOneWithToOneRelationships(@Param("id") Long id);
}
