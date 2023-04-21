package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCatItemsInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatItemsInfo entity.
 */
@Repository
public interface DglCatItemsInfoRepository extends JpaRepository<DglCatItemsInfo, Long> {
    default Optional<DglCatItemsInfo> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglCatItemsInfo> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglCatItemsInfo> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglCatItemsInfo from DglCatItemsInfo dglCatItemsInfo left join fetch dglCatItemsInfo.tp",
        countQuery = "select count(distinct dglCatItemsInfo) from DglCatItemsInfo dglCatItemsInfo"
    )
    Page<DglCatItemsInfo> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglCatItemsInfo from DglCatItemsInfo dglCatItemsInfo left join fetch dglCatItemsInfo.tp")
    List<DglCatItemsInfo> findAllWithToOneRelationships();

    @Query("select dglCatItemsInfo from DglCatItemsInfo dglCatItemsInfo left join fetch dglCatItemsInfo.tp where dglCatItemsInfo.id =:id")
    Optional<DglCatItemsInfo> findOneWithToOneRelationships(@Param("id") Long id);
}
