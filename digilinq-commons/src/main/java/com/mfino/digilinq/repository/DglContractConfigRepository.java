package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglContractConfig;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglContractConfig entity.
 */
@Repository
public interface DglContractConfigRepository extends JpaRepository<DglContractConfig, Long> {
    default Optional<DglContractConfig> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglContractConfig> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglContractConfig> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglContractConfig from DglContractConfig dglContractConfig left join fetch dglContractConfig.contract",
        countQuery = "select count(distinct dglContractConfig) from DglContractConfig dglContractConfig"
    )
    Page<DglContractConfig> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglContractConfig from DglContractConfig dglContractConfig left join fetch dglContractConfig.contract")
    List<DglContractConfig> findAllWithToOneRelationships();

    @Query(
        "select dglContractConfig from DglContractConfig dglContractConfig left join fetch dglContractConfig.contract where dglContractConfig.id =:id"
    )
    Optional<DglContractConfig> findOneWithToOneRelationships(@Param("id") Long id);
}
