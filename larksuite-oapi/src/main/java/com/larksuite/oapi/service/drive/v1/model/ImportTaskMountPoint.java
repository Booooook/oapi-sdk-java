// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive.v1.model;
import com.google.gson.annotations.SerializedName;

public class ImportTaskMountPoint {
    @SerializedName("mount_type")
    private Integer mountType;
    @SerializedName("mount_key")
    private String mountKey;

    public Integer getMountType() {
        return this.mountType;
    }

    public void setMountType(Integer mountType) {
        this.mountType = mountType;
    }

    public String getMountKey() {
        return this.mountKey;
    }

    public void setMountKey(String mountKey) {
        this.mountKey = mountKey;
    }

}