package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "dgl_md_doc_type", schema = "digilinq_dev_new")
public class DglMdDocType implements Serializable {
    private static final long serialVersionUID = -4557746338014451836L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_type_id", nullable = false)
    private Long id;

    @Column(name = "doc_type_title")
    private String docTypeTitle;

    @Column(name = "allow_file_format")
    private String allowFileFormat;

    @Column(name = "doc_type_desc")
    private String docTypeDesc;

    @Column(name = "md_doc_status")
    private String mdDocStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}