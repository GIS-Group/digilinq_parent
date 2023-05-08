package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglMdProdCatDTO;

public interface DglMdProdCatService {

	public  DglMdProdCatDTO save(DglMdProdCatDTO dglMdProdCatDTO) ;
	public DglMdProdCatDTO update(DglMdProdCatDTO dglMdProdCatDTO);
	public void updateStatus(Long id, String mdProdCatStatus);
	public List<DglMdProdCatDTO> findAll(int pageNo, int pageSize, String sortField);
	public Optional<DglMdProdCatDTO> findOne(Long id);
	public void delete(Long id);

}
