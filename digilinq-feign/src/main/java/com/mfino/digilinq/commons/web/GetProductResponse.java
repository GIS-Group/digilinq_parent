package com.mfino.digilinq.commons.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * @author: Srikanth
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse extends DateAudit {

    private String productId;
    private String productName;
    private String description;
    private double price;
    private String productCategory;
    private int availableItemCount;

}
