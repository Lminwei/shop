package cn.wolfcode.shop.server.service.impl;

import cn.wolfcode.shop.api.domain.OrderInfo;
import cn.wolfcode.shop.api.service.IOrderInfoService;
import cn.wolfcode.shop.server.mapper.OrderInfoMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class OrderInfoServiceImpl implements IOrderInfoService
{
    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> getAllOrderInfo()
    {
        return orderInfoMapper.selectAll();
    }
}
