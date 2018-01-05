package cn.wolfcode.client.mgrsite.controller;

import cn.wolfcode.shop.api.domain.Product;
import cn.wolfcode.shop.api.service.IProductService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ProductController
{
    @Reference
    private IProductService productService;

    @RequestMapping("getAllProduct")
    @ResponseBody
    public List<Product> getAllProduct()
    {
        return productService.getAllProduct();
    }
}
