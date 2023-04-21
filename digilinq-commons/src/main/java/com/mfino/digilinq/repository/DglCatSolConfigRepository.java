package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCatSolConfig;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatSolConfig entity.
 */
@Repository
public interface DglCatSolConfigRepository extends JpaRepository<DglCatSolConfig, Long> {
    default Optional<DglCatSolConfig> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCatSolConfig> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCatSolConfig> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCatSolConfig from DglCatSolConfig dglCatSolConfig left join fetch dglCatSolConfig.sol",
        countQuery = "select count(distinct dglCatSolConfig) from DglCatSolConfig dglCatSolConfig"
    )
    Page<DglCatSolConfig> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCatSolConfig from DglCatSolConfig dglCatSolConfig left join fetch dglCatSolConfig.sol")
    List<DglCatSolConfig> findAllWithToOneRelationships();

    @Query("select dglCatSolConfig from DglCatSolConfig dglCatSolConfig left join fetch dglCatSolConfig.sol where dglCatSolConfig.id =:id")
    Optional<DglCatSolConfig> findOneWithToOneRelationships(@Param("id") Long id);
}
