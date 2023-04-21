package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglOrdAddress;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOrdAddress entity.
 */
@Repository
public interface DglOrdAddressRepository extends JpaRepository<DglOrdAddress, Long> {
    default Optional<DglOrdAddress> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglOrdAddress> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglOrdAddress> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglOrdAddress from DglOrdAddress dglOrdAddress left join fetch dglOrdAddress.ord",
        countQuery = "select count(distinct dglOrdAddress) from DglOrdAddress dglOrdAddress"
    )
    Page<DglOrdAddress> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglOrdAddress from DglOrdAddress dglOrdAddress left join fetch dglOrdAddress.ord")
    List<DglOrdAddress> findAllWithToOneRelationships();

    @Query("select dglOrdAddress from DglOrdAddress dglOrdAddress left join fetch dglOrdAddress.ord where dglOrdAddress.id =:id")
    Optional<DglOrdAddress> findOneWithToOneRelationships(@Param("id") Long id);
}
