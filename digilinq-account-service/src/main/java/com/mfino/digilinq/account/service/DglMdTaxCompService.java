package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;

public interface DglMdTaxCompService {

	public DglMdTaxCompDTO save(DglMdTaxCompDTO dglMdTaxCompDTO);
	public DglMdTaxCompDTO update(DglMdTaxCompDTO dglMdTaxCompDTO);
	public void updateStatus(Long id, String mdTaxStatus);
	public List<DglMdTaxCompDTO> findAll();
	public Optional<DglMdTaxCompDTO> findOne(Long id);
	public void delete(Long id);
}
