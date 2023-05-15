package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglMdProdCatDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglMdProdCat}.
 */
public interface DglMdProdCatService {

    /**
     * Save a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to save.
     * @return the persisted entity.
     */
    DglMdProdCatDTO save(DglMdProdCatDTO dglMdProdCatDTO);

    /**
     * Get all the dglMdProdCats.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<DglMdProdCatDTO> findAll(Pageable pageable);


    /**
     * Get the "id" dglMdProdCat.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMdProdCatDTO> findOne(Long id);

    /**
     * Delete the "id" dglMdProdCat.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
    
    public DglMdProdCatDTO update(DglMdProdCatDTO dglMdProdCatDTO);
	public void updateStatus(Long id, String mdProdCatStatus);
	public List<DglMdProdCatDTO> findAll(int pageNo, int pageSize, String sortField);
}
