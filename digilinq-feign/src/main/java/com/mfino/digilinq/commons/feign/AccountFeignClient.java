package com.mfino.digilinq.commons.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mfino.digilinq.commons.web.GetUserResponse;


/**
 * @author: Srikanth
 */
@FeignClient("digilinq-account-service")
public interface AccountFeignClient {

    @GetMapping("/user")
    GetUserResponse getUserByUserName(@RequestParam("userName") String userName);

    @GetMapping("/user")
    GetUserResponse getUserById(@RequestParam("userId") String userId);

}
