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
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class GetEmployeeReq {

  /**
   * 此次调用中使用的用户ID的类型
   * <p> 示例值：
   */
  @Query
  @SerializedName("user_id_type")
  private String userIdType;
  /**
   * 员工ID
   * <p> 示例值：123
   */
  @Path
  @SerializedName("employee_id")
  private String employeeId;

  // builder 开始
  public GetEmployeeReq() {
  }

  public GetEmployeeReq(Builder builder) {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    this.userIdType = builder.userIdType;
    /**
     * 员工ID
     * <p> 示例值：123
     */
    this.employeeId = builder.employeeId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getUserIdType() {
    return this.userIdType;
  }

  public void setUserIdType(String userIdType) {
    this.userIdType = userIdType;
  }

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public static class Builder {

    private String userIdType; // 此次调用中使用的用户ID的类型
    private String employeeId; // 员工ID

    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     *
     * @param userIdType
     * @return
     */
    public Builder userIdType(String userIdType) {
      this.userIdType = userIdType;
      return this;
    }

    /**
     * 员工ID
     * <p> 示例值：123
     *
     * @param employeeId
     * @return
     */
    public Builder employeeId(String employeeId) {
      this.employeeId = employeeId;
      return this;
    }

    public GetEmployeeReq build() {
      return new GetEmployeeReq(this);
    }
  }
}
