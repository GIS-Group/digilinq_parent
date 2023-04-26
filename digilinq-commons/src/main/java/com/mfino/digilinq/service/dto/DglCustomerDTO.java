package com.mfino.digilinq.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.models.auth.In;
import lombok.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCustomer} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DglCustomerDTO implements Serializable {

    @Deprecated
    private Long id;

    private Integer customerId;

    @NotNull
    @Size(max = 255)
    private String custName;

    @NotNull
    @Size(max = 255)
    private String custCompName;

    private Instant custIncorpDt;

    @NotNull
    @Size(max = 255)
    private String custTaxId;

    @NotNull
    private Integer custCurrency;

    @NotNull
    private Integer custLang;

    @NotNull
    private Integer custTimeZone;

    @NotNull
    private Boolean custOrient;

    @NotNull
    @Size(max = 255)
    private String custPrimCont;

    @NotNull
    @Size(max = 255)
    private String custEmailId;

    @NotNull
    @Size(max = 255)
    private String custAltCont;

    @NotNull
    @Size(max = 255)
    private String custFax;

    @NotNull
    @Size(max = 255)
    private String custWebUrl;

    @NotNull
    @Size(max = 255)
    private String custAddL1;

    @Size(max = 255)
    private String custAddL2;

    @NotNull
    @Size(max = 255)
    private String custCity;

    @NotNull
    @Size(max = 255)
    private String custState;

    @NotNull
    @Size(max = 255)
    private String custCountry;

    @NotNull
    @Size(max = 255)
    private String custZipcode;

    @NotNull
    private Integer custPrefPg;

    @NotNull
    @Size(max = 255)
    private String custStatus;

    @NotNull
    private Integer custUnqId;

    @NotNull
    @Size(max = 255)
    private String billCycle;

    @NotNull
    private Instant billDate;

    @NotNull
    @Size(max = 255)
    private String billDueTenor;

    @NotNull
    private Float creditLimit;

    private String custParent;

    @JsonIgnore
    private DglAccMnoDTO accMnoParent;
    private Long accMnoParentId;
    private Long custUserUnqid;
    private CustUserInfo custUserInfo;
    private CustContractInfo custContractInfo;
    private String customerType;

    public Long getId() {
        return id;
    }


    @Setter
    @Getter
    @ToString
    @Builder
    static  public class CustUserInfo {
        private Integer custId;
        private Integer custRoleId;
        private Long roleId;
        private Integer roleUnqId;
        private Integer status;
        private String firstName;
        private String lastName;
        private String emailId;
        private String phoneNumber;
        private String roleName;
        private String roleDesc;
        private String permissions;
    }

    @Setter
    @Getter
    @ToString
    @Builder
    static  public class CustContractInfo {
        private Integer contractId;
        private String contractName;
        private Integer contractUnqId;
        private Integer status;
        private String contractFile;
        private Instant signedDate;
        private Instant enforceDate;
        private Instant terminateDate;
        private String contractDesc;
        private Integer contractType;
    }


}
