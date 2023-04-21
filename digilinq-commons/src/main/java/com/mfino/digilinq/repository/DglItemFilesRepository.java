package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglItemFiles;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglItemFiles entity.
 */
@Repository
public interface DglItemFilesRepository extends JpaRepository<DglItemFiles, Long> {
    default Optional<DglItemFiles> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglItemFiles> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglItemFiles> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglItemFiles from DglItemFiles dglItemFiles left join fetch dglItemFiles.item",
        countQuery = "select count(distinct dglItemFiles) from DglItemFiles dglItemFiles"
    )
    Page<DglItemFiles> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglItemFiles from DglItemFiles dglItemFiles left join fetch dglItemFiles.item")
    List<DglItemFiles> findAllWithToOneRelationships();

    @Query("select dglItemFiles from DglItemFiles dglItemFiles left join fetch dglItemFiles.item where dglItemFiles.id =:id")
    Optional<DglItemFiles> findOneWithToOneRelationships(@Param("id") Long id);
}
