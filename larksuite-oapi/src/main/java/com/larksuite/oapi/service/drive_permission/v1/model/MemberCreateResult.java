// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.drive_permission.v1.model;
import com.google.gson.annotations.SerializedName;

public class MemberCreateResult {
    @SerializedName("is_all_success")
    private Boolean isAllSuccess;
    @SerializedName("fail_members")
    private Member[] failMembers;

    public Boolean getIsAllSuccess() {
        return this.isAllSuccess;
    }

    public void setIsAllSuccess(Boolean isAllSuccess) {
        this.isAllSuccess = isAllSuccess;
    }

    public Member[] getFailMembers() {
        return this.failMembers;
    }

    public void setFailMembers(Member[] failMembers) {
        this.failMembers = failMembers;
    }

}