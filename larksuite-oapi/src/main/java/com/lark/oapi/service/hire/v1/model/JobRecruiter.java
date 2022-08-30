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

public class JobRecruiter {

  /**
   * 职位ID
   * <p> 示例值：
   */
  @SerializedName("id")
  private String id;
  /**
   * 招聘负责人ID
   * <p> 示例值：
   */
  @SerializedName("recruiter_id")
  private String recruiterId;
  /**
   * 用人经理ID列表
   * <p> 示例值：
   */
  @SerializedName("hiring_manager_id_list")
  private String[] hiringManagerIdList;
  /**
   * 协助人ID列表
   * <p> 示例值：
   */
  @SerializedName("assistant_id_list")
  private String[] assistantIdList;

  // builder 开始
  public JobRecruiter() {
  }

  public JobRecruiter(Builder builder) {
    /**
     * 职位ID
     * <p> 示例值：
     */
    this.id = builder.id;
    /**
     * 招聘负责人ID
     * <p> 示例值：
     */
    this.recruiterId = builder.recruiterId;
    /**
     * 用人经理ID列表
     * <p> 示例值：
     */
    this.hiringManagerIdList = builder.hiringManagerIdList;
    /**
     * 协助人ID列表
     * <p> 示例值：
     */
    this.assistantIdList = builder.assistantIdList;
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

  public String getRecruiterId() {
    return this.recruiterId;
  }

  public void setRecruiterId(String recruiterId) {
    this.recruiterId = recruiterId;
  }

  public String[] getHiringManagerIdList() {
    return this.hiringManagerIdList;
  }

  public void setHiringManagerIdList(String[] hiringManagerIdList) {
    this.hiringManagerIdList = hiringManagerIdList;
  }

  public String[] getAssistantIdList() {
    return this.assistantIdList;
  }

  public void setAssistantIdList(String[] assistantIdList) {
    this.assistantIdList = assistantIdList;
  }

  public static class Builder {

    /**
     * 职位ID
     * <p> 示例值：
     */
    private String id;
    /**
     * 招聘负责人ID
     * <p> 示例值：
     */
    private String recruiterId;
    /**
     * 用人经理ID列表
     * <p> 示例值：
     */
    private String[] hiringManagerIdList;
    /**
     * 协助人ID列表
     * <p> 示例值：
     */
    private String[] assistantIdList;

    /**
     * 职位ID
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
     * 招聘负责人ID
     * <p> 示例值：
     *
     * @param recruiterId
     * @return
     */
    public Builder recruiterId(String recruiterId) {
      this.recruiterId = recruiterId;
      return this;
    }


    /**
     * 用人经理ID列表
     * <p> 示例值：
     *
     * @param hiringManagerIdList
     * @return
     */
    public Builder hiringManagerIdList(String[] hiringManagerIdList) {
      this.hiringManagerIdList = hiringManagerIdList;
      return this;
    }


    /**
     * 协助人ID列表
     * <p> 示例值：
     *
     * @param assistantIdList
     * @return
     */
    public Builder assistantIdList(String[] assistantIdList) {
      this.assistantIdList = assistantIdList;
      return this;
    }


    public JobRecruiter build() {
      return new JobRecruiter(this);
    }
  }
}
