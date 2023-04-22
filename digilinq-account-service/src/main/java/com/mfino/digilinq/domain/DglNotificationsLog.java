package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
 * A DglNotificationsLog.
 */
@Entity
@Table(name = "dgl_notifications_log")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglNotificationsLog implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 65535)
    @Column(name = "ntf_tp_sent_users", length = 65535, nullable = false)
    private String ntfTpSentUsers;

    @NotNull
    @Column(name = "ntf_tp_sent_dt", nullable = false)
    private Instant ntfTpSentDt;

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
    @Column(name = "ntf_log_id", nullable = false)
    private Integer ntfLogId;

    @ManyToOne(optional = false)
    @NotNull
    private DglNotifications ntf;

   
}
