package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglMdDocType.
 */
@Entity
@Table(name = "dgl_md_doc_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdDocType implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "doc_type_title", length = 100, nullable = false)
    private String docTypeTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "allow_file_format", length = 255, nullable = false)
    private String allowFileFormat;

    @Size(max = 255)
    @Column(name = "doc_type_desc", length = 255)
    private String docTypeDesc;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "doc_type_id", nullable = false)
    private Integer docTypeId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_doc_status", length = 255, nullable = false)
    private String mdDocStatus;

}
