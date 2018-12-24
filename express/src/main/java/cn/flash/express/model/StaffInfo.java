package cn.flash.express.model;

import java.time.Instant;

/**
 * @author:Wusongtao
 * @Date:2018/12/22下午3:57
 * 员工基础信息表
 */
public class StaffInfo {
    private Long id;
    private String name;
    private String encryptedPassword;
    private String avatarPath;
    private String avatarBucket;
    private Instant createdAt;
    private Instant updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    public String getAvatarBucket() {
        return avatarBucket;
    }

    public void setAvatarBucket(String avatarBucket) {
        this.avatarBucket = avatarBucket;
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
