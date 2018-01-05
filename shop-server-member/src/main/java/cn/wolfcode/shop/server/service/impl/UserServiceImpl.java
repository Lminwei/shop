package cn.wolfcode.shop.server.service.impl;

import cn.wolfcode.shop.api.domain.User;
import cn.wolfcode.shop.api.service.IUserService;
import cn.wolfcode.shop.server.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserServiceImpl implements IUserService
{
    private static Map<String, Object> userCache = new ConcurrentHashMap<String, Object>();
    @Autowired
    private UserMapper userMapper;

    @Override
    public User register(User user)
    {
        if (this.isExist(user.getNickName())) {
            return null;
        } else {
            user.setNickName(user.getNickName());
            userMapper.insert(user);
        }
        return null;
    }

    @Override
    public Boolean isExist(String nickName)
    {
        User user = userMapper.isExist(nickName);
        return !(user == null);
    }

    @Override
    public String login(String userName, String password)
    {
        User user = userMapper.login(userName, password);
        if (user != null) {
            String token = this.createToken(user);
            return token;
        }
        return null;
    }

    private String createToken(User user)
    {
        String token = UUID.randomUUID().toString();
        userCache.put(token, user);
        return  token;
    }

    @Override
    public Boolean logout(String token)
    {
        if (userCache.get(token) != null) {
            userCache.remove(token);
            return true;
        }
        return false;
    }
}
