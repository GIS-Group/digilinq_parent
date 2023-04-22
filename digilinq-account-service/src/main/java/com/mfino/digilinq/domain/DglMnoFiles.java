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
 * A DglMnoFiles.
 */
@Entity
@Table(name = "dgl_mno_files")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMnoFiles implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "file_id", nullable = false)
    private Integer fileId;

    @NotNull
    @Size(max = 255)
    @Column(name = "file_name", length = 255, nullable = false)
    private String fileName;

    @NotNull
    @Size(max = 255)
    @Column(name = "file_url", length = 255, nullable = false)
    private String fileUrl;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accMno" }, allowSetters = true)
    private DglDocPol docPol;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno accMno;

}
