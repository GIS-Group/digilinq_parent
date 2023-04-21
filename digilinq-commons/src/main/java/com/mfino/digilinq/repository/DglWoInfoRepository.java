package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglWoInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglWoInfo entity.
 */
@Repository
public interface DglWoInfoRepository extends JpaRepository<DglWoInfo, Long> {
    default Optional<DglWoInfo> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglWoInfo> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglWoInfo> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglWoInfo from DglWoInfo dglWoInfo left join fetch dglWoInfo.ord left join fetch dglWoInfo.wh",
        countQuery = "select count(distinct dglWoInfo) from DglWoInfo dglWoInfo"
    )
    Page<DglWoInfo> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglWoInfo from DglWoInfo dglWoInfo left join fetch dglWoInfo.ord left join fetch dglWoInfo.wh")
    List<DglWoInfo> findAllWithToOneRelationships();

    @Query("select dglWoInfo from DglWoInfo dglWoInfo left join fetch dglWoInfo.ord left join fetch dglWoInfo.wh where dglWoInfo.id =:id")
    Optional<DglWoInfo> findOneWithToOneRelationships(@Param("id") Long id);
}
