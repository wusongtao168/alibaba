package cn.flash.express.service.impl;

import cn.flash.express.dao.StaffAccountDao;
import cn.flash.express.dao.StaffInfoDao;
import cn.flash.express.model.StaffAccount;
import cn.flash.express.model.StaffInfo;
import cn.flash.express.qo.LoginQo;
import cn.flash.express.service.LoginService;
import cn.flash.express.util.DateUtils;
import cn.flash.express.util.MD5Tools;
import cn.flash.express.vo.LoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import java.time.Instant;
import java.util.Date;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:35
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private StaffInfoDao staffInfoDao;
    @Autowired
    private StaffAccountDao staffAccountDao;

    @Override
    public LoginVo login(LoginQo loginQo) throws Exception {
        //检查版本信息
        String version = checkVersion(loginQo.getVersion(), loginQo.getOs());
        if (StringUtils.isEmpty(version)) {
            version = "";
        }
        StaffInfo staffInfo = staffInfoDao.find(loginQo.getStaff_info_id());
        if (staffInfo == null) {
            throw new Exception("用户不存在");
        }
        if (!loginQo.getEncryptedPassword().equals(staffInfo.getEncryptedPassword())) {
            throw new Exception("密码错误");
        }
        StaffAccount oldStaffAccount = staffAccountDao.findByInfoId(staffInfo.getId());
        //重新生成sessionsd sessionid
        Instant sessionSd = Instant.now();
        //生成tid
        String tid = generateTID(loginQo.getClientid(), loginQo.getClientsd(), sessionSd);
        //生成session
        String session = generateSeesionID(staffInfo.getId().toString());
        //获取登录次数
        Integer loginnum = oldStaffAccount.getLoginnum();
        StaffAccount staffAccount = new StaffAccount();
        staffAccount.setStaff_info_id(staffInfo.getId());
        staffAccount.setServersd(sessionSd.toString());
        staffAccount.setSessionid(session);
        staffAccount.setClientid(loginQo.getClientid());
        staffAccount.setClientsd(loginQo.getClientsd());
        staffAccount.setTid(tid);
        staffAccount.setLasttime(oldStaffAccount.getLasttime());
        staffAccount.setCurrenttime(oldStaffAccount.getCurrenttime());
        staffAccount.setLoginnum(loginnum++);
        staffAccount.setOs(loginQo.getOs());
        staffAccount.setVersion(version);
        staffAccount.setLastip(oldStaffAccount.getLastip());
        staffAccount.setCurrentip(oldStaffAccount.getCurrentip());
        return null;
    }

    /**
     * 生成sessionid
     */
    private String generateSeesionID(String userId) {
        StringBuffer buffer = new StringBuffer("");
        Date time = DateUtils.getDateAfter(new Date(), 100);
        String md5 = MD5Tools.MD5(buffer.append(time.getTime())
                .append(userId).toString());
        buffer.setLength(0);
        return buffer.append(time.getTime())
                .append(StringUtils.substring())
                .append("_")
                .append(userId).toString();
    }

    /**
     * 生成tid
     */
    private String generateTID(String clientId, String clientSd, Instant time) {
        StringBuffer buffer = new StringBuffer("");
        StringBuffer append = buffer.append(clientId)
                .append(clientSd)
                .append(time.getEpochSecond());
        return MD5Tools.MD5(append.toString());
    }

    /**
     * 检查版本
     *
     * @param version
     * @param os
     * @return
     */
    private String checkVersion(String version, String os) {
        return null;
    }
}
