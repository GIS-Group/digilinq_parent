package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdProdCat;
import com.mfino.digilinq.account.dto.DglMdProdCatDTO;
import com.mfino.digilinq.account.repository.DglMdProdCatRepository;
import com.mfino.digilinq.account.service.mapper.DglMdProdCatMapper;



@Service
public class DglMdProdCatService {
    private final Logger log = org.slf4j.LoggerFactory.getLogger(DglMdProdCatService.class);
    
    @Autowired
    private  DglMdProdCatRepository dglMdProdCatRepository;


    /**
     * Save a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdProdCatDTO save(DglMdProdCatDTO dglMdProdCatDTO) {
        log.debug("Request to save DglMdProdCat : {}", dglMdProdCatDTO);
        DglMdProdCatMapper dglMdProdCatMapper= new DglMdProdCatMapper();
        DglMdProdCat dglMdProdCat = dglMdProdCatMapper.toEntity(dglMdProdCatDTO);
        dglMdProdCat = dglMdProdCatRepository.save(dglMdProdCat);
        return dglMdProdCatMapper.toDTO(dglMdProdCat);
    }

    /**
     * Update a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdProdCatDTO update(DglMdProdCatDTO dglMdProdCatDTO) {
        log.debug("Request to update DglMdProdCat : {}", dglMdProdCatDTO);
        DglMdProdCatMapper dglMdProdCatMapper= new DglMdProdCatMapper();
        DglMdProdCat dglMdProdCat = dglMdProdCatMapper.toEntity(dglMdProdCatDTO);
        dglMdProdCat = dglMdProdCatRepository.save(dglMdProdCat);
        return dglMdProdCatMapper.toDTO(dglMdProdCat);
    }

    /**
     * Partially update a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to update partially.
     * @return the persisted entity.
     */
    public void updateStatus(Long id, String mdProdCatStatus) {
		Optional<DglMdProdCat> dglMdProdCat = dglMdProdCatRepository.findById(id);
		DglMdProdCat entity = dglMdProdCat.get();
		entity.setMdProCatStatus(mdProdCatStatus);
		dglMdProdCatRepository.save(entity);

	}

    /**
     * Get all the dglMdProdCats.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglMdProdCatDTO> findAll() {
        log.debug("Request to get all DglMdProdCats");
        DglMdProdCatMapper dglMdProdCatMapper= new DglMdProdCatMapper();
        return dglMdProdCatRepository.findAll().stream().map(dglMdProdCatMapper::toDTO).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglMdProdCat by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdProdCatDTO> findOne(Long id) {
        log.debug("Request to get DglMdProdCat : {}", id);
        DglMdProdCatMapper dglMdProdCatMapper= new DglMdProdCatMapper();
        return dglMdProdCatRepository.findById(id).map(dglMdProdCatMapper::toDTO);
    }

    /**
     * Delete the dglMdProdCat by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglMdProdCat : {}", id);
        dglMdProdCatRepository.deleteById(id);
    }

}
