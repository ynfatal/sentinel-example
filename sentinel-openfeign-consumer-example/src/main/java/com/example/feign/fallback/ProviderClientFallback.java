package com.example.feign.fallback;

import com.example.feign.IProviderClient;
import org.springframework.stereotype.Component;

/**
 * @author Fatal
 * @date 2020/7/29 9:26
 */
@Component
public class ProviderClientFallback implements IProviderClient {

    @Override
    public String hello(String name) {
        return "hello fallback";
    }
}
