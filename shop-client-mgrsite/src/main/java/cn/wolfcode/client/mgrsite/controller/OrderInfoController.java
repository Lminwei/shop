package cn.wolfcode.client.mgrsite.controller;

import cn.wolfcode.shop.api.domain.OrderInfo;
import cn.wolfcode.shop.api.service.IOrderInfoService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderInfoController
{
    @Reference
    private IOrderInfoService orderInfoService;

    @RequestMapping("getAllOrderInfo")
    @ResponseBody
    public List<OrderInfo> getAllOrderInfo()
    {
        return orderInfoService.getAllOrderInfo();
    }
}
