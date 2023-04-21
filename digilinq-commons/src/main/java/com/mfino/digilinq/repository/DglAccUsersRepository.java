package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglAccUsers;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglAccUsers entity.
 */
@Repository
public interface DglAccUsersRepository extends JpaRepository<DglAccUsers, Long> {
    default Optional<DglAccUsers> findOneWithEagerRelationships(Long id) {
        return this.findOneWithToOneRelationships(id);
    }

    default List<DglAccUsers> findAllWithEagerRelationships() {
        return this.findAllWithToOneRelationships();
    }

    default Page<DglAccUsers> findAllWithEagerRelationships(Pageable pageable) {
        return this.findAllWithToOneRelationships(pageable);
    }

    @Query(
        value = "select distinct dglAccUsers from DglAccUsers dglAccUsers left join fetch dglAccUsers.role left join fetch dglAccUsers.acc",
        countQuery = "select count(distinct dglAccUsers) from DglAccUsers dglAccUsers"
    )
    Page<DglAccUsers> findAllWithToOneRelationships(Pageable pageable);

    @Query("select distinct dglAccUsers from DglAccUsers dglAccUsers left join fetch dglAccUsers.role left join fetch dglAccUsers.acc")
    List<DglAccUsers> findAllWithToOneRelationships();

    @Query(
        "select dglAccUsers from DglAccUsers dglAccUsers left join fetch dglAccUsers.role left join fetch dglAccUsers.acc where dglAccUsers.id =:id"
    )
    Optional<DglAccUsers> findOneWithToOneRelationships(@Param("id") Long id);
}
