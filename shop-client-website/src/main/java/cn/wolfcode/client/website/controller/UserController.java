package cn.wolfcode.client.website.controller;

import cn.wolfcode.shop.api.domain.User;
import cn.wolfcode.shop.api.service.IUserService;
import cn.wolfcode.shop.api.vo.JSONResultVo;
import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/users")
public class UserController
{
    @Reference
    private IUserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public JSONResultVo register(User user)
    {
        user = userService.register(user);
        JSONResultVo jsonResultVo = new JSONResultVo();
        jsonResultVo.setResult(user);
        if (user == null) {
            jsonResultVo.setErrorMsg("用户名已经被注册");
        }
        return jsonResultVo;
    }

    @RequestMapping(value = "logForUser", method = RequestMethod.POST)
    public JSONResultVo login(String username, String password)
    {
        JSONResultVo jsonResultVo = new JSONResultVo();
        String token = userService.login(username, password);
        jsonResultVo.setResult(token);
        if (token == null) {
            jsonResultVo.setErrorMsg("登录失败,账户或密码有误!");
        }
        return jsonResultVo;
    }

    @RequestMapping(value = "logForUser", method = RequestMethod.DELETE)
    public JSONResultVo logout(HttpServletRequest request)
    {
        JSONResultVo jsonResultVo = new JSONResultVo();
        String token = request.getHeader("token_in_header");
        if (token == null || !userService.logout(token)) {
            jsonResultVo.setSuccess(false);
            jsonResultVo.setErrorMsg("未登录");
        }
        return jsonResultVo;
    }
}
