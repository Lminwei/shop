package cn.wolfcode.shop.api.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JSONResultVo
{
    private Boolean success = true;
    private String errorMsg;
    private Object result;
}
