package com.mfino.digilinq.commons.feign;

import org.springframework.cloud.openfeign.FeignClient;


/**
 * @author: Srikanth
 */
@FeignClient("digilinq-order-service")
public interface OrderFeignClient {


}
