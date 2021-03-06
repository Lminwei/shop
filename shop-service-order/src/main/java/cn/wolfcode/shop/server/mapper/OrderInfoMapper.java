package cn.wolfcode.shop.server.mapper;

import cn.wolfcode.shop.api.domain.OrderInfo;
import java.util.List;

public interface OrderInfoMapper
{
    int deleteByPrimaryKey(Long id);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(Long id);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}