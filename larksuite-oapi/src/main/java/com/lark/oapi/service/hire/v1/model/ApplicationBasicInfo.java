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

public class ApplicationBasicInfo {

  /**
   * 阶段信息
   * <p> 示例值：
   */
  @SerializedName("stage")
  private ApplicationStage stage;
  /**
   * 内推人信息
   * <p> 示例值：
   */
  @SerializedName("referral")
  private ApplicationReferral referral;
  /**
   * 状态
   * <p> 示例值：
   */
  @SerializedName("active_status")
  private Integer activeStatus;
  /**
   * 创建时间
   * <p> 示例值：
   */
  @SerializedName("biz_create_time")
  private Integer bizCreateTime;
  /**
   * 修改时间
   * <p> 示例值：
   */
  @SerializedName("biz_modify_time")
  private Integer bizModifyTime;

  // builder 开始
  public ApplicationBasicInfo() {
  }

  public ApplicationBasicInfo(Builder builder) {
    /**
     * 阶段信息
     * <p> 示例值：
     */
    this.stage = builder.stage;
    /**
     * 内推人信息
     * <p> 示例值：
     */
    this.referral = builder.referral;
    /**
     * 状态
     * <p> 示例值：
     */
    this.activeStatus = builder.activeStatus;
    /**
     * 创建时间
     * <p> 示例值：
     */
    this.bizCreateTime = builder.bizCreateTime;
    /**
     * 修改时间
     * <p> 示例值：
     */
    this.bizModifyTime = builder.bizModifyTime;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public ApplicationStage getStage() {
    return this.stage;
  }

  public void setStage(ApplicationStage stage) {
    this.stage = stage;
  }

  public ApplicationReferral getReferral() {
    return this.referral;
  }

  public void setReferral(ApplicationReferral referral) {
    this.referral = referral;
  }

  public Integer getActiveStatus() {
    return this.activeStatus;
  }

  public void setActiveStatus(Integer activeStatus) {
    this.activeStatus = activeStatus;
  }

  public Integer getBizCreateTime() {
    return this.bizCreateTime;
  }

  public void setBizCreateTime(Integer bizCreateTime) {
    this.bizCreateTime = bizCreateTime;
  }

  public Integer getBizModifyTime() {
    return this.bizModifyTime;
  }

  public void setBizModifyTime(Integer bizModifyTime) {
    this.bizModifyTime = bizModifyTime;
  }

  public static class Builder {

    /**
     * 阶段信息
     * <p> 示例值：
     */
    private ApplicationStage stage;
    /**
     * 内推人信息
     * <p> 示例值：
     */
    private ApplicationReferral referral;
    /**
     * 状态
     * <p> 示例值：
     */
    private Integer activeStatus;
    /**
     * 创建时间
     * <p> 示例值：
     */
    private Integer bizCreateTime;
    /**
     * 修改时间
     * <p> 示例值：
     */
    private Integer bizModifyTime;

    /**
     * 阶段信息
     * <p> 示例值：
     *
     * @param stage
     * @return
     */
    public Builder stage(ApplicationStage stage) {
      this.stage = stage;
      return this;
    }


    /**
     * 内推人信息
     * <p> 示例值：
     *
     * @param referral
     * @return
     */
    public Builder referral(ApplicationReferral referral) {
      this.referral = referral;
      return this;
    }


    /**
     * 状态
     * <p> 示例值：
     *
     * @param activeStatus
     * @return
     */
    public Builder activeStatus(Integer activeStatus) {
      this.activeStatus = activeStatus;
      return this;
    }


    /**
     * 创建时间
     * <p> 示例值：
     *
     * @param bizCreateTime
     * @return
     */
    public Builder bizCreateTime(Integer bizCreateTime) {
      this.bizCreateTime = bizCreateTime;
      return this;
    }


    /**
     * 修改时间
     * <p> 示例值：
     *
     * @param bizModifyTime
     * @return
     */
    public Builder bizModifyTime(Integer bizModifyTime) {
      this.bizModifyTime = bizModifyTime;
      return this;
    }


    public ApplicationBasicInfo build() {
      return new ApplicationBasicInfo(this);
    }
  }
}
