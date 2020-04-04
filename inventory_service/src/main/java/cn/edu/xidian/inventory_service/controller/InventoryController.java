package cn.edu.xidian.inventory_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class InventoryController {

    @RequestMapping(value = "/update")
    String updateInventory(@RequestParam(value="info", required = false) String info){
        return "已更新库存!<br/>";
    }

    @RequestMapping(value = "/query")
    String queryInventory(@RequestParam("id") Long id){
        return "商品" + id.toString() + "剩余库存1234个!<br/>";
    }
}
