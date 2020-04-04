package cn.edu.xidian.order_service.service_proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "inventory-service")
public interface InventoryService {
    @RequestMapping(value = "/update")
    String updateInventory(@RequestParam(value="info", required = false) String info);
}
