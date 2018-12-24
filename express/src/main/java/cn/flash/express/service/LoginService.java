package cn.flash.express.service;


import cn.flash.express.qo.LoginQo;
import cn.flash.express.vo.LoginVo;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:34
 */
public interface LoginService {
    LoginVo login(LoginQo loginQo) throws Exception;
}

