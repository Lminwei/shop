package cn.wolfcode.shop.server.service.impl;

import cn.wolfcode.shop.api.domain.Product;
import cn.wolfcode.shop.api.service.IProductService;
import cn.wolfcode.shop.server.mapper.ProductMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService
{
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getAllProduct()
    {
        return productMapper.selectAll();
    }
}
