// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class ApplicationOfferBasicInfo {

  /**
   * Offer 类型
   * <p> 示例值：1
   */
  @SerializedName("offer_type")
  private Integer offerType;
  /**
   * 备注
   * <p> 示例值：10
   */
  @SerializedName("remark")
  private String remark;
  /**
   * Offer 过期时间
   * <p> 示例值：1653383498000
   */
  @SerializedName("expire_time")
  private Integer expireTime;
  /**
   * Offer 负责人 ID
   * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
   */
  @SerializedName("owner_user_id")
  private String ownerUserId;
  /**
   * Offer 创建人 ID
   * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
   */
  @SerializedName("creator_user_id")
  private String creatorUserId;
  /**
   * Offer 人员类型
   * <p> 示例值：
   */
  @SerializedName("employee_type")
  private BaseBilingualWithId employeeType;
  /**
   * 创建时间
   * <p> 示例值：1628512038000
   */
  @SerializedName("create_time")
  private String createTime;
  /**
   * 直属上级 ID
   * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
   */
  @SerializedName("leader_user_id")
  private String leaderUserId;
  /**
   * 入职日期
   * <p> 示例值：2021-05-20
   */
  @SerializedName("onboard_date")
  private String onboardDate;
  /**
   * 入职部门
   * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
   */
  @SerializedName("department_id")
  private String departmentId;
  /**
   * 试用期, 比如试用期6个月
   * <p> 示例值：1
   */
  @SerializedName("probation_month")
  private Integer probationMonth;
  /**
   * 合同期, 比如3年
   * <p> 示例值：3
   */
  @SerializedName("contract_year")
  private Integer contractYear;
  /**
   * 雇员类型
   * <p> 示例值：
   */
  @SerializedName("recruitment_type")
  private BaseBilingualWithId recruitmentType;
  /**
   * 序列
   * <p> 示例值：
   */
  @SerializedName("sequence")
  private BaseBilingualWithId sequence;
  /**
   * 级别
   * <p> 示例值：
   */
  @SerializedName("level")
  private BaseBilingualWithId level;
  /**
   * 入职地点
   * <p> 示例值：
   */
  @SerializedName("onboard_address")
  private BaseAddress onboardAddress;
  /**
   * 工作地点
   * <p> 示例值：
   */
  @SerializedName("work_address")
  private BaseAddress workAddress;
  /**
   * 自定义字段信息
   * <p> 示例值：
   */
  @SerializedName("customize_info_list")
  private ApplicationOfferCustomValue[] customizeInfoList;

  // builder 开始
  public ApplicationOfferBasicInfo() {
  }

  public ApplicationOfferBasicInfo(Builder builder) {
    /**
     * Offer 类型
     * <p> 示例值：1
     */
    this.offerType = builder.offerType;
    /**
     * 备注
     * <p> 示例值：10
     */
    this.remark = builder.remark;
    /**
     * Offer 过期时间
     * <p> 示例值：1653383498000
     */
    this.expireTime = builder.expireTime;
    /**
     * Offer 负责人 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     */
    this.ownerUserId = builder.ownerUserId;
    /**
     * Offer 创建人 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     */
    this.creatorUserId = builder.creatorUserId;
    /**
     * Offer 人员类型
     * <p> 示例值：
     */
    this.employeeType = builder.employeeType;
    /**
     * 创建时间
     * <p> 示例值：1628512038000
     */
    this.createTime = builder.createTime;
    /**
     * 直属上级 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     */
    this.leaderUserId = builder.leaderUserId;
    /**
     * 入职日期
     * <p> 示例值：2021-05-20
     */
    this.onboardDate = builder.onboardDate;
    /**
     * 入职部门
     * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
     */
    this.departmentId = builder.departmentId;
    /**
     * 试用期, 比如试用期6个月
     * <p> 示例值：1
     */
    this.probationMonth = builder.probationMonth;
    /**
     * 合同期, 比如3年
     * <p> 示例值：3
     */
    this.contractYear = builder.contractYear;
    /**
     * 雇员类型
     * <p> 示例值：
     */
    this.recruitmentType = builder.recruitmentType;
    /**
     * 序列
     * <p> 示例值：
     */
    this.sequence = builder.sequence;
    /**
     * 级别
     * <p> 示例值：
     */
    this.level = builder.level;
    /**
     * 入职地点
     * <p> 示例值：
     */
    this.onboardAddress = builder.onboardAddress;
    /**
     * 工作地点
     * <p> 示例值：
     */
    this.workAddress = builder.workAddress;
    /**
     * 自定义字段信息
     * <p> 示例值：
     */
    this.customizeInfoList = builder.customizeInfoList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getOfferType() {
    return this.offerType;
  }

  public void setOfferType(Integer offerType) {
    this.offerType = offerType;
  }

  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public Integer getExpireTime() {
    return this.expireTime;
  }

  public void setExpireTime(Integer expireTime) {
    this.expireTime = expireTime;
  }

  public String getOwnerUserId() {
    return this.ownerUserId;
  }

  public void setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
  }

  public String getCreatorUserId() {
    return this.creatorUserId;
  }

  public void setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
  }

  public BaseBilingualWithId getEmployeeType() {
    return this.employeeType;
  }

  public void setEmployeeType(BaseBilingualWithId employeeType) {
    this.employeeType = employeeType;
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public String getLeaderUserId() {
    return this.leaderUserId;
  }

  public void setLeaderUserId(String leaderUserId) {
    this.leaderUserId = leaderUserId;
  }

  public String getOnboardDate() {
    return this.onboardDate;
  }

  public void setOnboardDate(String onboardDate) {
    this.onboardDate = onboardDate;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public Integer getProbationMonth() {
    return this.probationMonth;
  }

  public void setProbationMonth(Integer probationMonth) {
    this.probationMonth = probationMonth;
  }

  public Integer getContractYear() {
    return this.contractYear;
  }

  public void setContractYear(Integer contractYear) {
    this.contractYear = contractYear;
  }

  public BaseBilingualWithId getRecruitmentType() {
    return this.recruitmentType;
  }

  public void setRecruitmentType(BaseBilingualWithId recruitmentType) {
    this.recruitmentType = recruitmentType;
  }

  public BaseBilingualWithId getSequence() {
    return this.sequence;
  }

  public void setSequence(BaseBilingualWithId sequence) {
    this.sequence = sequence;
  }

  public BaseBilingualWithId getLevel() {
    return this.level;
  }

  public void setLevel(BaseBilingualWithId level) {
    this.level = level;
  }

  public BaseAddress getOnboardAddress() {
    return this.onboardAddress;
  }

  public void setOnboardAddress(BaseAddress onboardAddress) {
    this.onboardAddress = onboardAddress;
  }

  public BaseAddress getWorkAddress() {
    return this.workAddress;
  }

  public void setWorkAddress(BaseAddress workAddress) {
    this.workAddress = workAddress;
  }

  public ApplicationOfferCustomValue[] getCustomizeInfoList() {
    return this.customizeInfoList;
  }

  public void setCustomizeInfoList(ApplicationOfferCustomValue[] customizeInfoList) {
    this.customizeInfoList = customizeInfoList;
  }

  public static class Builder {

    /**
     * Offer 类型
     * <p> 示例值：1
     */
    private Integer offerType;
    /**
     * 备注
     * <p> 示例值：10
     */
    private String remark;
    /**
     * Offer 过期时间
     * <p> 示例值：1653383498000
     */
    private Integer expireTime;
    /**
     * Offer 负责人 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     */
    private String ownerUserId;
    /**
     * Offer 创建人 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     */
    private String creatorUserId;
    /**
     * Offer 人员类型
     * <p> 示例值：
     */
    private BaseBilingualWithId employeeType;
    /**
     * 创建时间
     * <p> 示例值：1628512038000
     */
    private String createTime;
    /**
     * 直属上级 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     */
    private String leaderUserId;
    /**
     * 入职日期
     * <p> 示例值：2021-05-20
     */
    private String onboardDate;
    /**
     * 入职部门
     * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
     */
    private String departmentId;
    /**
     * 试用期, 比如试用期6个月
     * <p> 示例值：1
     */
    private Integer probationMonth;
    /**
     * 合同期, 比如3年
     * <p> 示例值：3
     */
    private Integer contractYear;
    /**
     * 雇员类型
     * <p> 示例值：
     */
    private BaseBilingualWithId recruitmentType;
    /**
     * 序列
     * <p> 示例值：
     */
    private BaseBilingualWithId sequence;
    /**
     * 级别
     * <p> 示例值：
     */
    private BaseBilingualWithId level;
    /**
     * 入职地点
     * <p> 示例值：
     */
    private BaseAddress onboardAddress;
    /**
     * 工作地点
     * <p> 示例值：
     */
    private BaseAddress workAddress;
    /**
     * 自定义字段信息
     * <p> 示例值：
     */
    private ApplicationOfferCustomValue[] customizeInfoList;

    /**
     * Offer 类型
     * <p> 示例值：1
     *
     * @param offerType
     * @return
     */
    public Builder offerType(Integer offerType) {
      this.offerType = offerType;
      return this;
    }


    /**
     * 备注
     * <p> 示例值：10
     *
     * @param remark
     * @return
     */
    public Builder remark(String remark) {
      this.remark = remark;
      return this;
    }


    /**
     * Offer 过期时间
     * <p> 示例值：1653383498000
     *
     * @param expireTime
     * @return
     */
    public Builder expireTime(Integer expireTime) {
      this.expireTime = expireTime;
      return this;
    }


    /**
     * Offer 负责人 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     *
     * @param ownerUserId
     * @return
     */
    public Builder ownerUserId(String ownerUserId) {
      this.ownerUserId = ownerUserId;
      return this;
    }


    /**
     * Offer 创建人 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     *
     * @param creatorUserId
     * @return
     */
    public Builder creatorUserId(String creatorUserId) {
      this.creatorUserId = creatorUserId;
      return this;
    }


    /**
     * Offer 人员类型
     * <p> 示例值：
     *
     * @param employeeType
     * @return
     */
    public Builder employeeType(BaseBilingualWithId employeeType) {
      this.employeeType = employeeType;
      return this;
    }


    /**
     * 创建时间
     * <p> 示例值：1628512038000
     *
     * @param createTime
     * @return
     */
    public Builder createTime(String createTime) {
      this.createTime = createTime;
      return this;
    }


    /**
     * 直属上级 ID
     * <p> 示例值：ou_99be8e24ad1ad390b6cd3b8916940df1
     *
     * @param leaderUserId
     * @return
     */
    public Builder leaderUserId(String leaderUserId) {
      this.leaderUserId = leaderUserId;
      return this;
    }


    /**
     * 入职日期
     * <p> 示例值：2021-05-20
     *
     * @param onboardDate
     * @return
     */
    public Builder onboardDate(String onboardDate) {
      this.onboardDate = onboardDate;
      return this;
    }


    /**
     * 入职部门
     * <p> 示例值：od-6b394871807047c7023ebfc1ff37cd3a
     *
     * @param departmentId
     * @return
     */
    public Builder departmentId(String departmentId) {
      this.departmentId = departmentId;
      return this;
    }


    /**
     * 试用期, 比如试用期6个月
     * <p> 示例值：1
     *
     * @param probationMonth
     * @return
     */
    public Builder probationMonth(Integer probationMonth) {
      this.probationMonth = probationMonth;
      return this;
    }


    /**
     * 合同期, 比如3年
     * <p> 示例值：3
     *
     * @param contractYear
     * @return
     */
    public Builder contractYear(Integer contractYear) {
      this.contractYear = contractYear;
      return this;
    }


    /**
     * 雇员类型
     * <p> 示例值：
     *
     * @param recruitmentType
     * @return
     */
    public Builder recruitmentType(BaseBilingualWithId recruitmentType) {
      this.recruitmentType = recruitmentType;
      return this;
    }


    /**
     * 序列
     * <p> 示例值：
     *
     * @param sequence
     * @return
     */
    public Builder sequence(BaseBilingualWithId sequence) {
      this.sequence = sequence;
      return this;
    }


    /**
     * 级别
     * <p> 示例值：
     *
     * @param level
     * @return
     */
    public Builder level(BaseBilingualWithId level) {
      this.level = level;
      return this;
    }


    /**
     * 入职地点
     * <p> 示例值：
     *
     * @param onboardAddress
     * @return
     */
    public Builder onboardAddress(BaseAddress onboardAddress) {
      this.onboardAddress = onboardAddress;
      return this;
    }


    /**
     * 工作地点
     * <p> 示例值：
     *
     * @param workAddress
     * @return
     */
    public Builder workAddress(BaseAddress workAddress) {
      this.workAddress = workAddress;
      return this;
    }


    /**
     * 自定义字段信息
     * <p> 示例值：
     *
     * @param customizeInfoList
     * @return
     */
    public Builder customizeInfoList(ApplicationOfferCustomValue[] customizeInfoList) {
      this.customizeInfoList = customizeInfoList;
      return this;
    }


    public ApplicationOfferBasicInfo build() {
      return new ApplicationOfferBasicInfo(this);
    }
  }
}
