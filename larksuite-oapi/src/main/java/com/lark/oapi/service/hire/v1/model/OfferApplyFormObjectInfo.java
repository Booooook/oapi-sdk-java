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

public class OfferApplyFormObjectInfo {

  /**
   * 字段 ID
   * <p> 示例值：23847293234
   */
  @SerializedName("id")
  private String id;
  /**
   * 字段名称
   * <p> 示例值：
   */
  @SerializedName("name")
  private I18n name;
  /**
   * 字段描述
   * <p> 示例值：
   */
  @SerializedName("description")
  private I18n description;
  /**
   * 所属模块 ID
   * <p> 示例值：23847293234
   */
  @SerializedName("module_id")
  private String moduleId;
  /**
   * 是否为自定义字段
   * <p> 示例值：true
   */
  @SerializedName("is_customized")
  private Boolean isCustomized;
  /**
   * 是否必填
   * <p> 示例值：true
   */
  @SerializedName("is_required")
  private Boolean isRequired;
  /**
   * 是否启用
   * <p> 示例值：1
   */
  @SerializedName("active_status")
  private Integer activeStatus;
  /**
   * 是否修改后需审批
   * <p> 示例值：true
   */
  @SerializedName("need_approve")
  private Boolean needApprove;
  /**
   * 是否敏感
   * <p> 示例值：false
   */
  @SerializedName("is_sensitive")
  private Boolean isSensitive;
  /**
   * 字段类型枚举
   * <p> 示例值：1
   */
  @SerializedName("object_type")
  private Integer objectType;
  /**
   * 配置信息
   * <p> 示例值：
   */
  @SerializedName("config")
  private OfferApplyFormObjectConfigInfo config;

  // builder 开始
  public OfferApplyFormObjectInfo() {
  }

  public OfferApplyFormObjectInfo(Builder builder) {
    /**
     * 字段 ID
     * <p> 示例值：23847293234
     */
    this.id = builder.id;
    /**
     * 字段名称
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 字段描述
     * <p> 示例值：
     */
    this.description = builder.description;
    /**
     * 所属模块 ID
     * <p> 示例值：23847293234
     */
    this.moduleId = builder.moduleId;
    /**
     * 是否为自定义字段
     * <p> 示例值：true
     */
    this.isCustomized = builder.isCustomized;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    this.isRequired = builder.isRequired;
    /**
     * 是否启用
     * <p> 示例值：1
     */
    this.activeStatus = builder.activeStatus;
    /**
     * 是否修改后需审批
     * <p> 示例值：true
     */
    this.needApprove = builder.needApprove;
    /**
     * 是否敏感
     * <p> 示例值：false
     */
    this.isSensitive = builder.isSensitive;
    /**
     * 字段类型枚举
     * <p> 示例值：1
     */
    this.objectType = builder.objectType;
    /**
     * 配置信息
     * <p> 示例值：
     */
    this.config = builder.config;
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

  public I18n getDescription() {
    return this.description;
  }

  public void setDescription(I18n description) {
    this.description = description;
  }

  public String getModuleId() {
    return this.moduleId;
  }

  public void setModuleId(String moduleId) {
    this.moduleId = moduleId;
  }

  public Boolean getIsCustomized() {
    return this.isCustomized;
  }

  public void setIsCustomized(Boolean isCustomized) {
    this.isCustomized = isCustomized;
  }

  public Boolean getIsRequired() {
    return this.isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public Integer getActiveStatus() {
    return this.activeStatus;
  }

  public void setActiveStatus(Integer activeStatus) {
    this.activeStatus = activeStatus;
  }

  public Boolean getNeedApprove() {
    return this.needApprove;
  }

  public void setNeedApprove(Boolean needApprove) {
    this.needApprove = needApprove;
  }

  public Boolean getIsSensitive() {
    return this.isSensitive;
  }

  public void setIsSensitive(Boolean isSensitive) {
    this.isSensitive = isSensitive;
  }

  public Integer getObjectType() {
    return this.objectType;
  }

  public void setObjectType(Integer objectType) {
    this.objectType = objectType;
  }

  public OfferApplyFormObjectConfigInfo getConfig() {
    return this.config;
  }

  public void setConfig(OfferApplyFormObjectConfigInfo config) {
    this.config = config;
  }

  public static class Builder {

    /**
     * 字段 ID
     * <p> 示例值：23847293234
     */
    private String id;
    /**
     * 字段名称
     * <p> 示例值：
     */
    private I18n name;
    /**
     * 字段描述
     * <p> 示例值：
     */
    private I18n description;
    /**
     * 所属模块 ID
     * <p> 示例值：23847293234
     */
    private String moduleId;
    /**
     * 是否为自定义字段
     * <p> 示例值：true
     */
    private Boolean isCustomized;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    private Boolean isRequired;
    /**
     * 是否启用
     * <p> 示例值：1
     */
    private Integer activeStatus;
    /**
     * 是否修改后需审批
     * <p> 示例值：true
     */
    private Boolean needApprove;
    /**
     * 是否敏感
     * <p> 示例值：false
     */
    private Boolean isSensitive;
    /**
     * 字段类型枚举
     * <p> 示例值：1
     */
    private Integer objectType;
    /**
     * 配置信息
     * <p> 示例值：
     */
    private OfferApplyFormObjectConfigInfo config;

    /**
     * 字段 ID
     * <p> 示例值：23847293234
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 字段名称
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
     * 字段描述
     * <p> 示例值：
     *
     * @param description
     * @return
     */
    public Builder description(I18n description) {
      this.description = description;
      return this;
    }


    /**
     * 所属模块 ID
     * <p> 示例值：23847293234
     *
     * @param moduleId
     * @return
     */
    public Builder moduleId(String moduleId) {
      this.moduleId = moduleId;
      return this;
    }


    /**
     * 是否为自定义字段
     * <p> 示例值：true
     *
     * @param isCustomized
     * @return
     */
    public Builder isCustomized(Boolean isCustomized) {
      this.isCustomized = isCustomized;
      return this;
    }


    /**
     * 是否必填
     * <p> 示例值：true
     *
     * @param isRequired
     * @return
     */
    public Builder isRequired(Boolean isRequired) {
      this.isRequired = isRequired;
      return this;
    }


    /**
     * 是否启用
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
     * 是否修改后需审批
     * <p> 示例值：true
     *
     * @param needApprove
     * @return
     */
    public Builder needApprove(Boolean needApprove) {
      this.needApprove = needApprove;
      return this;
    }


    /**
     * 是否敏感
     * <p> 示例值：false
     *
     * @param isSensitive
     * @return
     */
    public Builder isSensitive(Boolean isSensitive) {
      this.isSensitive = isSensitive;
      return this;
    }


    /**
     * 字段类型枚举
     * <p> 示例值：1
     *
     * @param objectType
     * @return
     */
    public Builder objectType(Integer objectType) {
      this.objectType = objectType;
      return this;
    }


    /**
     * 配置信息
     * <p> 示例值：
     *
     * @param config
     * @return
     */
    public Builder config(OfferApplyFormObjectConfigInfo config) {
      this.config = config;
      return this;
    }


    public OfferApplyFormObjectInfo build() {
      return new OfferApplyFormObjectInfo(this);
    }
  }
}
