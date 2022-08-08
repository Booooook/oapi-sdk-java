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

public class Attachment {

  @SerializedName("file_token")
  private String fileToken;
  @SerializedName("name")
  private String name;
  @SerializedName("type")
  private String type;
  @SerializedName("size")
  private Integer size;
  @SerializedName("url")
  private String url;
  @SerializedName("tmp_url")
  private String tmpUrl;

  // builder 开始
  public Attachment() {
  }

  public Attachment(Builder builder) {
    this.fileToken = builder.fileToken;
    this.name = builder.name;
    this.type = builder.type;
    this.size = builder.size;
    this.url = builder.url;
    this.tmpUrl = builder.tmpUrl;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getFileToken() {
    return this.fileToken;
  }

  public void setFileToken(String fileToken) {
    this.fileToken = fileToken;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getSize() {
    return this.size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTmpUrl() {
    return this.tmpUrl;
  }

  public void setTmpUrl(String tmpUrl) {
    this.tmpUrl = tmpUrl;
  }

  public static class Builder {

    private String fileToken;
    private String name;
    private String type;
    private Integer size;
    private String url;
    private String tmpUrl;

    public Builder fileToken(String fileToken) {
      this.fileToken = fileToken;
      return this;
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder type(String type) {
      this.type = type;
      return this;
    }

    public Builder size(Integer size) {
      this.size = size;
      return this;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder tmpUrl(String tmpUrl) {
      this.tmpUrl = tmpUrl;
      return this;
    }


    public Attachment build() {
      return new Attachment(this);
    }
  }
}