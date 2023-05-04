package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "dgl_notifications_log", schema = "digilinq_dev_new")
public class DglNotificationsLog implements Serializable {
    private static final long serialVersionUID = 6308191263982632657L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ntf_log_id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "ntf_tp_sent_users")
    private String ntfTpSentUsers;

    @Column(name = "ntf_tp_sent_dt")
    private Instant ntfTpSentDt;

    @Lob
    @Column(name = "ntf_tp_info")
    private String ntfTpInfo;

    @Column(name = "ntf_status", length = 100)
    private String ntfStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ntf_id")
    private DglNotifications ntf;

}