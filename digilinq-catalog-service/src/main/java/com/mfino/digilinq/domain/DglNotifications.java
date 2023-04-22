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
 * A DglNotifications.
 */
@Entity
@Table(name = "dgl_notifications")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglNotifications implements Serializable {

    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_tp_type", length = 100, nullable = false)
    private String ntfTpType;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_tp_name", length = 100, nullable = false)
    private String ntfTpName;

    @NotNull
    @Size(max = 65535)
    @Column(name = "ntf_tp_info", length = 65535, nullable = false)
    private String ntfTpInfo;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_status", length = 100, nullable = false)
    private String ntfStatus;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ntf_id", nullable = false)
    private Integer ntfId;

}
