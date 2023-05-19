package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mfino.digilinq.account.enumeration.DisplyOrientation;
import com.mfino.digilinq.account.enumeration.SettlementCycle;
import com.mfino.digilinq.account.enumeration.StatusType;

public class DglEnterpriseCustomerDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 10365158500803301L;

	private Long id;
	
	/**
	 * Customer Account Info
	 */
	private Long dglAccMnoId;
	
	@NotNull(message = "Title cant be null")
	@Size(min = 2, max = 100, message = "Title name should have minimum 2 characters and Maximum characters 100 allowed")
	private String custName;
    
	private DglEnterpriseCustomerDTO custParent;
	
	@NotNull(message = "Title cant be null")
	@Size(min = 2, max = 100, message = "Company name should have minimum 2 characters and Maximum characters 100 allowed")
    private String custCompName;
    
	@NotNull(message = "Incorporate Date cant be null")
	private Instant custIncorpDt;
	
	@NotNull(message = "Tax id cant be null")
	@Size(min = 1, max = 50, message = "tax id should have minimum 1 characters and Maximum 50 characters allowed")
    private String custTaxId;
    
	@NotNull(message = "currency cant be null")
	private Integer custCurrency;
	
	@NotNull(message = "Language cant be null")
    private Integer custLang;
	
	@NotNull(message = "time zone cant be null")
    private Integer custTimeZone;
	
	@NotNull(message = "orientation cant be null")
    private DisplyOrientation custOrient;
    //need to add in DB
	
	@NotNull(message = "Category cant be null")
    private String custCategory;
    
    /**
	 * CustomFields Info
	 */
    private Set<DglCustCustomFieldsDTO> dglCustCustomFields = new HashSet<>();

    /**
     * Contact Info
     */
    
    @NotNull(message = "Primary contact cant be null")
	@Size(min = 2, max = 100, message = "primary contact should have minimum 2 characters and Maximum 50 characters allowed")
    private String custPrimCont;
    
    @NotNull(message = "Email id cant be null")
	@Size(min = 2, max = 100, message = "Email id should have minimum 2 characters and Maximum 50 characters allowed")
    private String custEmailId;
    
    //need to add in DB
    @NotNull(message = "phone number cant be null")
	@Size(min = 2, max = 20, message = "phone number should have minimum 2 characters and Maximum 20 characters allowed")
    private String custPhoneNumber;
    
    private String custAltCont;
    private String custFax;
    private String custWebUrl;
    //need to add in DB
    @NotNull(message = "EmailId cant be null")
	@Size(min = 5, max = 50, message = "EmailId should have minimum 5 characters and Maximum 50 characters allowed")
    private String custOrderApproverEmailId;

    /**
     * Address Info
     */
    @NotNull(message = "Address cant be null")
	@Size(min = 5, max = 225, message = "adddress should have minimum 5 characters and Maximum 225 characters allowed")
    private String custAddL1;
   
    private String custAddL2;
    
    @NotNull(message = "city cant be null")
	@Size(min = 3, max = 50, message = "city should have minimum 3 characters and Maximum 50 characters allowed")
    private String custCity;
    
    @NotNull(message = "State cant be null")
	@Size(min = 3, max = 50, message = "State should have minimum 3 characters and Maximum 50 characters allowed")
    private String custState;
    
    @NotNull(message = "Country cant be null")
	@Size(min = 3, max = 50, message = "Country should have minimum 3 characters and Maximum 50 characters allowed")
    private String custCountry;
    private String custZipcode;

    /**
     * Billing Info
     */
    //need to add in DB
    private Boolean custIsBusinessUnit;
    private Integer custPrefPg;
    
    @NotNull(message = "creditLimit cant be null")
	@Size(min = 3, max = 20, message = "creditLimit should have minimum 3 characters and Maximum 20 characters allowed")
    private Float creditLimit;
   
    @NotNull(message = "bill cycle  cant be null")
    private SettlementCycle billCycle;
    
    @NotNull(message = "bill date  cant be null")
    private Instant billDate;
    
    @NotNull(message = "due tenor type cant be null")
	@Size(min = 1, max = 2, message = "due tenor should have minimum 1 characters and Maximum 2 characters allowed")
    private String billDueTenor;

    private StatusType custStatus;
    private String custUnqId;

    
    private Set<DglCustFilesDTO> dglCustFiles = new HashSet<>();
    
    /**
     * User Info
     */
    private Set<DglCustUsersDTO> dglCustUsers = new HashSet<>();
    private Set<DglCustRolesDTO> dglCustRoles = new HashSet<>();
    
    /**
     * Contract Info
     */
    private Set<DglCustContractsDTO> dglCustContracts = new HashSet<>();
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCompName() {
        return custCompName;
    }

    public void setCustCompName(String custCompName) {
        this.custCompName = custCompName;
    }

    public Instant getCustIncorpDt() {
        return custIncorpDt;
    }

    public void setCustIncorpDt(Instant custIncorpDt) {
        this.custIncorpDt = custIncorpDt;
    }

    public String getCustTaxId() {
        return custTaxId;
    }

    public void setCustTaxId(String custTaxId) {
        this.custTaxId = custTaxId;
    }

    public Integer getCustCurrency() {
        return custCurrency;
    }

    public void setCustCurrency(Integer custCurrency) {
        this.custCurrency = custCurrency;
    }

    public Integer getCustLang() {
        return custLang;
    }

    public void setCustLang(Integer custLang) {
        this.custLang = custLang;
    }

    public Integer getCustTimeZone() {
        return custTimeZone;
    }

    public void setCustTimeZone(Integer custTimeZone) {
        this.custTimeZone = custTimeZone;
    }

    public DisplyOrientation isCustOrient() {
        return custOrient;
    }

    public void setCustOrient(DisplyOrientation custOrient) {
        this.custOrient = custOrient;
    }

    public String getCustPrimCont() {
        return custPrimCont;
    }

    public void setCustPrimCont(String custPrimCont) {
        this.custPrimCont = custPrimCont;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public String getCustAltCont() {
        return custAltCont;
    }

    public void setCustAltCont(String custAltCont) {
        this.custAltCont = custAltCont;
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    public String getCustWebUrl() {
        return custWebUrl;
    }

    public void setCustWebUrl(String custWebUrl) {
        this.custWebUrl = custWebUrl;
    }

    public String getCustAddL1() {
        return custAddL1;
    }

    public void setCustAddL1(String custAddL1) {
        this.custAddL1 = custAddL1;
    }

    public String getCustAddL2() {
        return custAddL2;
    }

    public void setCustAddL2(String custAddL2) {
        this.custAddL2 = custAddL2;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public Integer getCustPrefPg() {
        return custPrefPg;
    }

    public void setCustPrefPg(Integer custPrefPg) {
        this.custPrefPg = custPrefPg;
    }

    public StatusType getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(StatusType custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustUnqId() {
        return custUnqId;
    }

    public void setCustUnqId(String custUnqId) {
        this.custUnqId = custUnqId;
    }

    public SettlementCycle getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(SettlementCycle billCycle) {
        this.billCycle = billCycle;
    }

    public Instant getBillDate() {
        return billDate;
    }

    public void setBillDate(Instant billDate) {
        this.billDate = billDate;
    }

    public String getBillDueTenor() {
        return billDueTenor;
    }

    public void setBillDueTenor(String billDueTenor) {
        this.billDueTenor = billDueTenor;
    }

    public Float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    public DglEnterpriseCustomerDTO getCustParent() {
		return custParent;
	}

	public void setCustParent(DglEnterpriseCustomerDTO custParent) {
		this.custParent = custParent;
	}

	public Set<DglCustCustomFieldsDTO> getDglCustCustomFields() {
		return dglCustCustomFields;
	}

	public void setDglCustCustomFields(Set<DglCustCustomFieldsDTO> dglCustCustomFields) {
		this.dglCustCustomFields = dglCustCustomFields;
	}

	public Set<DglCustFilesDTO> getDglCustFiles() {
		return dglCustFiles;
	}

	public void setDglCustFiles(Set<DglCustFilesDTO> dglCustFiles) {
		this.dglCustFiles = dglCustFiles;
	}

	public Set<DglCustUsersDTO> getDglCustUsers() {
		return dglCustUsers;
	}

	public void setDglCustUsers(Set<DglCustUsersDTO> dglCustUsers) {
		this.dglCustUsers = dglCustUsers;
	}

	public Set<DglCustRolesDTO> getDglCustRoles() {
		return dglCustRoles;
	}

	public void setDglCustRoles(Set<DglCustRolesDTO> dglCustRoles) {
		this.dglCustRoles = dglCustRoles;
	}

	public Set<DglCustContractsDTO> getDglCustContracts() {
		return dglCustContracts;
	}

	public void setDglCustContracts(Set<DglCustContractsDTO> dglCustContracts) {
		this.dglCustContracts = dglCustContracts;
	}

	public String getCustPhoneNumber() {
		return custPhoneNumber;
	}

	public void setCustPhoneNumber(String custPhoneNumber) {
		this.custPhoneNumber = custPhoneNumber;
	}

	public String getCustOrderApproverEmailId() {
		return custOrderApproverEmailId;
	}

	public void setCustOrderApproverEmailId(String custOrderApproverEmailId) {
		this.custOrderApproverEmailId = custOrderApproverEmailId;
	}

	public Boolean getCustIsBusinessUnit() {
		return custIsBusinessUnit;
	}

	public void setCustIsBusinessUnit(Boolean custIsBusinessUnit) {
		this.custIsBusinessUnit = custIsBusinessUnit;
	}

	public String getCustCategory() {
		return custCategory;
	}

	public void setCustCategory(String custCategory) {
		this.custCategory = custCategory;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglEnterpriseCustomerDTO)) {
            return false;
        }

        return id != null && id.equals(((DglEnterpriseCustomerDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustomerDTO{" +
            "id=" + getId() +
            ", custName='" + getCustName() + "'" +
            ", custCompName='" + getCustCompName() + "'" +
            ", custIncorpDt='" + getCustIncorpDt() + "'" +
            ", custTaxId='" + getCustTaxId() + "'" +
            ", custCurrency=" + getCustCurrency() +
            ", custLang=" + getCustLang() +
            ", custTimeZone=" + getCustTimeZone() +
            ", custOrient='" + isCustOrient() + "'" +
            ", custPrimCont='" + getCustPrimCont() + "'" +
            ", custEmailId='" + getCustEmailId() + "'" +
            ", custAltCont='" + getCustAltCont() + "'" +
            ", custFax='" + getCustFax() + "'" +
            ", custWebUrl='" + getCustWebUrl() + "'" +
            ", custAddL1='" + getCustAddL1() + "'" +
            ", custAddL2='" + getCustAddL2() + "'" +
            ", custCity='" + getCustCity() + "'" +
            ", custState='" + getCustState() + "'" +
            ", custCountry='" + getCustCountry() + "'" +
            ", custZipcode='" + getCustZipcode() + "'" +
            ", custPrefPg=" + getCustPrefPg() +
            ", custStatus='" + getCustStatus() + "'" +
            ", custUnqId='" + getCustUnqId() + "'" +
            ", billCycle='" + getBillCycle() + "'" +
            ", billDate='" + getBillDate() + "'" +
            ", billDueTenor='" + getBillDueTenor() + "'" +
            ", creditLimit=" + getCreditLimit() +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
