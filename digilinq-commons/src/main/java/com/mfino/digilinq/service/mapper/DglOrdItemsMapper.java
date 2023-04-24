package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglOrdItems;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOrdItems} and its DTO {@link DglOrdItemsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOrdItemsMapper extends EntityMapper<DglOrdItemsDTO, DglOrdItems> {
    @Mapping(target = "ordInfo", source = "ordInfo", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglOrdItemsDTO toDto(DglOrdItems s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    @Mapping(target = "relMnoId", source = "relMnoId")
    @Mapping(target = "ordValue", source = "ordValue")
    @Mapping(target = "ordDtOfOrd", source = "ordDtOfOrd")
    @Mapping(target = "relOrdCustId", source = "relOrdCustId")
    @Mapping(target = "ordDeliveryAdd", source = "ordDeliveryAdd")
    @Mapping(target = "ordTotQty", source = "ordTotQty")
    @Mapping(target = "ordProofOfDelUrl", source = "ordProofOfDelUrl")
    @Mapping(target = "ordCustCurrency", source = "ordCustCurrency")
    @Mapping(target = "ordCustTimeZone", source = "ordCustTimeZone")
    @Mapping(target = "ordStatus", source = "ordStatus")
    @Mapping(target = "ordCartTotAmount", source = "ordCartTotAmount")
    @Mapping(target = "ordCartTaxAmt", source = "ordCartTaxAmt")
    @Mapping(target = "ordCartShipingChargers", source = "ordCartShipingChargers")
    @Mapping(target = "ordPayId", source = "ordPayId")
    @Mapping(target = "ordPayDttime", source = "ordPayDttime")
    @Mapping(target = "ordPayStatus", source = "ordPayStatus")
    @Mapping(target = "ordPayModeOfPay", source = "ordPayModeOfPay")
    @Mapping(target = "ordPayTotAmt", source = "ordPayTotAmt")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
