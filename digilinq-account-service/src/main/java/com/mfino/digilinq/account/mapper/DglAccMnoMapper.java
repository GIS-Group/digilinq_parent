package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccMnoDTO;
import com.mfino.digilinq.account.service.DglAccMnoService;

/**
 * Mapper for the entity {@link DglAccMno} and its DTO {@link DglAccMnoDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoService.class})
public interface DglAccMnoMapper extends EntityMapper<DglAccMnoDTO, DglAccMno> {


    @Mapping(target = "dglMdCustCats", ignore = true)
    @Mapping(target = "removeDglMdCustCats", ignore = true)
    @Mapping(target = "dglMdProdCats", ignore = true)
    @Mapping(target = "removeDglMdProdCats", ignore = true)
    @Mapping(target = "dglAccUsers", ignore = true)
    @Mapping(target = "removeDglAccUsers", ignore = true)
    @Mapping(target = "dglMdContractTypeConfigs", ignore = true)
    @Mapping(target = "removeDglMdContractTypeConfigs", ignore = true)
    @Mapping(target = "dglContracts", ignore = true)
    @Mapping(target = "removeDglContracts", ignore = true)
    @Mapping(target = "dglContractsReceivingParties", ignore = true)
    @Mapping(target = "removeDglContractsReceivingParty", ignore = true)
    @Mapping(target = "dglCustUsers", ignore = true)
    @Mapping(target = "removeDglCustUsers", ignore = true)
    @Mapping(target = "dglMdCurs", ignore = true)
    @Mapping(target = "removeDglMdCurs", ignore = true)
    @Mapping(target = "dglMetaData", ignore = true)
    @Mapping(target = "removeDglMetaData", ignore = true)
    @Mapping(target = "dglAccMnoCustomFields", ignore = true)
    @Mapping(target = "removeDglAccMnoCustomFields", ignore = true)
    @Mapping(target = "dglThmInfos", ignore = true)
    @Mapping(target = "removeDglThmInfos", ignore = true)
    @Mapping(target = "dglMnoFiles", ignore = true)
    @Mapping(target = "removeDglMnoFiles", ignore = true)
    @Mapping(target = "dglDocPols", ignore = true)
    @Mapping(target = "removeDglDocPols", ignore = true)
    @Mapping(target = "dglCustomers", ignore = true)
    @Mapping(target = "removeDglCustomers", ignore = true)
    @Mapping(target = "dglCustContracts", ignore = true)
    @Mapping(target = "removeDglCustContracts", ignore = true)
    @Mapping(target = "dglWebSets", ignore = true)
    @Mapping(target = "removeDglWebSets", ignore = true)
    @Mapping(target = "dglNotifications", ignore = true)
    @Mapping(target = "removeDglNotifications", ignore = true)
    @Mapping(target = "dglMdDocTypes", ignore = true)
    @Mapping(target = "removeDglMdDocTypes", ignore = true)
    @Mapping(target = "dglSetGens", ignore = true)
    @Mapping(target = "removeDglSetGens", ignore = true)
    @Mapping(target = "dglMdContractTypes", ignore = true)
    @Mapping(target = "removeDglMdContractTypes", ignore = true)
    @Mapping(target = "dglRoles", ignore = true)
    @Mapping(target = "removeDglRoles", ignore = true)
    @Mapping(target = "dglMdTaxComps", ignore = true)
    @Mapping(target = "removeDglMdTaxComps", ignore = true)
    DglAccMno toEntity(DglAccMnoDTO dglAccMnoDTO);

    default DglAccMno fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglAccMno dglAccMno = new DglAccMno();
        dglAccMno.setId(id);
        return dglAccMno;
    }
}
