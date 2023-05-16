package com.mfino.digilinq.catalog.model;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class DglCatTpInfoModel implements Serializable {

	private static final long serialVersionUID = -2480887672684992699L;

	private Long id;
	private Long tpUnqId;
	private String relProdCat;
	private String tpTitle;
	private String tpType;
	private String tpDesc;
	private String tpStruc;
	private Integer tpStatus;
	private Long accId;
}
