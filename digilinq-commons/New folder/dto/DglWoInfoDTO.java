package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglWoInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWoInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer woInfoId;

    @NotNull
    private Integer relCustId;

    @NotNull
    private Integer relMnoId;

    @NotNull
    @Size(max = 255)
    private String woUnqId;

    @NotNull
    private Instant woAlltdDt;

    @NotNull
    @Size(max = 255)
    private String woDesc;

    @NotNull
    @Size(max = 255)
    private String woState;

    @NotNull
    @Size(max = 255)
    private String woStatus;

    private DglOrdInfoDTO ord;

    private DglWhInfoDTO wh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWoInfoId() {
        return woInfoId;
    }

    public void setWoInfoId(Integer woInfoId) {
        this.woInfoId = woInfoId;
    }

    public Integer getRelCustId() {
        return relCustId;
    }

    public void setRelCustId(Integer relCustId) {
        this.relCustId = relCustId;
    }

    public Integer getRelMnoId() {
        return relMnoId;
    }

    public void setRelMnoId(Integer relMnoId) {
        this.relMnoId = relMnoId;
    }

    public String getWoUnqId() {
        return woUnqId;
    }

    public void setWoUnqId(String woUnqId) {
        this.woUnqId = woUnqId;
    }

    public Instant getWoAlltdDt() {
        return woAlltdDt;
    }

    public void setWoAlltdDt(Instant woAlltdDt) {
        this.woAlltdDt = woAlltdDt;
    }

    public String getWoDesc() {
        return woDesc;
    }

    public void setWoDesc(String woDesc) {
        this.woDesc = woDesc;
    }

    public String getWoState() {
        return woState;
    }

    public void setWoState(String woState) {
        this.woState = woState;
    }

    public String getWoStatus() {
        return woStatus;
    }

    public void setWoStatus(String woStatus) {
        this.woStatus = woStatus;
    }

    public DglOrdInfoDTO getOrd() {
        return ord;
    }

    public void setOrd(DglOrdInfoDTO ord) {
        this.ord = ord;
    }

    public DglWhInfoDTO getWh() {
        return wh;
    }

    public void setWh(DglWhInfoDTO wh) {
        this.wh = wh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWoInfoDTO)) {
            return false;
        }

        DglWoInfoDTO dglWoInfoDTO = (DglWoInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglWoInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglWoInfoDTO{" +
            "id=" + getId() +
            ", woInfoId=" + getWoInfoId() +
            ", relCustId=" + getRelCustId() +
            ", relMnoId=" + getRelMnoId() +
            ", woUnqId='" + getWoUnqId() + "'" +
            ", woAlltdDt='" + getWoAlltdDt() + "'" +
            ", woDesc='" + getWoDesc() + "'" +
            ", woState='" + getWoState() + "'" +
            ", woStatus='" + getWoStatus() + "'" +
            ", ord=" + getOrd() +
            ", wh=" + getWh() +
            "}";
    }
}
