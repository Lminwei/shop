package cn.wolfcode.shop.api.service;

import cn.wolfcode.shop.api.domain.User;

public interface IUserService
{
    User register(User user);
    Boolean isExist(String username);
    /**
     * 登录
     * @return
     */
    public String login(String userName,String password);

    /**
     * 退出
     */
    public Boolean logout(String token);
}
