package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglConflictInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglConflictInfo entity.
 */
@Repository
public interface DglConflictInfoRepository extends JpaRepository<DglConflictInfo, Long> {
    default Optional<DglConflictInfo> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglConflictInfo> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglConflictInfo> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglConflictInfo from DglConflictInfo dglConflictInfo left join fetch dglConflictInfo.whInfo left join fetch dglConflictInfo.ord",
        countQuery = "select count(distinct dglConflictInfo) from DglConflictInfo dglConflictInfo"
    )
    Page<DglConflictInfo> findAllWithToOneRelationships(Pageable pageable);

    @Query(
        "select distinct dglConflictInfo from DglConflictInfo dglConflictInfo left join fetch dglConflictInfo.whInfo left join fetch dglConflictInfo.ord"
    )
    List<DglConflictInfo> findAllWithToOneRelationships();

    @Query(
        "select dglConflictInfo from DglConflictInfo dglConflictInfo left join fetch dglConflictInfo.whInfo left join fetch dglConflictInfo.ord where dglConflictInfo.id =:id"
    )
    Optional<DglConflictInfo> findOneWithToOneRelationships(@Param("id") Long id);
}
