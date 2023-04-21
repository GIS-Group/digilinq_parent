package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglItemFiles} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemFilesDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer itemFileId;

    @NotNull
    @Size(max = 255)
    private String fileUrl;

    private DglCatItemsInfoDTO item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemFileId() {
        return itemFileId;
    }

    public void setItemFileId(Integer itemFileId) {
        this.itemFileId = itemFileId;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public DglCatItemsInfoDTO getItem() {
        return item;
    }

    public void setItem(DglCatItemsInfoDTO item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglItemFilesDTO)) {
            return false;
        }

        DglItemFilesDTO dglItemFilesDTO = (DglItemFilesDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglItemFilesDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglItemFilesDTO{" +
            "id=" + getId() +
            ", itemFileId=" + getItemFileId() +
            ", fileUrl='" + getFileUrl() + "'" +
            ", item=" + getItem() +
            "}";
    }
}
