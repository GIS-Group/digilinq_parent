package com.mfino.digilinq.service.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglAccMno} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
@Setter
@Getter
@ToString
public class DglAccMnoDTO implements Serializable {

    @Deprecated
    private Long id;

    private Long accId;

    @NotNull
    @Size(max = 255)
    private String accName;

    @NotNull
    @Size(max = 255)
    private String accCompName;

    private Instant accIncorpDt;

    @NotNull
    @Size(max = 255)
    private String accTaxId;

    @NotNull
    private Integer accCurrency;

    @NotNull
    private Integer accLang;

    @NotNull
    private Integer accTimeZone;

    @NotNull
    private Boolean accOrient;

    @NotNull
    @Size(max = 255)
    private String accPrimCont;

    @NotNull
    @Size(max = 255)
    private String accEmailId;

    @NotNull
    @Size(max = 255)
    private String accAltCont;

    @NotNull
    @Size(max = 255)
    private String accFax;

    @NotNull
    @Size(max = 255)
    private String accWebUrl;

    @NotNull
    @Size(max = 255)
    private String accAddL1;

    @Size(max = 255)
    private String accAddL2;

    @NotNull
    @Size(max = 255)
    private String accCity;

    @NotNull
    @Size(max = 255)
    private String accState;

    @NotNull
    @Size(max = 255)
    private String accCountry;

    @NotNull
    @Size(max = 255)
    private String accZipcode;

    @NotNull
    @Size(max = 255)
    private String accEndPointUrl;

    @NotNull
    @Size(max = 255)
    private String accBillFormat;

    @NotNull
    @Size(max = 255)
    private String accSftpAdd;

    @NotNull
    @Size(max = 255)
    private String accPortNo;

    @NotNull
    @Size(max = 255)
    private String accUsername;

    @NotNull
    @Size(max = 255)
    private String accPassword;

    @NotNull
    @Size(max = 255)
    private String accStatus;

    @NotNull
    private Integer accUnqId;

    @NotNull
    private Integer prefSettleType;

    @NotNull
    @Size(max = 255)
    private String billCycle;

    private Instant billDate;

    @NotNull
    @Size(max = 255)
    private String billDueTenor;

    @NotNull
    @Size(max = 255)
    private String bankAccNum;

    @NotNull
    @Size(max = 255)
    private String bankName;

    @NotNull
    @Size(max = 255)
    private String bankBranchName;

    @NotNull
    @Size(max = 255)
    private String ifscCode;

    @NotNull
    @Size(max = 255)
    private String micrCode;

    @NotNull
    @Size(max = 255)
    private String accType;

    private Long accParentId;

    private Long accMnoParentId;

    private UserInfo userInfo;

    @Setter
    @Getter
    @ToString
    @Builder
    public static class UserInfo {
        private Long userId;
        private Long roleId;
        private String firstName;
        private String lastName;
        private String emailId;
        private String phoneNumber;
    }

}
