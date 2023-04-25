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
 * A DglAccUsers.
 */
@Entity
@Table(name = "dgl_acc_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAccUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    //
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "acc_user_id", nullable = false)
    private Long accUserId;

    @NotNull
    @Column(name = "acc_user_unq_id", nullable = false, unique = true)
    private Integer accUserUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "first_name", length = 255, nullable = false)
    private String firstName;

    @NotNull
    @Size(max = 255)
    @Column(name = "last_name", length = 255, nullable = false)
    private String lastName;

    @NotNull
    @Size(max = 255)
    @Column(name = "email", length = 255, nullable = false)
    private String email;

    @NotNull
    @Size(max = 255)
    @Column(name = "phone", length = 255, nullable = false)
    private String phone;

    @NotNull
    @Size(max = 255)
    @Column(name = "profile_img", length = 255, nullable = false)
    private String profileImg;

    @NotNull
    @Size(max = 255)
    @Column(name = "add_line_1", length = 255, nullable = false)
    private String addLine1;

    @Size(max = 255)
    @Column(name = "add_line_2", length = 255)
    private String addLine2;

    @Size(max = 255)
    @Column(name = "city", length = 255)
    private String city;

    @Size(max = 255)
    @Column(name = "state", length = 255)
    private String state;

    @Size(max = 255)
    @Column(name = "country", length = 255)
    private String country;

    @Size(max = 255)
    @Column(name = "zipcode", length = 255)
    private String zipcode;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ROLE_ID", nullable = false)
    private DglRoles role;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "role_role_id", nullable = false)
    private DglRoles roleRole;

    @Size(max = 255)
    @NotNull
    @Column(name = "ADD_LINE1", nullable = false)
    private String addLine11;

    @Size(max = 255)
    @Column(name = "ADD_LINE2")
    private String addLine21;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACC_ID", nullable = false)
    private DglAccMno acc;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "acc_acc_id", nullable = false)
    private DglAccMno accAccMno;

}
