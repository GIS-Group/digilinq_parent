package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglProdIntryInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglProdIntryInfo entity.
 */
@Repository
public interface DglProdIntryInfoRepository extends JpaRepository<DglProdIntryInfo, Long> {
    default Optional<DglProdIntryInfo> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglProdIntryInfo> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglProdIntryInfo> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo left join fetch dglProdIntryInfo.wh",
        countQuery = "select count(distinct dglProdIntryInfo) from DglProdIntryInfo dglProdIntryInfo"
    )
    Page<DglProdIntryInfo> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo left join fetch dglProdIntryInfo.wh")
    List<DglProdIntryInfo> findAllWithToOneRelationships();

    @Query(
        "select dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo left join fetch dglProdIntryInfo.wh where dglProdIntryInfo.id =:id"
    )
    Optional<DglProdIntryInfo> findOneWithToOneRelationships(@Param("id") Long id);
}
