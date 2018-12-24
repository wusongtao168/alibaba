package cn.flash.express.model;

import java.time.Instant;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:27
 * 员工登录账号表
 */
public class StaffAccount {
    private Integer id;
    private Long staff_info_id;
    private String serversd;
    private String clientsd;
    private String clientid;
    private String tid;
    private String sessionid;
    private Instant lasttime;
    private Instant currenttime;
    private String lastip;
    private String currentip;
    private String os;
    private String version;
    private Integer loginnum;
    private Instant createdAt;
    private Instant updatedAt;

    public StaffAccount() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getStaff_info_id() {
        return staff_info_id;
    }

    public void setStaff_info_id(Long staff_info_id) {
        this.staff_info_id = staff_info_id;
    }

    public String getServersd() {
        return serversd;
    }

    public void setServersd(String serversd) {
        this.serversd = serversd;
    }

    public String getClientsd() {
        return clientsd;
    }

    public void setClientsd(String clientsd) {
        this.clientsd = clientsd;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid;
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

    public Instant getLasttime() {
        return lasttime;
    }

    public void setLasttime(Instant lasttime) {
        this.lasttime = lasttime;
    }

    public Instant getCurrenttime() {
        return currenttime;
    }

    public void setCurrenttime(Instant currenttime) {
        this.currenttime = currenttime;
    }

    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
    }

    public String getCurrentip() {
        return currentip;
    }

    public void setCurrentip(String currentip) {
        this.currentip = currentip;
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

    public Integer getLoginnum() {
        return loginnum;
    }

    public void setLoginnum(Integer loginnum) {
        this.loginnum = loginnum;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}
