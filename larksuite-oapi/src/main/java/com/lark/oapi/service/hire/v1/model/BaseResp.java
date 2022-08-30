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

public class BaseResp {

  /**
   * 响应信息
   * <p> 示例值：
   */
  @SerializedName("StatusMessage")
  private String statusMessage;
  /**
   * 响应码
   * <p> 示例值：
   */
  @SerializedName("StatusCode")
  private Integer statusCode;

  // builder 开始
  public BaseResp() {
  }

  public BaseResp(Builder builder) {
    /**
     * 响应信息
     * <p> 示例值：
     */
    this.statusMessage = builder.statusMessage;
    /**
     * 响应码
     * <p> 示例值：
     */
    this.statusCode = builder.statusCode;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getStatusMessage() {
    return this.statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  public Integer getStatusCode() {
    return this.statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  public static class Builder {

    /**
     * 响应信息
     * <p> 示例值：
     */
    private String statusMessage;
    /**
     * 响应码
     * <p> 示例值：
     */
    private Integer statusCode;

    /**
     * 响应信息
     * <p> 示例值：
     *
     * @param statusMessage
     * @return
     */
    public Builder statusMessage(String statusMessage) {
      this.statusMessage = statusMessage;
      return this;
    }


    /**
     * 响应码
     * <p> 示例值：
     *
     * @param statusCode
     * @return
     */
    public Builder statusCode(Integer statusCode) {
      this.statusCode = statusCode;
      return this;
    }


    public BaseResp build() {
      return new BaseResp(this);
    }
  }
}