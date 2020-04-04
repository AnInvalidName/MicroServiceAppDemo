# MicroserviceAppDemo
使用到的组件都属于Spring Cloud Netflix，包括：  
* eureka 服务发现与注册组件
* zuul API网关组件
* Feign 声明式web service客户端
* Ribbon 客户端负载均衡工具

### inventory_service 
库存服务，提供更新库存、查库存接口。   
### distribution_service
配送服务，提供新增配送任务、查询任务接口。 
### order_service
订单服务，提供下订单、查订单接口；  
下订单接口调用库存服务的更新库存接口和配送服务的新增配送任务接口。 
### zuul_gateway 
API网关   
### eureka_server 
注册中心  
 

