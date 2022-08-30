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

public class SiteJobRecruitmentType {

  /**
   * 雇佣类型id
   * <p> 示例值：
   */
  @SerializedName("id")
  private String id;
  /**
   * 雇佣类型名称
   * <p> 示例值：
   */
  @SerializedName("name")
  private SiteName name;

  // builder 开始
  public SiteJobRecruitmentType() {
  }

  public SiteJobRecruitmentType(Builder builder) {
    /**
     * 雇佣类型id
     * <p> 示例值：
     */
    this.id = builder.id;
    /**
     * 雇佣类型名称
     * <p> 示例值：
     */
    this.name = builder.name;
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

  public SiteName getName() {
    return this.name;
  }

  public void setName(SiteName name) {
    this.name = name;
  }

  public static class Builder {

    /**
     * 雇佣类型id
     * <p> 示例值：
     */
    private String id;
    /**
     * 雇佣类型名称
     * <p> 示例值：
     */
    private SiteName name;

    /**
     * 雇佣类型id
     * <p> 示例值：
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 雇佣类型名称
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(SiteName name) {
      this.name = name;
      return this;
    }


    public SiteJobRecruitmentType build() {
      return new SiteJobRecruitmentType(this);
    }
  }
}
