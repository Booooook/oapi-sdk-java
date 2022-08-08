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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class InstanceSearchApproval {

  @SerializedName("code")
  private String code;
  @SerializedName("name")
  private String name;
  @SerializedName("is_external")
  private Boolean isExternal;
  @SerializedName("external")
  private InstanceSearchApprovalExternal external;

  // builder 开始
  public InstanceSearchApproval() {
  }

  public InstanceSearchApproval(Builder builder) {
    this.code = builder.code;
    this.name = builder.name;
    this.isExternal = builder.isExternal;
    this.external = builder.external;
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

  public Boolean getIsExternal() {
    return this.isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public InstanceSearchApprovalExternal getExternal() {
    return this.external;
  }

  public void setExternal(InstanceSearchApprovalExternal external) {
    this.external = external;
  }

  public static class Builder {

    private String code;
    private String name;
    private Boolean isExternal;
    private InstanceSearchApprovalExternal external;

    public Builder code(String code) {
      this.code = code;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder isExternal(Boolean isExternal) {
      this.isExternal = isExternal;
      return this;
    }

    public Builder external(InstanceSearchApprovalExternal external) {
      this.external = external;
      return this;
    }


    public InstanceSearchApproval build() {
      return new InstanceSearchApproval(this);
    }
  }
}