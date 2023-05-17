package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

import javax.validation.constraints.NotNull;

import com.mfino.digilinq.account.enumeration.StatusType;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglContracts} entity.
 */
public class DglContractsDTO implements Serializable {

    private Long id;

    private String contractName;
    
    @NotNull(message = "status type cant be null")
    private StatusType status;

    private Integer contractUnqId;
    
    @NotNull(message = "contractFile type cant be null")
    private String contractFile;
    
    @NotNull(message = "signedDate type cant be null")
    private Instant signedDate;
    
    @NotNull(message = "enforceDate type cant be null")
    private Instant enforceDate;
    
    @NotNull(message = "terminateDate type cant be null")
    private Instant terminateDate;

    private String contrDesc;


    private Long dglAccMnoId;

    private Long dglContractsReceivingParties;

    private Long dglMdContractTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Integer getContractUnqId() {
        return contractUnqId;
    }

    public void setContractUnqId(Integer contractUnqId) {
        this.contractUnqId = contractUnqId;
    }

    public String getContractFile() {
        return contractFile;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }

    public Instant getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(Instant signedDate) {
        this.signedDate = signedDate;
    }

    public Instant getEnforceDate() {
        return enforceDate;
    }

    public void setEnforceDate(Instant enforceDate) {
        this.enforceDate = enforceDate;
    }

    public Instant getTerminateDate() {
        return terminateDate;
    }

    public void setTerminateDate(Instant terminateDate) {
        this.terminateDate = terminateDate;
    }

    public String getContrDesc() {
        return contrDesc;
    }

    public void setContrDesc(String contrDesc) {
        this.contrDesc = contrDesc;
    }


    public Long getDglAccMnoId() {
		return dglAccMnoId;
	}

	public void setDglAccMnoId(Long dglAccMnoId) {
		this.dglAccMnoId = dglAccMnoId;
	}

	public Long getDglContractsReceivingParties() {
		return dglContractsReceivingParties;
	}

	public void setDglContractsReceivingParties(Long dglContractsReceivingParties) {
		this.dglContractsReceivingParties = dglContractsReceivingParties;
	}

	public Long getDglMdContractTypeId() {
        return dglMdContractTypeId;
    }

    public void setDglMdContractTypeId(Long dglMdContractTypeId) {
        this.dglMdContractTypeId = dglMdContractTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglContractsDTO)) {
            return false;
        }

        return id != null && id.equals(((DglContractsDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContractsDTO{" +
            "id=" + getId() +
            ", contractName='" + getContractName() + "'" +
            ", status='" + getStatus() + "'" +
            ", contractUnqId=" + getContractUnqId() +
            ", contractFile='" + getContractFile() + "'" +
            ", signedDate='" + getSignedDate() + "'" +
            ", enforceDate='" + getEnforceDate() + "'" +
            ", terminateDate='" + getTerminateDate() + "'" +
            ", contrDesc='" + getContrDesc() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            ", dglAccMnoId=" + getDglAccMnoId() +
            ", dglMdContractTypeId=" + getDglMdContractTypeId() +
            "}";
    }
}
