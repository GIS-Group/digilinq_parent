package com.mfino.digilinq.commons.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mfino.digilinq.commons.web.GetProductResponse;


/**
 * @author: Srikanth
 */
@FeignClient("digilinq-catalog-service")
public interface CatalogFeignClient {

    @GetMapping("/product/{productId}")
    GetProductResponse getProduct(@PathVariable("productId") String productId);

}
