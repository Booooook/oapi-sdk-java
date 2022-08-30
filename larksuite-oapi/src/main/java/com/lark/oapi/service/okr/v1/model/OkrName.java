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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class OkrName {

  /**
   * 中文内容
   * <p> 示例值：
   */
  @SerializedName("zh")
  private String zh;
  /**
   * 英文内容
   * <p> 示例值：
   */
  @SerializedName("en")
  private String en;

  // builder 开始
  public OkrName() {
  }

  public OkrName(Builder builder) {
    /**
     * 中文内容
     * <p> 示例值：
     */
    this.zh = builder.zh;
    /**
     * 英文内容
     * <p> 示例值：
     */
    this.en = builder.en;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getZh() {
    return this.zh;
  }

  public void setZh(String zh) {
    this.zh = zh;
  }

  public String getEn() {
    return this.en;
  }

  public void setEn(String en) {
    this.en = en;
  }

  public static class Builder {

    /**
     * 中文内容
     * <p> 示例值：
     */
    private String zh;
    /**
     * 英文内容
     * <p> 示例值：
     */
    private String en;

    /**
     * 中文内容
     * <p> 示例值：
     *
     * @param zh
     * @return
     */
    public Builder zh(String zh) {
      this.zh = zh;
      return this;
    }


    /**
     * 英文内容
     * <p> 示例值：
     *
     * @param en
     * @return
     */
    public Builder en(String en) {
      this.en = en;
      return this;
    }


    public OkrName build() {
      return new OkrName(this);
    }
  }
}
