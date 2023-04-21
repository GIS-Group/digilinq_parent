package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOrdAddress.
 */
@Entity
@Table(name = "dgl_ord_address")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "ord_add_id", nullable = false)
    private Integer ordAddId;

    @NotNull
    @Size(max = 255)
    @Column(name = "add_title", length = 255, nullable = false)
    private String addTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_add_add_line_1", length = 255, nullable = false)
    private String ordAddAddLine1;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_add_add_line_2", length = 255, nullable = false)
    private String ordAddAddLine2;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_add_city", length = 100, nullable = false)
    private String ordAddCity;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_add_state", length = 100, nullable = false)
    private String ordAddState;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_add_country", length = 100, nullable = false)
    private String ordAddCountry;

    @NotNull
    @Size(max = 50)
    @Column(name = "ord_add_zipcode", length = 50, nullable = false)
    private String ordAddZipcode;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOrdAddress id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdAddId() {
        return this.ordAddId;
    }

    public DglOrdAddress ordAddId(Integer ordAddId) {
        this.setOrdAddId(ordAddId);
        return this;
    }

    public void setOrdAddId(Integer ordAddId) {
        this.ordAddId = ordAddId;
    }

    public String getAddTitle() {
        return this.addTitle;
    }

    public DglOrdAddress addTitle(String addTitle) {
        this.setAddTitle(addTitle);
        return this;
    }

    public void setAddTitle(String addTitle) {
        this.addTitle = addTitle;
    }

    public String getOrdAddAddLine1() {
        return this.ordAddAddLine1;
    }

    public DglOrdAddress ordAddAddLine1(String ordAddAddLine1) {
        this.setOrdAddAddLine1(ordAddAddLine1);
        return this;
    }

    public void setOrdAddAddLine1(String ordAddAddLine1) {
        this.ordAddAddLine1 = ordAddAddLine1;
    }

    public String getOrdAddAddLine2() {
        return this.ordAddAddLine2;
    }

    public DglOrdAddress ordAddAddLine2(String ordAddAddLine2) {
        this.setOrdAddAddLine2(ordAddAddLine2);
        return this;
    }

    public void setOrdAddAddLine2(String ordAddAddLine2) {
        this.ordAddAddLine2 = ordAddAddLine2;
    }

    public String getOrdAddCity() {
        return this.ordAddCity;
    }

    public DglOrdAddress ordAddCity(String ordAddCity) {
        this.setOrdAddCity(ordAddCity);
        return this;
    }

    public void setOrdAddCity(String ordAddCity) {
        this.ordAddCity = ordAddCity;
    }

    public String getOrdAddState() {
        return this.ordAddState;
    }

    public DglOrdAddress ordAddState(String ordAddState) {
        this.setOrdAddState(ordAddState);
        return this;
    }

    public void setOrdAddState(String ordAddState) {
        this.ordAddState = ordAddState;
    }

    public String getOrdAddCountry() {
        return this.ordAddCountry;
    }

    public DglOrdAddress ordAddCountry(String ordAddCountry) {
        this.setOrdAddCountry(ordAddCountry);
        return this;
    }

    public void setOrdAddCountry(String ordAddCountry) {
        this.ordAddCountry = ordAddCountry;
    }

    public String getOrdAddZipcode() {
        return this.ordAddZipcode;
    }

    public DglOrdAddress ordAddZipcode(String ordAddZipcode) {
        this.setOrdAddZipcode(ordAddZipcode);
        return this;
    }

    public void setOrdAddZipcode(String ordAddZipcode) {
        this.ordAddZipcode = ordAddZipcode;
    }

    public DglOrdInfo getOrd() {
        return this.ord;
    }

    public void setOrd(DglOrdInfo dglOrdInfo) {
        this.ord = dglOrdInfo;
    }

    public DglOrdAddress ord(DglOrdInfo dglOrdInfo) {
        this.setOrd(dglOrdInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdAddress)) {
            return false;
        }
        return id != null && id.equals(((DglOrdAddress) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdAddress{" +
            "id=" + getId() +
            ", ordAddId=" + getOrdAddId() +
            ", addTitle='" + getAddTitle() + "'" +
            ", ordAddAddLine1='" + getOrdAddAddLine1() + "'" +
            ", ordAddAddLine2='" + getOrdAddAddLine2() + "'" +
            ", ordAddCity='" + getOrdAddCity() + "'" +
            ", ordAddState='" + getOrdAddState() + "'" +
            ", ordAddCountry='" + getOrdAddCountry() + "'" +
            ", ordAddZipcode='" + getOrdAddZipcode() + "'" +
            "}";
    }
}
