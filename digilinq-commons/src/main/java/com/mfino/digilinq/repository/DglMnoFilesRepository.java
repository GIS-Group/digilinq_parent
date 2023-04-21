package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMnoFiles;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMnoFiles entity.
 */
@Repository
public interface DglMnoFilesRepository extends JpaRepository<DglMnoFiles, Long> {
    default Optional<DglMnoFiles> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglMnoFiles> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglMnoFiles> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglMnoFiles from DglMnoFiles dglMnoFiles left join fetch dglMnoFiles.docPol left join fetch dglMnoFiles.accMno",
        countQuery = "select count(distinct dglMnoFiles) from DglMnoFiles dglMnoFiles"
    )
    Page<DglMnoFiles> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglMnoFiles from DglMnoFiles dglMnoFiles left join fetch dglMnoFiles.docPol left join fetch dglMnoFiles.accMno")
    List<DglMnoFiles> findAllWithToOneRelationships();

    @Query(
        "select dglMnoFiles from DglMnoFiles dglMnoFiles left join fetch dglMnoFiles.docPol left join fetch dglMnoFiles.accMno where dglMnoFiles.id =:id"
    )
    Optional<DglMnoFiles> findOneWithToOneRelationships(@Param("id") Long id);
}
