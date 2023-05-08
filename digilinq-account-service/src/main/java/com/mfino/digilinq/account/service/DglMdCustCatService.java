package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglMdCustCatDTO;

public interface DglMdCustCatService {

	public DglMdCustCatDTO save(DglMdCustCatDTO dglMdCustCatDTO);
	public DglMdCustCatDTO update(DglMdCustCatDTO dglMdCustCatDTO);
	public void updateStatus(Long id, String mdCusStatus);
	public List<DglMdCustCatDTO> findAll(Integer pageNo, Integer pageSize, String sortField);
	public Optional<DglMdCustCatDTO> findOne(Long id);
	public void delete(Long id);
}
