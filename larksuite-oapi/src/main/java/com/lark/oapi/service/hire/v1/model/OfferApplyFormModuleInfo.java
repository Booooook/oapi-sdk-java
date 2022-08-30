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

public class OfferApplyFormModuleInfo {

  /**
   * 模块 ID
   * <p> 示例值：23746823748
   */
  @SerializedName("id")
  private String id;
  /**
   * 模块名称
   * <p> 示例值：
   */
  @SerializedName("name")
  private I18n name;
  /**
   * 是否为自定义模块
   * <p> 示例值：false
   */
  @SerializedName("is_customized")
  private Boolean isCustomized;
  /**
   * 模块状态是否启用
   * <p> 示例值：1
   */
  @SerializedName("active_status")
  private Integer activeStatus;
  /**
   * 模块填写提示
   * <p> 示例值：
   */
  @SerializedName("hint")
  private I18n hint;
  /**
   * 字段列表
   * <p> 示例值：
   */
  @SerializedName("object_list")
  private OfferApplyFormObjectInfo[] objectList;

  // builder 开始
  public OfferApplyFormModuleInfo() {
  }

  public OfferApplyFormModuleInfo(Builder builder) {
    /**
     * 模块 ID
     * <p> 示例值：23746823748
     */
    this.id = builder.id;
    /**
     * 模块名称
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 是否为自定义模块
     * <p> 示例值：false
     */
    this.isCustomized = builder.isCustomized;
    /**
     * 模块状态是否启用
     * <p> 示例值：1
     */
    this.activeStatus = builder.activeStatus;
    /**
     * 模块填写提示
     * <p> 示例值：
     */
    this.hint = builder.hint;
    /**
     * 字段列表
     * <p> 示例值：
     */
    this.objectList = builder.objectList;
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

  public I18n getName() {
    return this.name;
  }

  public void setName(I18n name) {
    this.name = name;
  }

  public Boolean getIsCustomized() {
    return this.isCustomized;
  }

  public void setIsCustomized(Boolean isCustomized) {
    this.isCustomized = isCustomized;
  }

  public Integer getActiveStatus() {
    return this.activeStatus;
  }

  public void setActiveStatus(Integer activeStatus) {
    this.activeStatus = activeStatus;
  }

  public I18n getHint() {
    return this.hint;
  }

  public void setHint(I18n hint) {
    this.hint = hint;
  }

  public OfferApplyFormObjectInfo[] getObjectList() {
    return this.objectList;
  }

  public void setObjectList(OfferApplyFormObjectInfo[] objectList) {
    this.objectList = objectList;
  }

  public static class Builder {

    /**
     * 模块 ID
     * <p> 示例值：23746823748
     */
    private String id;
    /**
     * 模块名称
     * <p> 示例值：
     */
    private I18n name;
    /**
     * 是否为自定义模块
     * <p> 示例值：false
     */
    private Boolean isCustomized;
    /**
     * 模块状态是否启用
     * <p> 示例值：1
     */
    private Integer activeStatus;
    /**
     * 模块填写提示
     * <p> 示例值：
     */
    private I18n hint;
    /**
     * 字段列表
     * <p> 示例值：
     */
    private OfferApplyFormObjectInfo[] objectList;

    /**
     * 模块 ID
     * <p> 示例值：23746823748
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 模块名称
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(I18n name) {
      this.name = name;
      return this;
    }


    /**
     * 是否为自定义模块
     * <p> 示例值：false
     *
     * @param isCustomized
     * @return
     */
    public Builder isCustomized(Boolean isCustomized) {
      this.isCustomized = isCustomized;
      return this;
    }


    /**
     * 模块状态是否启用
     * <p> 示例值：1
     *
     * @param activeStatus
     * @return
     */
    public Builder activeStatus(Integer activeStatus) {
      this.activeStatus = activeStatus;
      return this;
    }


    /**
     * 模块填写提示
     * <p> 示例值：
     *
     * @param hint
     * @return
     */
    public Builder hint(I18n hint) {
      this.hint = hint;
      return this;
    }


    /**
     * 字段列表
     * <p> 示例值：
     *
     * @param objectList
     * @return
     */
    public Builder objectList(OfferApplyFormObjectInfo[] objectList) {
      this.objectList = objectList;
      return this;
    }


    public OfferApplyFormModuleInfo build() {
      return new OfferApplyFormModuleInfo(this);
    }
  }
}