package cn.edu.xidian.order_service.controller;

import cn.edu.xidian.order_service.service_proxy.DistributionService;
import cn.edu.xidian.order_service.service_proxy.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private DistributionService distributionService;
    @Autowired
    private InventoryService inventoryService;

    @RequestMapping(value = "/place")
    public String placeOrder(@RequestParam(value="info", required = false) String orderInfo) {
        String res0 = "已下单!<br/>";                                          //下订单操作
        String res1 = inventoryService.updateInventory("库存信息");         //更新库存
        String res2 = distributionService.addDistributionTask("配送信息");  //新增配送任务
        return res0 + res1 + res2;
    }
    //
    @RequestMapping("/list")
    public String getOrders(@RequestParam(value="id") Long id) {
        return "用户" + id.toString() + "的订单列表:<br/>...";
    }
}
