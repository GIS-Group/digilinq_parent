package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMnoFiles;
import com.mfino.digilinq.account.dto.DglMnoFilesDTO;

/**
 * Mapper for the entity {@link DglMnoFiles} and its DTO {@link DglMnoFilesDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMnoFilesMapper extends EntityMapper<DglMnoFilesDTO, DglMnoFiles> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMnoFilesDTO toDto(DglMnoFiles dglMnoFiles);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMnoFiles toEntity(DglMnoFilesDTO dglMnoFilesDTO);

    default DglMnoFiles fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMnoFiles dglMnoFiles = new DglMnoFiles();
        dglMnoFiles.setId(id);
        return dglMnoFiles;
    }
}
