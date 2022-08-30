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

public class OfferInfo {

  /**
   * Offer ID
   * <p> 示例值：7016605170635213100
   */
  @SerializedName("offer_id")
  private String offerId;
  /**
   * 投递 ID
   * <p> 示例值：7013552389293279532
   */
  @SerializedName("application_id")
  private String applicationId;
  /**
   * Offer 申请表模板 ID，用于描述申请表单结构的元数据定义，即对申请表内容的描述。用户每一次更改 Offer 申请表模板信息，都会生成新的 schema_id，创建 Offer
   * 时应传入最新的 schema_id，可从「获取Offer申请表模板信息」接口中获取
   * <p> 示例值：7013318077945596204
   */
  @SerializedName("schema_id")
  private String schemaId;
  /**
   * Offer 基本信息
   * <p> 示例值：
   */
  @SerializedName("basic_info")
  private OfferBasicInfo basicInfo;
  /**
   * Offer 薪资信息
   * <p> 示例值：
   */
  @SerializedName("salary_info")
  private OfferSalaryInfo salaryInfo;
  /**
   * 自定义信息
   * <p> 示例值：
   */
  @SerializedName("customized_info_list")
  private OfferCustomizedInfo[] customizedInfoList;

  // builder 开始
  public OfferInfo() {
  }

  public OfferInfo(Builder builder) {
    /**
     * Offer ID
     * <p> 示例值：7016605170635213100
     */
    this.offerId = builder.offerId;
    /**
     * 投递 ID
     * <p> 示例值：7013552389293279532
     */
    this.applicationId = builder.applicationId;
    /**
     * Offer 申请表模板 ID，用于描述申请表单结构的元数据定义，即对申请表内容的描述。用户每一次更改 Offer 申请表模板信息，都会生成新的 schema_id，创建 Offer 时应传入最新的 schema_id，可从「获取Offer申请表模板信息」接口中获取
     * <p> 示例值：7013318077945596204
     */
    this.schemaId = builder.schemaId;
    /**
     * Offer 基本信息
     * <p> 示例值：
     */
    this.basicInfo = builder.basicInfo;
    /**
     * Offer 薪资信息
     * <p> 示例值：
     */
    this.salaryInfo = builder.salaryInfo;
    /**
     * 自定义信息
     * <p> 示例值：
     */
    this.customizedInfoList = builder.customizedInfoList;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getOfferId() {
    return this.offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public String getApplicationId() {
    return this.applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public String getSchemaId() {
    return this.schemaId;
  }

  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }

  public OfferBasicInfo getBasicInfo() {
    return this.basicInfo;
  }

  public void setBasicInfo(OfferBasicInfo basicInfo) {
    this.basicInfo = basicInfo;
  }

  public OfferSalaryInfo getSalaryInfo() {
    return this.salaryInfo;
  }

  public void setSalaryInfo(OfferSalaryInfo salaryInfo) {
    this.salaryInfo = salaryInfo;
  }

  public OfferCustomizedInfo[] getCustomizedInfoList() {
    return this.customizedInfoList;
  }

  public void setCustomizedInfoList(OfferCustomizedInfo[] customizedInfoList) {
    this.customizedInfoList = customizedInfoList;
  }

  public static class Builder {

    /**
     * Offer ID
     * <p> 示例值：7016605170635213100
     */
    private String offerId;
    /**
     * 投递 ID
     * <p> 示例值：7013552389293279532
     */
    private String applicationId;
    /**
     * Offer 申请表模板 ID，用于描述申请表单结构的元数据定义，即对申请表内容的描述。用户每一次更改 Offer 申请表模板信息，都会生成新的 schema_id，创建 Offer
     * 时应传入最新的 schema_id，可从「获取Offer申请表模板信息」接口中获取
     * <p> 示例值：7013318077945596204
     */
    private String schemaId;
    /**
     * Offer 基本信息
     * <p> 示例值：
     */
    private OfferBasicInfo basicInfo;
    /**
     * Offer 薪资信息
     * <p> 示例值：
     */
    private OfferSalaryInfo salaryInfo;
    /**
     * 自定义信息
     * <p> 示例值：
     */
    private OfferCustomizedInfo[] customizedInfoList;

    /**
     * Offer ID
     * <p> 示例值：7016605170635213100
     *
     * @param offerId
     * @return
     */
    public Builder offerId(String offerId) {
      this.offerId = offerId;
      return this;
    }


    /**
     * 投递 ID
     * <p> 示例值：7013552389293279532
     *
     * @param applicationId
     * @return
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }


    /**
     * Offer 申请表模板 ID，用于描述申请表单结构的元数据定义，即对申请表内容的描述。用户每一次更改 Offer 申请表模板信息，都会生成新的 schema_id，创建 Offer
     * 时应传入最新的 schema_id，可从「获取Offer申请表模板信息」接口中获取
     * <p> 示例值：7013318077945596204
     *
     * @param schemaId
     * @return
     */
    public Builder schemaId(String schemaId) {
      this.schemaId = schemaId;
      return this;
    }


    /**
     * Offer 基本信息
     * <p> 示例值：
     *
     * @param basicInfo
     * @return
     */
    public Builder basicInfo(OfferBasicInfo basicInfo) {
      this.basicInfo = basicInfo;
      return this;
    }


    /**
     * Offer 薪资信息
     * <p> 示例值：
     *
     * @param salaryInfo
     * @return
     */
    public Builder salaryInfo(OfferSalaryInfo salaryInfo) {
      this.salaryInfo = salaryInfo;
      return this;
    }


    /**
     * 自定义信息
     * <p> 示例值：
     *
     * @param customizedInfoList
     * @return
     */
    public Builder customizedInfoList(OfferCustomizedInfo[] customizedInfoList) {
      this.customizedInfoList = customizedInfoList;
      return this;
    }


    public OfferInfo build() {
      return new OfferInfo(this);
    }
  }
}
