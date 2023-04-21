package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdContractType.
 */
@Entity
@Table(name = "dgl_md_contract_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdContractType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "contract_type_title", length = 100, nullable = false)
    private String contractTypeTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "contract_type_desc", length = 255, nullable = false)
    private String contractTypeDesc;

    @NotNull
    @Column(name = "contract_type_id", nullable = false)
    private Integer contractTypeId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_contr_status", length = 255, nullable = false)
    private String mdContrStatus;

    @NotNull
    @Column(name = "is_event", nullable = false)
    private Boolean isEvent;

    @ManyToOne(optional = false)
    @NotNull
    private DglMdCustCat custCat;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdContractType id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractTypeTitle() {
        return this.contractTypeTitle;
    }

    public DglMdContractType contractTypeTitle(String contractTypeTitle) {
        this.setContractTypeTitle(contractTypeTitle);
        return this;
    }

    public void setContractTypeTitle(String contractTypeTitle) {
        this.contractTypeTitle = contractTypeTitle;
    }

    public String getContractTypeDesc() {
        return this.contractTypeDesc;
    }

    public DglMdContractType contractTypeDesc(String contractTypeDesc) {
        this.setContractTypeDesc(contractTypeDesc);
        return this;
    }

    public void setContractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
    }

    public Integer getContractTypeId() {
        return this.contractTypeId;
    }

    public DglMdContractType contractTypeId(Integer contractTypeId) {
        this.setContractTypeId(contractTypeId);
        return this;
    }

    public void setContractTypeId(Integer contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public String getMdContrStatus() {
        return this.mdContrStatus;
    }

    public DglMdContractType mdContrStatus(String mdContrStatus) {
        this.setMdContrStatus(mdContrStatus);
        return this;
    }

    public void setMdContrStatus(String mdContrStatus) {
        this.mdContrStatus = mdContrStatus;
    }

    public Boolean getIsEvent() {
        return this.isEvent;
    }

    public DglMdContractType isEvent(Boolean isEvent) {
        this.setIsEvent(isEvent);
        return this;
    }

    public void setIsEvent(Boolean isEvent) {
        this.isEvent = isEvent;
    }

    public DglMdCustCat getCustCat() {
        return this.custCat;
    }

    public void setCustCat(DglMdCustCat dglMdCustCat) {
        this.custCat = dglMdCustCat;
    }

    public DglMdContractType custCat(DglMdCustCat dglMdCustCat) {
        this.setCustCat(dglMdCustCat);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdContractType)) {
            return false;
        }
        return id != null && id.equals(((DglMdContractType) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractType{" +
            "id=" + getId() +
            ", contractTypeTitle='" + getContractTypeTitle() + "'" +
            ", contractTypeDesc='" + getContractTypeDesc() + "'" +
            ", contractTypeId=" + getContractTypeId() +
            ", mdContrStatus='" + getMdContrStatus() + "'" +
            ", isEvent='" + getIsEvent() + "'" +
            "}";
    }
}
