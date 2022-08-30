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

public class TalentWorksInfo {

  /**
   * ID
   * <p> 示例值：6891560630172518670
   */
  @SerializedName("id")
  private String id;
  /**
   * 作品链接
   * <p> 示例值：www.test.com
   */
  @SerializedName("link")
  private String link;
  /**
   * 描述
   * <p> 示例值：test
   */
  @SerializedName("desc")
  private String desc;
  /**
   * 作品附件名称，若需获取作品附件预览信息可调用「获取附件预览信息」接口
   * <p> 示例值：XX项目
   */
  @SerializedName("name")
  private String name;
  /**
   * 自定义字段
   * <p> 示例值：
   */
  @SerializedName("customized_data_list")
  private TalentCustomizedDataChild[] customizedDataList;

  // builder 开始
  public TalentWorksInfo() {
  }

  public TalentWorksInfo(Builder builder) {
    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    this.id = builder.id;
    /**
     * 作品链接
     * <p> 示例值：www.test.com
     */
    this.link = builder.link;
    /**
     * 描述
     * <p> 示例值：test
     */
    this.desc = builder.desc;
    /**
     * 作品附件名称，若需获取作品附件预览信息可调用「获取附件预览信息」接口
     * <p> 示例值：XX项目
     */
    this.name = builder.name;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    this.customizedDataList = builder.customizedDataList;
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

  public String getLink() {
    return this.link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public String getDesc() {
    return this.desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TalentCustomizedDataChild[] getCustomizedDataList() {
    return this.customizedDataList;
  }

  public void setCustomizedDataList(TalentCustomizedDataChild[] customizedDataList) {
    this.customizedDataList = customizedDataList;
  }

  public static class Builder {

    /**
     * ID
     * <p> 示例值：6891560630172518670
     */
    private String id;
    /**
     * 作品链接
     * <p> 示例值：www.test.com
     */
    private String link;
    /**
     * 描述
     * <p> 示例值：test
     */
    private String desc;
    /**
     * 作品附件名称，若需获取作品附件预览信息可调用「获取附件预览信息」接口
     * <p> 示例值：XX项目
     */
    private String name;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    private TalentCustomizedDataChild[] customizedDataList;

    /**
     * ID
     * <p> 示例值：6891560630172518670
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 作品链接
     * <p> 示例值：www.test.com
     *
     * @param link
     * @return
     */
    public Builder link(String link) {
      this.link = link;
      return this;
    }


    /**
     * 描述
     * <p> 示例值：test
     *
     * @param desc
     * @return
     */
    public Builder desc(String desc) {
      this.desc = desc;
      return this;
    }


    /**
     * 作品附件名称，若需获取作品附件预览信息可调用「获取附件预览信息」接口
     * <p> 示例值：XX项目
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 自定义字段
     * <p> 示例值：
     *
     * @param customizedDataList
     * @return
     */
    public Builder customizedDataList(TalentCustomizedDataChild[] customizedDataList) {
      this.customizedDataList = customizedDataList;
      return this;
    }


    public TalentWorksInfo build() {
      return new TalentWorksInfo(this);
    }
  }
}
