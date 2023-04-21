package com.mfino.digilinq.account.exception;

import lombok.Getter;


/**
 * @author: Srikanth
 */
public class SuccessCodeWithErrorResponse extends RuntimeException {

  private static final long serialVersionUID = -5730280239558546471L;

@Getter
  private ErrorResponse errorResponse;

  @Getter
  private String id;

  public SuccessCodeWithErrorResponse(String id, ErrorResponse errorResponse) {
    this.id = id;
    this.errorResponse = errorResponse;
  }

  public SuccessCodeWithErrorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
  }

}
