package cn.flash.express.qo;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:24
 */
public class LoginQo {
    /**
     * 快递员工号
     */
    private Integer staff_info_id;
    /**
     * 登录密码
     */
    private String encryptedPassword;
    /**
     * 客户端id (IMEI + IMSI)
     */
    private String clientid;
    /**
     * 客户端seed
     */
    private String clientsd;
    /**
     * android/ios
     */
    private String os;
    /**
     * 客户端版本
     */
    private String version;
    /**
     * 客户端本地TID
     */
    private String tid;
    /**
     * 客户端本地session
     */
    private String sessionid;
    /**
     * 登录ip
     */
    private String ip;


    public Integer getStaff_info_id() {
        return staff_info_id;
    }

    public void setStaff_info_id(Integer staff_info_id) {
        this.staff_info_id = staff_info_id;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
    }

    public String getClientsd() {
        return clientsd;
    }

    public void setClientsd(String clientsd) {
        this.clientsd = clientsd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
