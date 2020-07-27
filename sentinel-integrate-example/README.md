# 整合 Spring Cloud Alibaba Sentinel

1. 先启动 Sentinel Dashboard 服务，具体可以参考官方文档

2. 在浏览器输入 `localhost:8080` （用你设置的端口号就行）

3. 在 Sentinel 控制台输入账号密码，默认都是 `sentinel`

4. 在浏览器输入 `http://localhost:18083/hello/fatal`，看到响应 `Hello, fatal` 后，去刷新下 Sentinel 控制台，你会发现，
侧栏多了 `sentinel-integrate-example`，表示已经被监控了，点击*实时监控*，却没显示监控数据。18083 端口再次请求一次，
隔了一两秒，就出现监控数据了。这就表示整合成功。。。
> 其实被监控的应用要是隔断时间没被访问，实时监控页面会再次变为空白。