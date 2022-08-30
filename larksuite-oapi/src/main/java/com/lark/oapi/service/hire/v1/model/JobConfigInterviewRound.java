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

public class JobConfigInterviewRound {

  /**
   * 面试官列表
   * <p> 示例值：
   */
  @SerializedName("interviewer_list")
  private IdNameObject[] interviewerList;
  /**
   * 面试轮次
   * <p> 示例值：1
   */
  @SerializedName("round")
  private Integer round;

  // builder 开始
  public JobConfigInterviewRound() {
  }

  public JobConfigInterviewRound(Builder builder) {
    /**
     * 面试官列表
     * <p> 示例值：
     */
    this.interviewerList = builder.interviewerList;
    /**
     * 面试轮次
     * <p> 示例值：1
     */
    this.round = builder.round;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public IdNameObject[] getInterviewerList() {
    return this.interviewerList;
  }

  public void setInterviewerList(IdNameObject[] interviewerList) {
    this.interviewerList = interviewerList;
  }

  public Integer getRound() {
    return this.round;
  }

  public void setRound(Integer round) {
    this.round = round;
  }

  public static class Builder {

    /**
     * 面试官列表
     * <p> 示例值：
     */
    private IdNameObject[] interviewerList;
    /**
     * 面试轮次
     * <p> 示例值：1
     */
    private Integer round;

    /**
     * 面试官列表
     * <p> 示例值：
     *
     * @param interviewerList
     * @return
     */
    public Builder interviewerList(IdNameObject[] interviewerList) {
      this.interviewerList = interviewerList;
      return this;
    }


    /**
     * 面试轮次
     * <p> 示例值：1
     *
     * @param round
     * @return
     */
    public Builder round(Integer round) {
      this.round = round;
      return this;
    }


    public JobConfigInterviewRound build() {
      return new JobConfigInterviewRound(this);
    }
  }
}
