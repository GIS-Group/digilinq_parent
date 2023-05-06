package com.mfino.digilinq.account.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

public class DglMdProdCatDTO {

    private static final long serialVersionUID = 7282800539529289265L;
  

    private Long id;
   
    private String prodCatTitle;

    private String prodCatDesc;

    private String prodCatImgUrl;

    private String mdProCatStatus;

	public DglMdProdCatDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private DglAccMnoDTO acc;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdCatTitle() {
		return prodCatTitle;
	}

	public void setProdCatTitle(String prodCatTitle) {
		this.prodCatTitle = prodCatTitle;
	}

	public String getProdCatDesc() {
		return prodCatDesc;
	}

	public void setProdCatDesc(String prodCatDesc) {
		this.prodCatDesc = prodCatDesc;
	}

	public String getProdCatImgUrl() {
		return prodCatImgUrl;
	}

	public void setProdCatImgUrl(String prodCatImgUrl) {
		this.prodCatImgUrl = prodCatImgUrl;
	}

	public String getMdProCatStatus() {
		return mdProCatStatus;
	}

	public void setMdProCatStatus(String mdProCatStatus) {
		this.mdProCatStatus = mdProCatStatus;
	}

	public DglAccMnoDTO getAcc() {
		return acc;
	}

	public void setAcc(DglAccMnoDTO acc) {
		this.acc = acc;
	}
	 public DglMdProdCatDTO(Long id, String prodCatTitle, String prodCatDesc, String prodCatImgUrl,
				String mdProCatStatus, DglAccMnoDTO acc) {
			super();
			this.id = id;
			this.prodCatTitle = prodCatTitle;
			this.prodCatDesc = prodCatDesc;
			this.prodCatImgUrl = prodCatImgUrl;
			this.mdProCatStatus = mdProCatStatus;
			this.acc = acc;
		}

}
