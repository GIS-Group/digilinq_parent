package com.mfino.digilinq.catalog.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.catalog.model.DglCatTpInfoModel;
import com.mfino.digilinq.catalog.service.DglCatTpInfoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/v1/dglCatTpInfos")
@RequiredArgsConstructor
public class DglCatTpInfoController {

	private final DglCatTpInfoService dglCatTpInfoService;
	
	@PostMapping
	public ResponseEntity<DglCatTpInfoModel> save(@RequestBody DglCatTpInfoModel dglCatTpInfoModel) {
		return ResponseEntity.ok(dglCatTpInfoService.save(dglCatTpInfoModel));
	}
	
	@PutMapping
	public ResponseEntity<DglCatTpInfoModel> update(@RequestBody DglCatTpInfoModel dglCatTpInfoModel) {
		return ResponseEntity.ok(dglCatTpInfoService.update(dglCatTpInfoModel));
	}
	
	@GetMapping
	public ResponseEntity<List<DglCatTpInfoModel>> findAll() {
		return ResponseEntity.ok(dglCatTpInfoService.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DglCatTpInfoModel> findOne(@PathVariable Long id) {
		return ResponseEntity.ok(dglCatTpInfoService.findOne(id).orElseThrow());
	} 
	
	@PatchMapping("/{id}/{status}")
	public ResponseEntity<List<DglCatTpInfoModel>> changeStatus(@PathVariable Long id, @PathVariable Integer status) {
		return ResponseEntity.ok(dglCatTpInfoService.changeStatus(id, status));
	}
	
}
