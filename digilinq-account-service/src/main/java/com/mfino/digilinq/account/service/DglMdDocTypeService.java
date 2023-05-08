package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;

public interface DglMdDocTypeService {

	public DglMdDocTypeDTO save(DglMdDocTypeDTO dglMdDocTypeDTO);
	public DglMdDocTypeDTO update(DglMdDocTypeDTO dglMdDocTypeDTO);
	public void updateStatus(Long id, String mdDocTypeStatus);
	public List<DglMdDocTypeDTO> findAll(int pageNo, int pageSize, String sortField);
	public Optional<DglMdDocTypeDTO> findOne(Long id);
	public void delete(Long id);
}
