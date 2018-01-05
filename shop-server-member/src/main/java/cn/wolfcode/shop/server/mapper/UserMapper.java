package cn.wolfcode.shop.server.mapper;

import cn.wolfcode.shop.api.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    User isExist(@Param("nickName") String nickName);

    User login(@Param("userName") String userName, @Param("password") String password);
}