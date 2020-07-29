package com.example.feign;

import com.example.feign.fallback.ProviderClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Fatal
 * @date 2020/7/29 9:25
 */
@FeignClient(value = "sentinel-provider-example", fallback = ProviderClientFallback.class)
public interface IProviderClient {

    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);

}
