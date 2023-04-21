package com.mfino.digilinq.account.web;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author: Srikanth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapUserToRolesRequest {

  private List<String> roleNames;
}
