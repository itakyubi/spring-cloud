spring cloud组件
- eureka-server：服务注册中心，所有服务提供者都需要注册到这里
- eureka-client: 通过eureka-client将本服务注册到eureka-server
- zuul: 网关，负责路由转发和请求过滤


本工程中
- 有两个eureka-server，且互为eureka-client
- eureka-client是一个服务提供者，拥有业务相关的接口，可以直接对外提供接口
- zuul是统一网关，将请求转发到eureka-client去，并且有一定的过滤规则


端口汇总
- eureka-server01: 7001
- eureka-server02: 7002
- eureka-client: 7999
- zuul: 7003