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

public class CurrentOkrSimple {

  /**
   * OKR ID
   * <p> 示例值：
   */
  @SerializedName("okr_id")
  private String okrId;
  /**
   * 周期 ID
   * <p> 示例值：
   */
  @SerializedName("period_id")
  private String periodId;

  // builder 开始
  public CurrentOkrSimple() {
  }

  public CurrentOkrSimple(Builder builder) {
    /**
     * OKR ID
     * <p> 示例值：
     */
    this.okrId = builder.okrId;
    /**
     * 周期 ID
     * <p> 示例值：
     */
    this.periodId = builder.periodId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getOkrId() {
    return this.okrId;
  }

  public void setOkrId(String okrId) {
    this.okrId = okrId;
  }

  public String getPeriodId() {
    return this.periodId;
  }

  public void setPeriodId(String periodId) {
    this.periodId = periodId;
  }

  public static class Builder {

    /**
     * OKR ID
     * <p> 示例值：
     */
    private String okrId;
    /**
     * 周期 ID
     * <p> 示例值：
     */
    private String periodId;

    /**
     * OKR ID
     * <p> 示例值：
     *
     * @param okrId
     * @return
     */
    public Builder okrId(String okrId) {
      this.okrId = okrId;
      return this;
    }


    /**
     * 周期 ID
     * <p> 示例值：
     *
     * @param periodId
     * @return
     */
    public Builder periodId(String periodId) {
      this.periodId = periodId;
      return this;
    }


    public CurrentOkrSimple build() {
      return new CurrentOkrSimple(this);
    }
  }
}
