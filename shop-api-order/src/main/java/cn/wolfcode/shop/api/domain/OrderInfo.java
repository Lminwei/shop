package cn.wolfcode.shop.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderInfo implements Serializable
{
    private Long id;

    private String orderSn;

    private Long userId;

    private Byte orderStatus;

    private Byte shippingStatus;

    private Byte payStatus;

    private String consignee;

    private String country;

    private String province;

    private String city;

    private String district;

    private String address;

    private String zipcode;

    private String mobile;

    private BigDecimal orderAmount;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getOrderSn()
    {
        return orderSn;
    }

    public void setOrderSn(String orderSn)
    {
        this.orderSn = orderSn;
    }

    public Long getUserId()
    {
        return userId;
    }

    public void setUserId(Long userId)
    {
        this.userId = userId;
    }

    public Byte getOrderStatus()
    {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus)
    {
        this.orderStatus = orderStatus;
    }

    public Byte getShippingStatus()
    {
        return shippingStatus;
    }

    public void setShippingStatus(Byte shippingStatus)
    {
        this.shippingStatus = shippingStatus;
    }

    public Byte getPayStatus()
    {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus)
    {
        this.payStatus = payStatus;
    }

    public String getConsignee()
    {
        return consignee;
    }

    public void setConsignee(String consignee)
    {
        this.consignee = consignee;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getProvince()
    {
        return province;
    }

    public void setProvince(String province)
    {
        this.province = province;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getDistrict()
    {
        return district;
    }

    public void setDistrict(String district)
    {
        this.district = district;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(String zipcode)
    {
        this.zipcode = zipcode;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public BigDecimal getOrderAmount()
    {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount)
    {
        this.orderAmount = orderAmount;
    }
}