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

public class OfferSchemaDetail {

  /**
   * 字段ID
   * <p> 示例值：1213213123123
   */
  @SerializedName("id")
  private String id;
  /**
   * 字段名称
   * <p> 示例值：
   */
  @SerializedName("name")
  private OfferSchemaName name;
  /**
   * 字段类型, text=单行文本, long_text=多行文本, select=单选, multi_select=多选, date_select=日期, number=数字
   * <p> 示例值：number
   */
  @SerializedName("type")
  private String type;
  /**
   * 字段是否为自定义
   * <p> 示例值：true
   */
  @SerializedName("is_customized")
  private Boolean isCustomized;
  /**
   * 单选/多选可选择字段的选项值
   * <p> 示例值：
   */
  @SerializedName("option_list")
  private OfferSchemaDetailOption[] optionList;

  // builder 开始
  public OfferSchemaDetail() {
  }

  public OfferSchemaDetail(Builder builder) {
    /**
     * 字段ID
     * <p> 示例值：1213213123123
     */
    this.id = builder.id;
    /**
     * 字段名称
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 字段类型, text=单行文本, long_text=多行文本, select=单选, multi_select=多选, date_select=日期, number=数字
     * <p> 示例值：number
     */
    this.type = builder.type;
    /**
     * 字段是否为自定义
     * <p> 示例值：true
     */
    this.isCustomized = builder.isCustomized;
    /**
     * 单选/多选可选择字段的选项值
     * <p> 示例值：
     */
    this.optionList = builder.optionList;
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

  public OfferSchemaName getName() {
    return this.name;
  }

  public void setName(OfferSchemaName name) {
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Boolean getIsCustomized() {
    return this.isCustomized;
  }

  public void setIsCustomized(Boolean isCustomized) {
    this.isCustomized = isCustomized;
  }

  public OfferSchemaDetailOption[] getOptionList() {
    return this.optionList;
  }

  public void setOptionList(OfferSchemaDetailOption[] optionList) {
    this.optionList = optionList;
  }

  public static class Builder {

    /**
     * 字段ID
     * <p> 示例值：1213213123123
     */
    private String id;
    /**
     * 字段名称
     * <p> 示例值：
     */
    private OfferSchemaName name;
    /**
     * 字段类型, text=单行文本, long_text=多行文本, select=单选, multi_select=多选, date_select=日期, number=数字
     * <p> 示例值：number
     */
    private String type;
    /**
     * 字段是否为自定义
     * <p> 示例值：true
     */
    private Boolean isCustomized;
    /**
     * 单选/多选可选择字段的选项值
     * <p> 示例值：
     */
    private OfferSchemaDetailOption[] optionList;

    /**
     * 字段ID
     * <p> 示例值：1213213123123
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
    public Builder name(OfferSchemaName name) {
      this.name = name;
      return this;
    }


    /**
     * 字段类型, text=单行文本, long_text=多行文本, select=单选, multi_select=多选, date_select=日期, number=数字
     * <p> 示例值：number
     *
     * @param type
     * @return
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }


    /**
     * 字段是否为自定义
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
     * 单选/多选可选择字段的选项值
     * <p> 示例值：
     *
     * @param optionList
     * @return
     */
    public Builder optionList(OfferSchemaDetailOption[] optionList) {
      this.optionList = optionList;
      return this;
    }


    public OfferSchemaDetail build() {
      return new OfferSchemaDetail(this);
    }
  }
}
