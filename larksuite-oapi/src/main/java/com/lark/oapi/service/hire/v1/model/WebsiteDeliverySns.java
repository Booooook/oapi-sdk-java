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

public class WebsiteDeliverySns {

  /**
   * 社交账号类型
   * <p> 示例值：1
   */
  @SerializedName("sns_type")
  private Integer snsType;
  /**
   * 自定义字段
   * <p> 示例值：
   */
  @SerializedName("customized_data")
  private WebsiteDeliveryCustomizedData[] customizedData;
  /**
   * 链接
   * <p> 示例值：toutiao.com
   */
  @SerializedName("link")
  private String link;

  // builder 开始
  public WebsiteDeliverySns() {
  }

  public WebsiteDeliverySns(Builder builder) {
    /**
     * 社交账号类型
     * <p> 示例值：1
     */
    this.snsType = builder.snsType;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    this.customizedData = builder.customizedData;
    /**
     * 链接
     * <p> 示例值：toutiao.com
     */
    this.link = builder.link;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Integer getSnsType() {
    return this.snsType;
  }

  public void setSnsType(Integer snsType) {
    this.snsType = snsType;
  }

  public WebsiteDeliveryCustomizedData[] getCustomizedData() {
    return this.customizedData;
  }

  public void setCustomizedData(WebsiteDeliveryCustomizedData[] customizedData) {
    this.customizedData = customizedData;
  }

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public static class Builder {

    /**
     * 社交账号类型
     * <p> 示例值：1
     */
    private Integer snsType;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    private WebsiteDeliveryCustomizedData[] customizedData;
    /**
     * 链接
     * <p> 示例值：toutiao.com
     */
    private String link;

    /**
     * 社交账号类型
     * <p> 示例值：1
     *
     * @param snsType
     * @return
     */
    public Builder snsType(Integer snsType) {
      this.snsType = snsType;
      return this;
    }


    /**
     * 自定义字段
     * <p> 示例值：
     *
     * @param customizedData
     * @return
     */
    public Builder customizedData(WebsiteDeliveryCustomizedData[] customizedData) {
      this.customizedData = customizedData;
      return this;
    }


    /**
     * 链接
     * <p> 示例值：toutiao.com
     *
     * @param link
     * @return
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }


    public WebsiteDeliverySns build() {
      return new WebsiteDeliverySns(this);
    }
  }
}
