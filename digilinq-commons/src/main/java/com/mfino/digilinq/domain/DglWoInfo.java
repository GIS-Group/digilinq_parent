package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglWoInfo.
 */
@Entity
@Table(name = "dgl_wo_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWoInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "wo_info_id", nullable = false)
    private Integer woInfoId;

    @NotNull
    @Column(name = "rel_cust_id", nullable = false)
    private Integer relCustId;

    @NotNull
    @Column(name = "rel_mno_id", nullable = false)
    private Integer relMnoId;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_unq_id", length = 255, nullable = false)
    private String woUnqId;

    @NotNull
    @Column(name = "wo_alltd_dt", nullable = false)
    private Instant woAlltdDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_desc", length = 255, nullable = false)
    private String woDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_state", length = 255, nullable = false)
    private String woState;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_status", length = 255, nullable = false)
    private String woStatus;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    @ManyToOne(optional = false)
    @NotNull
    private DglWhInfo wh;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglWoInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWoInfoId() {
        return this.woInfoId;
    }

    public DglWoInfo woInfoId(Integer woInfoId) {
        this.setWoInfoId(woInfoId);
        return this;
    }

    public void setWoInfoId(Integer woInfoId) {
        this.woInfoId = woInfoId;
    }

    public Integer getRelCustId() {
        return this.relCustId;
    }

    public DglWoInfo relCustId(Integer relCustId) {
        this.setRelCustId(relCustId);
        return this;
    }

    public void setRelCustId(Integer relCustId) {
        this.relCustId = relCustId;
    }

    public Integer getRelMnoId() {
        return this.relMnoId;
    }

    public DglWoInfo relMnoId(Integer relMnoId) {
        this.setRelMnoId(relMnoId);
        return this;
    }

    public void setRelMnoId(Integer relMnoId) {
        this.relMnoId = relMnoId;
    }

    public String getWoUnqId() {
        return this.woUnqId;
    }

    public DglWoInfo woUnqId(String woUnqId) {
        this.setWoUnqId(woUnqId);
        return this;
    }

    public void setWoUnqId(String woUnqId) {
        this.woUnqId = woUnqId;
    }

    public Instant getWoAlltdDt() {
        return this.woAlltdDt;
    }

    public DglWoInfo woAlltdDt(Instant woAlltdDt) {
        this.setWoAlltdDt(woAlltdDt);
        return this;
    }

    public void setWoAlltdDt(Instant woAlltdDt) {
        this.woAlltdDt = woAlltdDt;
    }

    public String getWoDesc() {
        return this.woDesc;
    }

    public DglWoInfo woDesc(String woDesc) {
        this.setWoDesc(woDesc);
        return this;
    }

    public void setWoDesc(String woDesc) {
        this.woDesc = woDesc;
    }

    public String getWoState() {
        return this.woState;
    }

    public DglWoInfo woState(String woState) {
        this.setWoState(woState);
        return this;
    }

    public void setWoState(String woState) {
        this.woState = woState;
    }

    public String getWoStatus() {
        return this.woStatus;
    }

    public DglWoInfo woStatus(String woStatus) {
        this.setWoStatus(woStatus);
        return this;
    }

    public void setWoStatus(String woStatus) {
        this.woStatus = woStatus;
    }

    public DglOrdInfo getOrd() {
        return this.ord;
    }

    public void setOrd(DglOrdInfo dglOrdInfo) {
        this.ord = dglOrdInfo;
    }

    public DglWoInfo ord(DglOrdInfo dglOrdInfo) {
        this.setOrd(dglOrdInfo);
        return this;
    }

    public DglWhInfo getWh() {
        return this.wh;
    }

    public void setWh(DglWhInfo dglWhInfo) {
        this.wh = dglWhInfo;
    }

    public DglWoInfo wh(DglWhInfo dglWhInfo) {
        this.setWh(dglWhInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWoInfo)) {
            return false;
        }
        return id != null && id.equals(((DglWoInfo) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglWoInfo{" +
            "id=" + getId() +
            ", woInfoId=" + getWoInfoId() +
            ", relCustId=" + getRelCustId() +
            ", relMnoId=" + getRelMnoId() +
            ", woUnqId='" + getWoUnqId() + "'" +
            ", woAlltdDt='" + getWoAlltdDt() + "'" +
            ", woDesc='" + getWoDesc() + "'" +
            ", woState='" + getWoState() + "'" +
            ", woStatus='" + getWoStatus() + "'" +
            "}";
    }
}
