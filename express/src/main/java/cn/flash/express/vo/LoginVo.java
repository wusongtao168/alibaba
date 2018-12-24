package cn.flash.express.vo;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:07
 */
public class LoginVo {
    private String staff_info_id;
    private String staff_info_name;
    private String avatar_path;
    private String sessionid;
    private String tid;

    public String getStaff_info_id() {
        return staff_info_id;
    }

    public void setStaff_info_id(String staff_info_id) {
        this.staff_info_id = staff_info_id;
    }

    public String getStaff_info_name() {
        return staff_info_name;
    }

    public void setStaff_info_name(String staff_info_name) {
        this.staff_info_name = staff_info_name;
    }

    public String getAvatar_path() {
        return avatar_path;
    }

    public void setAvatar_path(String avatar_path) {
        this.avatar_path = avatar_path;
    }

    public String getSessionid() {
        return sessionid;
    }

    public void setSessionid(String sessionid) {
        this.sessionid = sessionid;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
