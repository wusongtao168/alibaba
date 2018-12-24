package cn.flash.express.dao;

import cn.flash.express.model.StaffAccount;
/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:31
 */
public interface StaffAccountDao {

    StaffAccount findByInfoId(Long staffInfoId);

}
