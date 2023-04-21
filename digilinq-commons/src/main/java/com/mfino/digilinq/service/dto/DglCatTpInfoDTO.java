package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCatTpInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatTpInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer tpId;

    @NotNull
    private Integer tpUnqId;

    @NotNull
    @Size(max = 255)
    private String relProdCat;

    @NotNull
    @Size(max = 100)
    private String tpTitle;

    @NotNull
    @Size(max = 100)
    private String tpType;

    @Size(max = 65535)
    private String tpDesc;

    @NotNull
    @Size(max = 65535)
    private String tpStruc;

    @NotNull
    private Integer tpStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public Integer getTpUnqId() {
        return tpUnqId;
    }

    public void setTpUnqId(Integer tpUnqId) {
        this.tpUnqId = tpUnqId;
    }

    public String getRelProdCat() {
        return relProdCat;
    }

    public void setRelProdCat(String relProdCat) {
        this.relProdCat = relProdCat;
    }

    public String getTpTitle() {
        return tpTitle;
    }

    public void setTpTitle(String tpTitle) {
        this.tpTitle = tpTitle;
    }

    public String getTpType() {
        return tpType;
    }

    public void setTpType(String tpType) {
        this.tpType = tpType;
    }

    public String getTpDesc() {
        return tpDesc;
    }

    public void setTpDesc(String tpDesc) {
        this.tpDesc = tpDesc;
    }

    public String getTpStruc() {
        return tpStruc;
    }

    public void setTpStruc(String tpStruc) {
        this.tpStruc = tpStruc;
    }

    public Integer getTpStatus() {
        return tpStatus;
    }

    public void setTpStatus(Integer tpStatus) {
        this.tpStatus = tpStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatTpInfoDTO)) {
            return false;
        }

        DglCatTpInfoDTO dglCatTpInfoDTO = (DglCatTpInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCatTpInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatTpInfoDTO{" +
            "id=" + getId() +
            ", tpId=" + getTpId() +
            ", tpUnqId=" + getTpUnqId() +
            ", relProdCat='" + getRelProdCat() + "'" +
            ", tpTitle='" + getTpTitle() + "'" +
            ", tpType='" + getTpType() + "'" +
            ", tpDesc='" + getTpDesc() + "'" +
            ", tpStruc='" + getTpStruc() + "'" +
            ", tpStatus=" + getTpStatus() +
            "}";
    }
}
