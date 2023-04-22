package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglMdContractTypeConfig.
 */
@Entity
@Table(name = "dgl_md_contract_type_config")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdContractTypeConfig implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "contract_type_config_id", nullable = false)
    private Integer contractTypeConfigId;

    @NotNull
    @Size(max = 100)
    @Column(name = "config_title", length = 100, nullable = false)
    private String configTitle;

    @NotNull
    @Size(max = 65535)
    @Column(name = "config_details", length = 65535, nullable = false)
    private String configDetails;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "custCat" }, allowSetters = true)
    private DglMdContractType contract;

}
