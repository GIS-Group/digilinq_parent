package com.mfino.digilinq.catalog.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.domain.DglCatItemsInfo;

/**
 * 
 * @author Krupa
 *
 */
@Repository
public interface DglCatItemsInfoRepository extends JpaRepository<DglCatItemsInfo, Integer> {
    default Optional<DglCatItemsInfo> findOneWithEagerRelationships(Integer id) {
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
    Optional<DglCatItemsInfo> findOneWithToOneRelationships(@Param("id") Integer id);
}
