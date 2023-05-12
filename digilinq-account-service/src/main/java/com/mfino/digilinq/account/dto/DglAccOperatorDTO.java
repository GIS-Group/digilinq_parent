package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class DglAccOperatorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1865922022629556246L;

	private Long id;
	
	/**
     * Account Info Fields
     */
	private DglAccOperatorDTO accMnoParent;
	private String accName;
    private DglAccOperatorDTO accParent;
    private String accCompName;
    private Instant accIncorpDt;
    private String accTaxId;
    private Integer accTimeZone;
    private Integer accCurrency;
    private Integer accLang;
    private Boolean accOrient;
    
    /**
     * Custom Fields
     */
    private Set<DglAccMnoCustomFieldsDTO> dglAccMnoCustomFields = new HashSet<>();

    /**
     * Contact Info Fields
     */
    private String accPrimCont;
    private String accEmailId;
    //need to add in DB
    private String accCont;
    private String accAltCont;
    private String accFax;
    private String accWebUrl;

    /**
     * Address Info Fields
     */
    private String accAddL1;
    private String accAddL2;
    private String accCity;
    private String accState;
    private String accCountry;
    private String accZipcode;
    
    /**
     * Billing Info Fields
     */
    //need to add in DB
    private Boolean accIsBillingCentre;
    private String accEndPointUrl;
    //need to add in DB
    private String accCsvUrl;
    private String accSftpAdd;
    private String accPortNo;
    private String accUsername;
    private String accPassword;

    /**
     * DglMnoFilesDTO represents Upload Files and Additional Files
     */
    private Set<DglMnoFilesDTO> dglMnoFiles = new HashSet<>();
    
    /**
     * DglRolesDTO represents Operator Roles and Permissions Info
     */
    private Set<DglRolesDTO> dglRoles = new HashSet<>();
    
    /**
     * DglAccUsersDTO represents User Info(Master User)
     */
    private Set<DglAccUsersDTO> dglAccUsers = new HashSet<>();

    //Enum need to add 
    private String accStatus;
    //generate in setter method if null 
    private String accUnqId;
    private String accType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccCompName() {
        return accCompName;
    }

    public void setAccCompName(String accCompName) {
        this.accCompName = accCompName;
    }

    public Instant getAccIncorpDt() {
        return accIncorpDt;
    }

    public void setAccIncorpDt(Instant accIncorpDt) {
        this.accIncorpDt = accIncorpDt;
    }

    public String getAccTaxId() {
        return accTaxId;
    }

    public void setAccTaxId(String accTaxId) {
        this.accTaxId = accTaxId;
    }

    public Integer getAccCurrency() {
        return accCurrency;
    }

    public void setAccCurrency(Integer accCurrency) {
        this.accCurrency = accCurrency;
    }

    public Integer getAccLang() {
        return accLang;
    }

    public void setAccLang(Integer accLang) {
        this.accLang = accLang;
    }

    public Integer getAccTimeZone() {
        return accTimeZone;
    }

    public void setAccTimeZone(Integer accTimeZone) {
        this.accTimeZone = accTimeZone;
    }

    public Boolean isAccOrient() {
        return accOrient;
    }

    public void setAccOrient(Boolean accOrient) {
        this.accOrient = accOrient;
    }

    public String getAccPrimCont() {
        return accPrimCont;
    }

    public void setAccPrimCont(String accPrimCont) {
        this.accPrimCont = accPrimCont;
    }

    public String getAccEmailId() {
        return accEmailId;
    }

    public void setAccEmailId(String accEmailId) {
        this.accEmailId = accEmailId;
    }

    public String getAccAltCont() {
        return accAltCont;
    }

    public void setAccAltCont(String accAltCont) {
        this.accAltCont = accAltCont;
    }

    public String getAccFax() {
        return accFax;
    }

    public void setAccFax(String accFax) {
        this.accFax = accFax;
    }

    public String getAccWebUrl() {
        return accWebUrl;
    }

    public void setAccWebUrl(String accWebUrl) {
        this.accWebUrl = accWebUrl;
    }

    public String getAccAddL1() {
        return accAddL1;
    }

    public void setAccAddL1(String accAddL1) {
        this.accAddL1 = accAddL1;
    }

    public String getAccAddL2() {
        return accAddL2;
    }

    public void setAccAddL2(String accAddL2) {
        this.accAddL2 = accAddL2;
    }

    public String getAccCity() {
        return accCity;
    }

    public void setAccCity(String accCity) {
        this.accCity = accCity;
    }

    public String getAccState() {
        return accState;
    }

    public void setAccState(String accState) {
        this.accState = accState;
    }

    public String getAccCountry() {
        return accCountry;
    }

    public void setAccCountry(String accCountry) {
        this.accCountry = accCountry;
    }

    public String getAccZipcode() {
        return accZipcode;
    }

    public void setAccZipcode(String accZipcode) {
        this.accZipcode = accZipcode;
    }

    public String getAccEndPointUrl() {
        return accEndPointUrl;
    }

    public void setAccEndPointUrl(String accEndPointUrl) {
        this.accEndPointUrl = accEndPointUrl;
    }

    public String getAccSftpAdd() {
        return accSftpAdd;
    }

    public void setAccSftpAdd(String accSftpAdd) {
        this.accSftpAdd = accSftpAdd;
    }

    public String getAccPortNo() {
        return accPortNo;
    }

    public void setAccPortNo(String accPortNo) {
        this.accPortNo = accPortNo;
    }

    public String getAccUsername() {
        return accUsername;
    }

    public void setAccUsername(String accUsername) {
        this.accUsername = accUsername;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public String getAccUnqId() {
        return accUnqId;
    }

    public void setAccUnqId(String accUnqId) {
        this.accUnqId = accUnqId;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public DglAccOperatorDTO getAccParent() {
		return accParent;
	}

	public void setAccParent(DglAccOperatorDTO accParent) {
		this.accParent = accParent;
	}

	public DglAccOperatorDTO getAccMnoParent() {
		return accMnoParent;
	}

	public void setAccMnoParent(DglAccOperatorDTO accMnoParent) {
		this.accMnoParent = accMnoParent;
	}

	public Set<DglAccMnoCustomFieldsDTO> getDglAccMnoCustomFields() {
		return dglAccMnoCustomFields;
	}

	public void setDglAccMnoCustomFields(Set<DglAccMnoCustomFieldsDTO> dglAccMnoCustomFields) {
		this.dglAccMnoCustomFields = dglAccMnoCustomFields;
	}

	public String getAccCont() {
		return accCont;
	}

	public void setAccCont(String accCont) {
		this.accCont = accCont;
	}

	public Boolean isAccIsBillingCentre() {
		return accIsBillingCentre;
	}

	public void setAccIsBillingCentre(Boolean accIsBillingCentre) {
		this.accIsBillingCentre = accIsBillingCentre;
	}

	public String getAccCsvUrl() {
		return accCsvUrl;
	}

	public void setAccCsvUrl(String accCsvUrl) {
		this.accCsvUrl = accCsvUrl;
	}

	public Set<DglMnoFilesDTO> getDglMnoFiles() {
		return dglMnoFiles;
	}

	public void setDglMnoFiles(Set<DglMnoFilesDTO> dglMnoFiles) {
		this.dglMnoFiles = dglMnoFiles;
	}

	public Boolean getAccOrient() {
		return accOrient;
	}

	public Set<DglRolesDTO> getDglRoles() {
		return dglRoles;
	}

	public void setDglRoles(Set<DglRolesDTO> dglRoles) {
		this.dglRoles = dglRoles;
	}

	public Set<DglAccUsersDTO> getDglAccUsers() {
		return dglAccUsers;
	}

	public void setDglAccUsers(Set<DglAccUsersDTO> dglAccUsers) {
		this.dglAccUsers = dglAccUsers;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAccOperatorDTO)) {
            return false;
        }

        return id != null && id.equals(((DglAccOperatorDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

}
