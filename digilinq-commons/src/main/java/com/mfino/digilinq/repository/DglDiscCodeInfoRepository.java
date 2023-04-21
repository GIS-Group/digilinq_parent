package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglDiscCodeInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglDiscCodeInfo entity.
 */
@Repository
public interface DglDiscCodeInfoRepository extends JpaRepository<DglDiscCodeInfo, Long> {
    default Optional<DglDiscCodeInfo> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglDiscCodeInfo> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglDiscCodeInfo> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglDiscCodeInfo from DglDiscCodeInfo dglDiscCodeInfo left join fetch dglDiscCodeInfo.ord",
        countQuery = "select count(distinct dglDiscCodeInfo) from DglDiscCodeInfo dglDiscCodeInfo"
    )
    Page<DglDiscCodeInfo> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglDiscCodeInfo from DglDiscCodeInfo dglDiscCodeInfo left join fetch dglDiscCodeInfo.ord")
    List<DglDiscCodeInfo> findAllWithToOneRelationships();

    @Query("select dglDiscCodeInfo from DglDiscCodeInfo dglDiscCodeInfo left join fetch dglDiscCodeInfo.ord where dglDiscCodeInfo.id =:id")
    Optional<DglDiscCodeInfo> findOneWithToOneRelationships(@Param("id") Long id);
}
