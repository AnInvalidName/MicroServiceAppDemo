package cn.edu.xidian.distribution_service.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DistributionController {
    @RequestMapping(value = "/add")
    String addDistributionTask(@RequestParam(value="info", required = false) String info){
        return "已添加配送任务!<br/>";
    }

    @RequestMapping(value = "/query")
    String addDistributionTask(@RequestParam("id") Long id){
        return "任务" + id.toString() + "已在配送中!<br/>";
    }
}
