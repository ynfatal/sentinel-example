package com.example.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * 接入埋点
 * - HTTP 埋点：Sentinel starter 默认为所有的 HTTP 服务提供了限流埋点，如果只想对 HTTP 服务进行限流，那么只需要引入依赖，无需修改代码。
 * - 自定义埋点：如果需要对某个特定的方法进行限流或降级，可以通过 `@SentinelResource` 注解来完成限流的埋点。
 * 注解 @SentinelResource：用于定义资源，并提供可选的异常处理和 fallback 配置项。
 * 详细介绍可以参考 https://github.com/alibaba/Sentinel/wiki/%E6%B3%A8%E8%A7%A3%E6%94%AF%E6%8C%81
 * @author Fatal
 * @date 2020/7/28 8:28
 */
@Service
public class TestService {

    /**
     * 测试整合
     * @param name
     * @return
     */
    @SentinelResource(value = "sayHello")
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    /**
     * 测试降级
     * @return
     */
    @SentinelResource(value = "testFallback", fallback = "fallback")
    public String testFallback() {
        throw new RuntimeException("testFallback call failed...");
    }

    public String fallback() {
        return "fallback";
    }
}
