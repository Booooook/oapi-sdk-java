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

public class ContentList {

  /**
   * 列表类型
   * <p> 示例值：number
   */
  @SerializedName("type")
  private String type;
  /**
   * 列表的缩进级别，支持指定一行的缩进 除代码块以外的列表都支持设置缩进，支持 1-16 级缩进，取值范围：[1,16]
   * <p> 示例值：1
   */
  @SerializedName("indentLevel")
  private Integer indentLevel;
  /**
   * 用于指定列表的行号，仅对有序列表和代码块生效 如果为有序列表设置了缩进，行号可能会显示为字母或者罗马数字
   * <p> 示例值：1
   */
  @SerializedName("number")
  private Integer number;

  // builder 开始
  public ContentList() {
  }

  public ContentList(Builder builder) {
    /**
     * 列表类型
     * <p> 示例值：number
     */
    this.type = builder.type;
    /**
     * 列表的缩进级别，支持指定一行的缩进 除代码块以外的列表都支持设置缩进，支持 1-16 级缩进，取值范围：[1,16]
     * <p> 示例值：1
     */
    this.indentLevel = builder.indentLevel;
    /**
     * 用于指定列表的行号，仅对有序列表和代码块生效 如果为有序列表设置了缩进，行号可能会显示为字母或者罗马数字
     * <p> 示例值：1
     */
    this.number = builder.number;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integer getIndentLevel() {
    return this.indentLevel;
  }

  public void setIndentLevel(Integer indentLevel) {
    this.indentLevel = indentLevel;
  }

  public Integer getNumber() {
    return this.number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public static class Builder {

    /**
     * 列表类型
     * <p> 示例值：number
     */
    private String type;
    /**
     * 列表的缩进级别，支持指定一行的缩进 除代码块以外的列表都支持设置缩进，支持 1-16 级缩进，取值范围：[1,16]
     * <p> 示例值：1
     */
    private Integer indentLevel;
    /**
     * 用于指定列表的行号，仅对有序列表和代码块生效 如果为有序列表设置了缩进，行号可能会显示为字母或者罗马数字
     * <p> 示例值：1
     */
    private Integer number;

    /**
     * 列表类型
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
     * 列表类型
     * <p> 示例值：number
     *
     * @param type {@link com.lark.oapi.service.okr.v1.enums.ContentListTypeEnum}
     * @return
     */
    public Builder type(com.lark.oapi.service.okr.v1.enums.ContentListTypeEnum type) {
      this.type = type.getValue();
      return this;
    }


    /**
     * 列表的缩进级别，支持指定一行的缩进 除代码块以外的列表都支持设置缩进，支持 1-16 级缩进，取值范围：[1,16]
     * <p> 示例值：1
     *
     * @param indentLevel
     * @return
     */
    public Builder indentLevel(Integer indentLevel) {
      this.indentLevel = indentLevel;
      return this;
    }


    /**
     * 用于指定列表的行号，仅对有序列表和代码块生效 如果为有序列表设置了缩进，行号可能会显示为字母或者罗马数字
     * <p> 示例值：1
     *
     * @param number
     * @return
     */
    public Builder number(Integer number) {
      this.number = number;
      return this;
    }


    public ContentList build() {
      return new ContentList(this);
    }
  }
}