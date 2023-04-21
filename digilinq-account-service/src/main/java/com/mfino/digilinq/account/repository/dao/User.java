package com.mfino.digilinq.account.repository.dao;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author: Srikanth
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USER")
@Builder
public class User extends DateAudit {

  private static final long serialVersionUID = 382525774604736459L;

@ManyToMany(fetch = FetchType.EAGER,
      cascade = CascadeType.ALL)
  @JoinTable(name = "USER_ROLES",
      joinColumns = {@JoinColumn(name = "user_id")},
      inverseJoinColumns = {@JoinColumn(name = "role_id")})
  Set<Role> roles;

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @Column(name = "USER_ID", updatable = false, nullable = false)
  private String userId;

  @Column(name = "USER_NAME", updatable = false, nullable = false)
  private String userName;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "FIRST_NAME", nullable = false)
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;

  @Column(name = "EMAIL", nullable = false)
  private String email;

  @Column(name = "CART_ID")
  private String cartId;

  public User(String userName, String password, String firstName, String lastName, String email) {
    this.userName = userName;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
  }
}
