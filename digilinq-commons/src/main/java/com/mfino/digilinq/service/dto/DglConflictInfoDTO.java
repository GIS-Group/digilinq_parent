package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglConflictInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglConflictInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer conflictInfoId;

    @NotNull
    private Integer relAccId;

    @NotNull
    @Size(max = 100)
    private String conflictAt;

    @NotNull
    @Size(max = 255)
    private String conflictCategory;

    @NotNull
    @Size(max = 100)
    private String conflictAuthPerson;

    private DglWoInfoDTO woInfo;

    private DglWhInfoDTO whInfo;

    private DglOrdInfoDTO ord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConflictInfoId() {
        return conflictInfoId;
    }

    public void setConflictInfoId(Integer conflictInfoId) {
        this.conflictInfoId = conflictInfoId;
    }

    public Integer getRelAccId() {
        return relAccId;
    }

    public void setRelAccId(Integer relAccId) {
        this.relAccId = relAccId;
    }

    public String getConflictAt() {
        return conflictAt;
    }

    public void setConflictAt(String conflictAt) {
        this.conflictAt = conflictAt;
    }

    public String getConflictCategory() {
        return conflictCategory;
    }

    public void setConflictCategory(String conflictCategory) {
        this.conflictCategory = conflictCategory;
    }

    public String getConflictAuthPerson() {
        return conflictAuthPerson;
    }

    public void setConflictAuthPerson(String conflictAuthPerson) {
        this.conflictAuthPerson = conflictAuthPerson;
    }

    public DglWoInfoDTO getWoInfo() {
        return woInfo;
    }

    public void setWoInfo(DglWoInfoDTO woInfo) {
        this.woInfo = woInfo;
    }

    public DglWhInfoDTO getWhInfo() {
        return whInfo;
    }

    public void setWhInfo(DglWhInfoDTO whInfo) {
        this.whInfo = whInfo;
    }

    public DglOrdInfoDTO getOrd() {
        return ord;
    }

    public void setOrd(DglOrdInfoDTO ord) {
        this.ord = ord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglConflictInfoDTO)) {
            return false;
        }

        DglConflictInfoDTO dglConflictInfoDTO = (DglConflictInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglConflictInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglConflictInfoDTO{" +
            "id=" + getId() +
            ", conflictInfoId=" + getConflictInfoId() +
            ", relAccId=" + getRelAccId() +
            ", conflictAt='" + getConflictAt() + "'" +
            ", conflictCategory='" + getConflictCategory() + "'" +
            ", conflictAuthPerson='" + getConflictAuthPerson() + "'" +
            ", woInfo=" + getWoInfo() +
            ", whInfo=" + getWhInfo() +
            ", ord=" + getOrd() +
            "}";
    }
}
