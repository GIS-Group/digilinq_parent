package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglDocPol;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglDocPol entity.
 */
@Repository
public interface DglDocPolRepository extends JpaRepository<DglDocPol, Long> {
    default Optional<DglDocPol> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglDocPol> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglDocPol> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglDocPol from DglDocPol dglDocPol left join fetch dglDocPol.accMno",
        countQuery = "select count(distinct dglDocPol) from DglDocPol dglDocPol"
    )
    Page<DglDocPol> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglDocPol from DglDocPol dglDocPol left join fetch dglDocPol.accMno")
    List<DglDocPol> findAllWithToOneRelationships();

    @Query("select dglDocPol from DglDocPol dglDocPol left join fetch dglDocPol.accMno where dglDocPol.id =:id")
    Optional<DglDocPol> findOneWithToOneRelationships(@Param("id") Long id);
}
