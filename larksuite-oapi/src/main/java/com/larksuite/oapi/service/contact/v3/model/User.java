// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.contact.v3.model;
import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("union_id")
    private String unionId;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("open_id")
    private String openId;
    @SerializedName("name")
    private String name;
    @SerializedName("en_name")
    private String enName;
    @SerializedName("email")
    private String email;
    @SerializedName("mobile")
    private String mobile;
    @SerializedName("mobile_visible")
    private Boolean mobileVisible;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("avatar_key")
    private String avatarKey;
    @SerializedName("avatar")
    private AvatarInfo avatar;
    @SerializedName("status")
    private UserStatus status;
    @SerializedName("department_ids")
    private String[] departmentIds;
    @SerializedName("leader_user_id")
    private String leaderUserId;
    @SerializedName("city")
    private String city;
    @SerializedName("country")
    private String country;
    @SerializedName("work_station")
    private String workStation;
    @SerializedName("join_time")
    private Integer joinTime;
    @SerializedName("is_tenant_manager")
    private Boolean isTenantManager;
    @SerializedName("employee_no")
    private String employeeNo;
    @SerializedName("employee_type")
    private Integer employeeType;
    @SerializedName("positions")
    private UserPosition[] positions;
    @SerializedName("orders")
    private UserOrder[] orders;
    @SerializedName("custom_attrs")
    private UserCustomAttr[] customAttrs;
    @SerializedName("enterprise_email")
    private String enterpriseEmail;
    @SerializedName("idp_type")
    private String idpType;
    @SerializedName("time_zone")
    private String timeZone;
    @SerializedName("description")
    private String description;

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getMobileVisible() {
        return this.mobileVisible;
    }

    public void setMobileVisible(Boolean mobileVisible) {
        this.mobileVisible = mobileVisible;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public void setAvatarKey(String avatarKey) {
        this.avatarKey = avatarKey;
    }

    public AvatarInfo getAvatar() {
        return this.avatar;
    }

    public void setAvatar(AvatarInfo avatar) {
        this.avatar = avatar;
    }

    public UserStatus getStatus() {
        return this.status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String[] getDepartmentIds() {
        return this.departmentIds;
    }

    public void setDepartmentIds(String[] departmentIds) {
        this.departmentIds = departmentIds;
    }

    public String getLeaderUserId() {
        return this.leaderUserId;
    }

    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWorkStation() {
        return this.workStation;
    }

    public void setWorkStation(String workStation) {
        this.workStation = workStation;
    }

    public Integer getJoinTime() {
        return this.joinTime;
    }

    public void setJoinTime(Integer joinTime) {
        this.joinTime = joinTime;
    }

    public Boolean getIsTenantManager() {
        return this.isTenantManager;
    }

    public void setIsTenantManager(Boolean isTenantManager) {
        this.isTenantManager = isTenantManager;
    }

    public String getEmployeeNo() {
        return this.employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public Integer getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
    }

    public UserPosition[] getPositions() {
        return this.positions;
    }

    public void setPositions(UserPosition[] positions) {
        this.positions = positions;
    }

    public UserOrder[] getOrders() {
        return this.orders;
    }

    public void setOrders(UserOrder[] orders) {
        this.orders = orders;
    }

    public UserCustomAttr[] getCustomAttrs() {
        return this.customAttrs;
    }

    public void setCustomAttrs(UserCustomAttr[] customAttrs) {
        this.customAttrs = customAttrs;
    }

    public String getEnterpriseEmail() {
        return this.enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    public String getIdpType() {
        return this.idpType;
    }

    public void setIdpType(String idpType) {
        this.idpType = idpType;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
