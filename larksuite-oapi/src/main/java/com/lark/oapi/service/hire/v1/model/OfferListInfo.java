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

public class OfferListInfo {

  /**
   * Offer ID
   * <p> 示例值：7096320678581242123
   */
  @SerializedName("id")
  private String id;
  /**
   * Offer 职位
   * <p> 示例值：
   */
  @SerializedName("job_info")
  private OfferJobInfo jobInfo;
  /**
   * 创建时间
   * <p> 示例值：1628512038000
   */
  @SerializedName("create_time")
  private String createTime;
  /**
   * Offer 状态
   * <p> 示例值：0
   */
  @SerializedName("offer_status")
  private Integer offerStatus;
  /**
   * Offer 人员类型
   * <p> 示例值：
   */
  @SerializedName("employee_type")
  private BaseBilingualWithId employeeType;
  /**
   * Offer 投递 ID
   * <p> 示例值：7096358713330272526
   */
  @SerializedName("application_id")
  private String applicationId;

  // builder 开始
  public OfferListInfo() {
  }

  public OfferListInfo(Builder builder) {
    /**
     * Offer ID
     * <p> 示例值：7096320678581242123
     */
    this.id = builder.id;
    /**
     * Offer 职位
     * <p> 示例值：
     */
    this.jobInfo = builder.jobInfo;
    /**
     * 创建时间
     * <p> 示例值：1628512038000
     */
    this.createTime = builder.createTime;
    /**
     * Offer 状态
     * <p> 示例值：0
     */
    this.offerStatus = builder.offerStatus;
    /**
     * Offer 人员类型
     * <p> 示例值：
     */
    this.employeeType = builder.employeeType;
    /**
     * Offer 投递 ID
     * <p> 示例值：7096358713330272526
     */
    this.applicationId = builder.applicationId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OfferJobInfo getJobInfo() {
    return this.jobInfo;
  }

  public void setJobInfo(OfferJobInfo jobInfo) {
    this.jobInfo = jobInfo;
  }

  public String getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  public Integer getOfferStatus() {
    return this.offerStatus;
  }

  public void setOfferStatus(Integer offerStatus) {
    this.offerStatus = offerStatus;
  }

  public BaseBilingualWithId getEmployeeType() {
    return this.employeeType;
  }

  public void setEmployeeType(BaseBilingualWithId employeeType) {
    this.employeeType = employeeType;
  }

  public String getApplicationId() {
    return this.applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public static class Builder {

    /**
     * Offer ID
     * <p> 示例值：7096320678581242123
     */
    private String id;
    /**
     * Offer 职位
     * <p> 示例值：
     */
    private OfferJobInfo jobInfo;
    /**
     * 创建时间
     * <p> 示例值：1628512038000
     */
    private String createTime;
    /**
     * Offer 状态
     * <p> 示例值：0
     */
    private Integer offerStatus;
    /**
     * Offer 人员类型
     * <p> 示例值：
     */
    private BaseBilingualWithId employeeType;
    /**
     * Offer 投递 ID
     * <p> 示例值：7096358713330272526
     */
    private String applicationId;

    /**
     * Offer ID
     * <p> 示例值：7096320678581242123
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * Offer 职位
     * <p> 示例值：
     *
     * @param jobInfo
     * @return
     */
    public Builder jobInfo(OfferJobInfo jobInfo) {
      this.jobInfo = jobInfo;
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
     * Offer 状态
     * <p> 示例值：0
     *
     * @param offerStatus
     * @return
     */
    public Builder offerStatus(Integer offerStatus) {
      this.offerStatus = offerStatus;
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
     * Offer 投递 ID
     * <p> 示例值：7096358713330272526
     *
     * @param applicationId
     * @return
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }


    public OfferListInfo build() {
      return new OfferListInfo(this);
    }
  }
}
