package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "dgl_notifications", schema = "digilinq_dev_new")
public class DglNotifications implements Serializable {
    private static final long serialVersionUID = 2520102330569552784L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nft_id", nullable = false)
    private Long id;

    @Column(name = "ntf_tp_type", length = 100)
    private String ntfTpType;

    @Column(name = "ntf_tp_name", length = 100)
    private String ntfTpName;

    @Lob
    @Column(name = "ntf_tp_info")
    private String ntfTpInfo;

    @Column(name = "ntf_status", length = 100)
    private String ntfStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

    @OneToMany(mappedBy = "ntf")
    private Set<DglNotificationsLog> dglNotificationsLogs = new LinkedHashSet<>();

}