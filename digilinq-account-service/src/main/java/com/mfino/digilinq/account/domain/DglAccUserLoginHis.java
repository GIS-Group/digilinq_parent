package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.joda.time.DateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dgl_acc_user_login_his")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DglAccUserLoginHis implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
	private Long id;
	
	@Column(name="unq_id")
	private String unqId;
	
	@Column(name ="last_login_date")
	private DateTime lastLoginDate;
}
