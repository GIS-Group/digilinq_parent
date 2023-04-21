package com.mfino.digilinq.commons.web;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Srikanth
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(
        value = {"created_at", "updated_at"},
        allowGetters = true
)
@Getter
@Setter
public abstract class DateAudit implements Serializable {

    @CreatedDate
    private Instant created_at;

    @LastModifiedDate
    private Instant updated_at;

}
