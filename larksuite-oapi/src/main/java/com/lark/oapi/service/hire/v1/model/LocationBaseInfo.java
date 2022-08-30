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

public class LocationBaseInfo {

  /**
   * location 地址码
   * <p> 示例值：
   */
  @SerializedName("code")
  private String code;
  /**
   * location 中文名字
   * <p> 示例值：
   */
  @SerializedName("name")
  private String name;
  /**
   * location 英文名字
   * <p> 示例值：
   */
  @SerializedName("en_name")
  private String enName;
  /**
   * location 的类型
   * <p> 示例值：
   */
  @SerializedName("location_type")
  private Integer locationType;
  /**
   * location 国际名字
   * <p> 示例值：
   */
  @SerializedName("i18n_name")
  private String i18nName;
  /**
   * location 拼音名字
   * <p> 示例值：
   */
  @SerializedName("py_name")
  private String pyName;

  // builder 开始
  public LocationBaseInfo() {
  }

  public LocationBaseInfo(Builder builder) {
    /**
     * location 地址码
     * <p> 示例值：
     */
    this.code = builder.code;
    /**
     * location 中文名字
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * location 英文名字
     * <p> 示例值：
     */
    this.enName = builder.enName;
    /**
     * location 的类型
     * <p> 示例值：
     */
    this.locationType = builder.locationType;
    /**
     * location 国际名字
     * <p> 示例值：
     */
    this.i18nName = builder.i18nName;
    /**
     * location 拼音名字
     * <p> 示例值：
     */
    this.pyName = builder.pyName;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
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

  public Integer getLocationType() {
    return this.locationType;
  }

  public void setLocationType(Integer locationType) {
    this.locationType = locationType;
  }

  public String getI18nName() {
    return this.i18nName;
  }

  public void setI18nName(String i18nName) {
    this.i18nName = i18nName;
  }

  public String getPyName() {
    return this.pyName;
  }

  public void setPyName(String pyName) {
    this.pyName = pyName;
  }

  public static class Builder {

    /**
     * location 地址码
     * <p> 示例值：
     */
    private String code;
    /**
     * location 中文名字
     * <p> 示例值：
     */
    private String name;
    /**
     * location 英文名字
     * <p> 示例值：
     */
    private String enName;
    /**
     * location 的类型
     * <p> 示例值：
     */
    private Integer locationType;
    /**
     * location 国际名字
     * <p> 示例值：
     */
    private String i18nName;
    /**
     * location 拼音名字
     * <p> 示例值：
     */
    private String pyName;

    /**
     * location 地址码
     * <p> 示例值：
     *
     * @param code
     * @return
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }


    /**
     * location 中文名字
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * location 英文名字
     * <p> 示例值：
     *
     * @param enName
     * @return
     */
    public Builder enName(String enName) {
      this.enName = enName;
      return this;
    }


    /**
     * location 的类型
     * <p> 示例值：
     *
     * @param locationType
     * @return
     */
    public Builder locationType(Integer locationType) {
      this.locationType = locationType;
      return this;
    }


    /**
     * location 国际名字
     * <p> 示例值：
     *
     * @param i18nName
     * @return
     */
    public Builder i18nName(String i18nName) {
      this.i18nName = i18nName;
      return this;
    }


    /**
     * location 拼音名字
     * <p> 示例值：
     *
     * @param pyName
     * @return
     */
    public Builder pyName(String pyName) {
      this.pyName = pyName;
      return this;
    }


    public LocationBaseInfo build() {
      return new LocationBaseInfo(this);
    }
  }
}
