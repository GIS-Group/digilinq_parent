package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCashbksConfig;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCashbksConfig entity.
 */
@Repository
public interface DglCashbksConfigRepository extends JpaRepository<DglCashbksConfig, Long> {
    default Optional<DglCashbksConfig> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCashbksConfig> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCashbksConfig> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCashbksConfig from DglCashbksConfig dglCashbksConfig left join fetch dglCashbksConfig.cashbk",
        countQuery = "select count(distinct dglCashbksConfig) from DglCashbksConfig dglCashbksConfig"
    )
    Page<DglCashbksConfig> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCashbksConfig from DglCashbksConfig dglCashbksConfig left join fetch dglCashbksConfig.cashbk")
    List<DglCashbksConfig> findAllWithToOneRelationships();

    @Query(
        "select dglCashbksConfig from DglCashbksConfig dglCashbksConfig left join fetch dglCashbksConfig.cashbk where dglCashbksConfig.id =:id"
    )
    Optional<DglCashbksConfig> findOneWithToOneRelationships(@Param("id") Long id);
}
