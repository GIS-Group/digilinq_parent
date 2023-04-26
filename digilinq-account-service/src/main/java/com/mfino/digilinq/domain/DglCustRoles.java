package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.*;
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
 * A DglCustRoles.
 */
@Entity
@Table(name = "dgl_cust_roles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustRoles implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @NotNull
    @Size(max = 255)
    @Column(name = "role_name", length = 255, nullable = false)
    private String roleName;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "role_unq_id", nullable = false, unique = true)
    private Integer roleUnqId;

    @NotNull
    @Size(max = 65535)
    @Column(name = "role_desc", length = 65535, nullable = false)
    private String roleDesc;

    @NotNull
    @Size(max = 65535)
    @Column(name = "permissions", length = 65535, nullable = false)
    private String permissions;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "CUST_ID", nullable = false)
    private DglCustomer cust;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "cust_customer_id", nullable = false)
    private DglCustomer customer;

}
