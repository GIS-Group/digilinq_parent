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
@Table(name = "dgl_cust_roles", schema = "digilinq_dev_new")
public class DglCustRoles implements Serializable {
    private static final long serialVersionUID = 8893568185425674475L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private DglCustomer customer;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "role_unq_id", length = 50)
    private String roleUnqId;

    @Lob
    @Column(name = "role_desc")
    private String roleDesc;

    @Lob
    @Column(name = "permissions")
    private String permissions;

    @OneToMany(mappedBy = "role")
    private Set<DglCustUsers> dglCustUsers = new LinkedHashSet<>();

}