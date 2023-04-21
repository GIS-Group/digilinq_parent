package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCustContractConfig;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCustContractConfig entity.
 */
@Repository
public interface DglCustContractConfigRepository extends JpaRepository<DglCustContractConfig, Long> {
    default Optional<DglCustContractConfig> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCustContractConfig> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCustContractConfig> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCustContractConfig from DglCustContractConfig dglCustContractConfig left join fetch dglCustContractConfig.contract",
        countQuery = "select count(distinct dglCustContractConfig) from DglCustContractConfig dglCustContractConfig"
    )
    Page<DglCustContractConfig> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglCustContractConfig from DglCustContractConfig dglCustContractConfig left join fetch dglCustContractConfig.contract"
    )
    List<DglCustContractConfig> findAllWithToOneRelationships();

    @Query(
        "select dglCustContractConfig from DglCustContractConfig dglCustContractConfig left join fetch dglCustContractConfig.contract where dglCustContractConfig.id =:id"
    )
    Optional<DglCustContractConfig> findOneWithToOneRelationships(@Param("id") Long id);
}
