package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglContracts} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglContractsDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer contractId;

    @NotNull
    @Size(max = 255)
    private String contractName;

    @NotNull
    private Integer status;

    @NotNull
    private Integer contractUnqId;

    @NotNull
    @Size(max = 255)
    private String contractFile;

    @NotNull
    private Instant signedDate;

    @NotNull
    private Instant enforceDate;

    @NotNull
    private Instant terminateDate;

    @NotNull
    @Size(max = 65535)
    private String contrDesc;

    @NotNull
    private Integer contrType;

    private DglAccMnoDTO accMno;

    private DglAccMnoDTO receivingParty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    public Integer getContrType() {
        return contrType;
    }

    public void setContrType(Integer contrType) {
        this.contrType = contrType;
    }

    public DglAccMnoDTO getAccMno() {
        return accMno;
    }

    public void setAccMno(DglAccMnoDTO accMno) {
        this.accMno = accMno;
    }

    public DglAccMnoDTO getReceivingParty() {
        return receivingParty;
    }

    public void setReceivingParty(DglAccMnoDTO receivingParty) {
        this.receivingParty = receivingParty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglContractsDTO)) {
            return false;
        }

        DglContractsDTO dglContractsDTO = (DglContractsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglContractsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContractsDTO{" +
            "id=" + getId() +
            ", contractId=" + getContractId() +
            ", contractName='" + getContractName() + "'" +
            ", status=" + getStatus() +
            ", contractUnqId=" + getContractUnqId() +
            ", contractFile='" + getContractFile() + "'" +
            ", signedDate='" + getSignedDate() + "'" +
            ", enforceDate='" + getEnforceDate() + "'" +
            ", terminateDate='" + getTerminateDate() + "'" +
            ", contrDesc='" + getContrDesc() + "'" +
            ", contrType=" + getContrType() +
            ", accMno=" + getAccMno() +
            ", receivingParty=" + getReceivingParty() +
            "}";
    }
}
