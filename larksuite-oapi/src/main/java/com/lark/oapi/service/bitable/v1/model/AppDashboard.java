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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppDashboard {

  /**
   * 仪表盘 ID
   * <p> 示例值：blknkqrP3RqUkcAW
   */
  @SerializedName("block_id")
  private String blockId;
  /**
   * 仪表盘名字
   * <p> 示例值：仪表盘1
   */
  @SerializedName("name")
  private String name;

  // builder 开始
  public AppDashboard() {
  }

  public AppDashboard(Builder builder) {
    /**
     * 仪表盘 ID
     * <p> 示例值：blknkqrP3RqUkcAW
     */
    this.blockId = builder.blockId;
    /**
     * 仪表盘名字
     * <p> 示例值：仪表盘1
     */
    this.name = builder.name;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getBlockId() {
    return this.blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static class Builder {

    /**
     * 仪表盘 ID
     * <p> 示例值：blknkqrP3RqUkcAW
     */
    private String blockId;
    /**
     * 仪表盘名字
     * <p> 示例值：仪表盘1
     */
    private String name;

    /**
     * 仪表盘 ID
     * <p> 示例值：blknkqrP3RqUkcAW
     *
     * @param blockId
     * @return
     */
    public Builder blockId(String blockId) {
      this.blockId = blockId;
      return this;
    }


    /**
     * 仪表盘名字
     * <p> 示例值：仪表盘1
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    public AppDashboard build() {
      return new AppDashboard(this);
    }
  }
}