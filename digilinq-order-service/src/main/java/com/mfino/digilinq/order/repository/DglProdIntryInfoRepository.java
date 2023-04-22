package com.mfino.digilinq.order.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.domain.DglProdIntryInfo;

/**
 * 
 * @author Krupa
 *
 */
@Repository
public interface DglProdIntryInfoRepository extends JpaRepository<DglProdIntryInfo, Integer> {
	default Optional<DglProdIntryInfo> findOneWithEagerRelationships(Integer id) {
		return this.findOneWithToOneRelationships(id);
	}

	default List<DglProdIntryInfo> findAllWithEagerRelationships() {
		return this.findAllWithToOneRelationships();
	}

	default Page<DglProdIntryInfo> findAllWithEagerRelationships(Pageable pageable) {
		return this.findAllWithToOneRelationships(pageable);
	}

	@Query(value = "select distinct dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo left join fetch dglProdIntryInfo.wh", countQuery = "select count(distinct dglProdIntryInfo) from DglProdIntryInfo dglProdIntryInfo")
	Page<DglProdIntryInfo> findAllWithToOneRelationships(Pageable pageable);

	@Query("select distinct dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo left join fetch dglProdIntryInfo.wh")
	List<DglProdIntryInfo> findAllWithToOneRelationships();

	@Query("select dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo left join fetch dglProdIntryInfo.wh where dglProdIntryInfo.id =:id")
	Optional<DglProdIntryInfo> findOneWithToOneRelationships(@Param("id") Integer id);
	
	@Query("select dglProdIntryInfo from DglProdIntryInfo dglProdIntryInfo where dglProdIntryInfo.relItemId =:relItemId and dglProdIntryInfo.relItemVariantId =:relItemVariantId and dglProdIntryInfo.prodIntryQty =:prodIntryQty")
	Optional<DglProdIntryInfo> findIntryInfoForCheckInventory(@Param("relItemId") String relItemId,@Param("relItemVariantId") String relItemVariantId,@Param("prodIntryQty") Integer prodIntryQty);
}
