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

@Entity
@Table(name = "dgl_acc_unique_feilds")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglAccUniqueFeilds implements Serializable{
	
	  private static final long serialVersionUID = 1L;
      
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @Column(name="id")
	  private Long id;
	  
	  @Column(name="name")
	  private String name;
	  
	  @Column(name="prefix")
	  private String prefix;
	  
	  @Column(name="serial")
	  private Long serial;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public Long getSerial() {
		return serial;
	}

	public void setSerial(Long serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "DglAccUniqueFeilds [id=" + id + ", name=" + name + ", prefix=" + prefix + ", serial=" + serial + "]";
	}
	  
}
