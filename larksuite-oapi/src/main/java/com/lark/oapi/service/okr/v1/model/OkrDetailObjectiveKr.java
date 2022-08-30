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

public class OkrDetailObjectiveKr {

  /**
   * Key Result ID
   * <p> 示例值：6976243668438992428
   */
  @SerializedName("id")
  private String id;
  /**
   * pos
   * <p> 示例值：100
   */
  @SerializedName("pos")
  private Integer pos;
  /**
   * KeyResult打分（0 - 100）
   * <p> 示例值：100
   */
  @SerializedName("score")
  private Integer score;
  /**
   * KeyResult的权重（0 - 100）（废弃）
   * <p> 示例值：100
   */
  @SerializedName("weight")
  private Double weight;
  /**
   * KeyResult 内容
   * <p> 示例值：
   */
  @SerializedName("content")
  private OkrName content;
  /**
   * 创建时间 毫秒
   * <p> 示例值：1624327915448
   */
  @SerializedName("create_time")
  private Integer createTime;
  /**
   * 修改时间 毫秒
   * <p> 示例值：1624327915448
   */
  @SerializedName("modify_time")
  private Integer modifyTime;

  // builder 开始
  public OkrDetailObjectiveKr() {
  }

  public OkrDetailObjectiveKr(Builder builder) {
    /**
     * Key Result ID
     * <p> 示例值：6976243668438992428
     */
    this.id = builder.id;
    /**
     * pos
     * <p> 示例值：100
     */
    this.pos = builder.pos;
    /**
     * KeyResult打分（0 - 100）
     * <p> 示例值：100
     */
    this.score = builder.score;
    /**
     * KeyResult的权重（0 - 100）（废弃）
     * <p> 示例值：100
     */
    this.weight = builder.weight;
    /**
     * KeyResult 内容
     * <p> 示例值：
     */
    this.content = builder.content;
    /**
     * 创建时间 毫秒
     * <p> 示例值：1624327915448
     */
    this.createTime = builder.createTime;
    /**
     * 修改时间 毫秒
     * <p> 示例值：1624327915448
     */
    this.modifyTime = builder.modifyTime;
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

  public Integer getPos() {
    return this.pos;
  }

  public void setPos(Integer pos) {
    this.pos = pos;
  }

  public Integer getScore() {
    return this.score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public Double getWeight() {
    return this.weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public OkrName getContent() {
    return this.content;
  }

  public void setContent(OkrName content) {
    this.content = content;
  }

  public Integer getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Integer getModifyTime() {
    return this.modifyTime;
  }

  public void setModifyTime(Integer modifyTime) {
    this.modifyTime = modifyTime;
  }

  public static class Builder {

    /**
     * Key Result ID
     * <p> 示例值：6976243668438992428
     */
    private String id;
    /**
     * pos
     * <p> 示例值：100
     */
    private Integer pos;
    /**
     * KeyResult打分（0 - 100）
     * <p> 示例值：100
     */
    private Integer score;
    /**
     * KeyResult的权重（0 - 100）（废弃）
     * <p> 示例值：100
     */
    private Double weight;
    /**
     * KeyResult 内容
     * <p> 示例值：
     */
    private OkrName content;
    /**
     * 创建时间 毫秒
     * <p> 示例值：1624327915448
     */
    private Integer createTime;
    /**
     * 修改时间 毫秒
     * <p> 示例值：1624327915448
     */
    private Integer modifyTime;

    /**
     * Key Result ID
     * <p> 示例值：6976243668438992428
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * pos
     * <p> 示例值：100
     *
     * @param pos
     * @return
     */
    public Builder pos(Integer pos) {
      this.pos = pos;
      return this;
    }


    /**
     * KeyResult打分（0 - 100）
     * <p> 示例值：100
     *
     * @param score
     * @return
     */
    public Builder score(Integer score) {
      this.score = score;
      return this;
    }


    /**
     * KeyResult的权重（0 - 100）（废弃）
     * <p> 示例值：100
     *
     * @param weight
     * @return
     */
    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }


    /**
     * KeyResult 内容
     * <p> 示例值：
     *
     * @param content
     * @return
     */
    public Builder content(OkrName content) {
      this.content = content;
      return this;
    }


    /**
     * 创建时间 毫秒
     * <p> 示例值：1624327915448
     *
     * @param createTime
     * @return
     */
    public Builder createTime(Integer createTime) {
      this.createTime = createTime;
      return this;
    }


    /**
     * 修改时间 毫秒
     * <p> 示例值：1624327915448
     *
     * @param modifyTime
     * @return
     */
    public Builder modifyTime(Integer modifyTime) {
      this.modifyTime = modifyTime;
      return this;
    }


    public OkrDetailObjectiveKr build() {
      return new OkrDetailObjectiveKr(this);
    }
  }
}
