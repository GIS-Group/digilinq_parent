package com.mfino.digilinq.account.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Srikanth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOAuthClientResponse {

  private String client_id;
  private String client_secret;

}
