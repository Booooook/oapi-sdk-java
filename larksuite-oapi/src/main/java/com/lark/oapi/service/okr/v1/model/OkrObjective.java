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

public class OkrObjective {

  /**
   * Objective ID
   * <p> 示例值：1231231231231
   */
  @SerializedName("id")
  private String id;
  /**
   * 权限
   * <p> 示例值：0
   */
  @SerializedName("permission")
  private Integer permission;
  /**
   * Objective 内容
   * <p> 示例值：Objective 内容
   */
  @SerializedName("content")
  private String content;
  /**
   * Objective 进度记录内容
   * <p> 示例值：Objective 进度记录内容
   */
  @SerializedName("progress_report")
  private String progressReport;
  /**
   * Objective 分数（0 - 100）
   * <p> 示例值：100
   */
  @SerializedName("score")
  private Integer score;
  /**
   * Objective的权重（0 - 100）
   * <p> 示例值：33.33
   */
  @SerializedName("weight")
  private Double weight;
  /**
   * Objective进度
   * <p> 示例值：
   */
  @SerializedName("progress_rate")
  private OkrObjectiveProgressRate progressRate;
  /**
   * Objective KeyResult 列表
   * <p> 示例值：
   */
  @SerializedName("kr_list")
  private OkrObjectiveKr[] krList;
  /**
   * 对齐到该Objective的Objective列表
   * <p> 示例值：
   */
  @SerializedName("aligned_objective_list")
  private OkrObjectiveAlignedObjective[] alignedObjectiveList;
  /**
   * 该Objective对齐到的Objective列表
   * <p> 示例值：
   */
  @SerializedName("aligning_objective_list")
  private OkrObjectiveAlignedObjective[] aligningObjectiveList;
  /**
   * 该Objective的进度列表
   * <p> 示例值：
   */
  @SerializedName("progress_record_list")
  private ProgressRecordSimplify[] progressRecordList;
  /**
   * 最后一次进度百分比更新时间 毫秒
   * <p> 示例值：1618500278663
   */
  @SerializedName("progress_rate_percent_last_updated_time")
  private String progressRatePercentLastUpdatedTime;
  /**
   * 最后一次状态更新时间 毫秒
   * <p> 示例值：1618500278663
   */
  @SerializedName("progress_rate_status_last_updated_time")
  private String progressRateStatusLastUpdatedTime;
  /**
   * 最后一次在侧边栏新增或者编辑进展的时间 毫秒
   * <p> 示例值：1618500278663
   */
  @SerializedName("progress_record_last_updated_time")
  private String progressRecordLastUpdatedTime;
  /**
   * 最后一次编辑进展记录/备注的时间 毫秒
   * <p> 示例值：1618500278663
   */
  @SerializedName("progress_report_last_updated_time")
  private String progressReportLastUpdatedTime;
  /**
   * 最后一次打分更新时间 毫秒
   * <p> 示例值：1618500278663
   */
  @SerializedName("score_last_updated_time")
  private String scoreLastUpdatedTime;
  /**
   * 截止时间 毫秒
   * <p> 示例值：1618500278663
   */
  @SerializedName("deadline")
  private String deadline;
  /**
   * 该Objective提到的人员列表
   * <p> 示例值：
   */
  @SerializedName("mentioned_user_list")
  private OkrObjectiveAlignedObjectiveOwner[] mentionedUserList;

  // builder 开始
  public OkrObjective() {
  }

  public OkrObjective(Builder builder) {
    /**
     * Objective ID
     * <p> 示例值：1231231231231
     */
    this.id = builder.id;
    /**
     * 权限
     * <p> 示例值：0
     */
    this.permission = builder.permission;
    /**
     * Objective 内容
     * <p> 示例值：Objective 内容
     */
    this.content = builder.content;
    /**
     * Objective 进度记录内容
     * <p> 示例值：Objective 进度记录内容
     */
    this.progressReport = builder.progressReport;
    /**
     * Objective 分数（0 - 100）
     * <p> 示例值：100
     */
    this.score = builder.score;
    /**
     * Objective的权重（0 - 100）
     * <p> 示例值：33.33
     */
    this.weight = builder.weight;
    /**
     * Objective进度
     * <p> 示例值：
     */
    this.progressRate = builder.progressRate;
    /**
     * Objective KeyResult 列表
     * <p> 示例值：
     */
    this.krList = builder.krList;
    /**
     * 对齐到该Objective的Objective列表
     * <p> 示例值：
     */
    this.alignedObjectiveList = builder.alignedObjectiveList;
    /**
     * 该Objective对齐到的Objective列表
     * <p> 示例值：
     */
    this.aligningObjectiveList = builder.aligningObjectiveList;
    /**
     * 该Objective的进度列表
     * <p> 示例值：
     */
    this.progressRecordList = builder.progressRecordList;
    /**
     * 最后一次进度百分比更新时间 毫秒
     * <p> 示例值：1618500278663
     */
    this.progressRatePercentLastUpdatedTime = builder.progressRatePercentLastUpdatedTime;
    /**
     * 最后一次状态更新时间 毫秒
     * <p> 示例值：1618500278663
     */
    this.progressRateStatusLastUpdatedTime = builder.progressRateStatusLastUpdatedTime;
    /**
     * 最后一次在侧边栏新增或者编辑进展的时间 毫秒
     * <p> 示例值：1618500278663
     */
    this.progressRecordLastUpdatedTime = builder.progressRecordLastUpdatedTime;
    /**
     * 最后一次编辑进展记录/备注的时间 毫秒
     * <p> 示例值：1618500278663
     */
    this.progressReportLastUpdatedTime = builder.progressReportLastUpdatedTime;
    /**
     * 最后一次打分更新时间 毫秒
     * <p> 示例值：1618500278663
     */
    this.scoreLastUpdatedTime = builder.scoreLastUpdatedTime;
    /**
     * 截止时间 毫秒
     * <p> 示例值：1618500278663
     */
    this.deadline = builder.deadline;
    /**
     * 该Objective提到的人员列表
     * <p> 示例值：
     */
    this.mentionedUserList = builder.mentionedUserList;
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

  public Integer getPermission() {
    return this.permission;
  }

  public void setPermission(Integer permission) {
    this.permission = permission;
  }

  public String getContent() {
    return this.content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getProgressReport() {
    return this.progressReport;
  }

  public void setProgressReport(String progressReport) {
    this.progressReport = progressReport;
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

  public OkrObjectiveProgressRate getProgressRate() {
    return this.progressRate;
  }

  public void setProgressRate(OkrObjectiveProgressRate progressRate) {
    this.progressRate = progressRate;
  }

  public OkrObjectiveKr[] getKrList() {
    return this.krList;
  }

  public void setKrList(OkrObjectiveKr[] krList) {
    this.krList = krList;
  }

  public OkrObjectiveAlignedObjective[] getAlignedObjectiveList() {
    return this.alignedObjectiveList;
  }

  public void setAlignedObjectiveList(OkrObjectiveAlignedObjective[] alignedObjectiveList) {
    this.alignedObjectiveList = alignedObjectiveList;
  }

  public OkrObjectiveAlignedObjective[] getAligningObjectiveList() {
    return this.aligningObjectiveList;
  }

  public void setAligningObjectiveList(OkrObjectiveAlignedObjective[] aligningObjectiveList) {
    this.aligningObjectiveList = aligningObjectiveList;
  }

  public ProgressRecordSimplify[] getProgressRecordList() {
    return this.progressRecordList;
  }

  public void setProgressRecordList(ProgressRecordSimplify[] progressRecordList) {
    this.progressRecordList = progressRecordList;
  }

  public String getProgressRatePercentLastUpdatedTime() {
    return this.progressRatePercentLastUpdatedTime;
  }

  public void setProgressRatePercentLastUpdatedTime(String progressRatePercentLastUpdatedTime) {
    this.progressRatePercentLastUpdatedTime = progressRatePercentLastUpdatedTime;
  }

  public String getProgressRateStatusLastUpdatedTime() {
    return this.progressRateStatusLastUpdatedTime;
  }

  public void setProgressRateStatusLastUpdatedTime(String progressRateStatusLastUpdatedTime) {
    this.progressRateStatusLastUpdatedTime = progressRateStatusLastUpdatedTime;
  }

  public String getProgressRecordLastUpdatedTime() {
    return this.progressRecordLastUpdatedTime;
  }

  public void setProgressRecordLastUpdatedTime(String progressRecordLastUpdatedTime) {
    this.progressRecordLastUpdatedTime = progressRecordLastUpdatedTime;
  }

  public String getProgressReportLastUpdatedTime() {
    return this.progressReportLastUpdatedTime;
  }

  public void setProgressReportLastUpdatedTime(String progressReportLastUpdatedTime) {
    this.progressReportLastUpdatedTime = progressReportLastUpdatedTime;
  }

  public String getScoreLastUpdatedTime() {
    return this.scoreLastUpdatedTime;
  }

  public void setScoreLastUpdatedTime(String scoreLastUpdatedTime) {
    this.scoreLastUpdatedTime = scoreLastUpdatedTime;
  }

  public String getDeadline() {
    return this.deadline;
  }

  public void setDeadline(String deadline) {
    this.deadline = deadline;
  }

  public OkrObjectiveAlignedObjectiveOwner[] getMentionedUserList() {
    return this.mentionedUserList;
  }

  public void setMentionedUserList(OkrObjectiveAlignedObjectiveOwner[] mentionedUserList) {
    this.mentionedUserList = mentionedUserList;
  }

  public static class Builder {

    /**
     * Objective ID
     * <p> 示例值：1231231231231
     */
    private String id;
    /**
     * 权限
     * <p> 示例值：0
     */
    private Integer permission;
    /**
     * Objective 内容
     * <p> 示例值：Objective 内容
     */
    private String content;
    /**
     * Objective 进度记录内容
     * <p> 示例值：Objective 进度记录内容
     */
    private String progressReport;
    /**
     * Objective 分数（0 - 100）
     * <p> 示例值：100
     */
    private Integer score;
    /**
     * Objective的权重（0 - 100）
     * <p> 示例值：33.33
     */
    private Double weight;
    /**
     * Objective进度
     * <p> 示例值：
     */
    private OkrObjectiveProgressRate progressRate;
    /**
     * Objective KeyResult 列表
     * <p> 示例值：
     */
    private OkrObjectiveKr[] krList;
    /**
     * 对齐到该Objective的Objective列表
     * <p> 示例值：
     */
    private OkrObjectiveAlignedObjective[] alignedObjectiveList;
    /**
     * 该Objective对齐到的Objective列表
     * <p> 示例值：
     */
    private OkrObjectiveAlignedObjective[] aligningObjectiveList;
    /**
     * 该Objective的进度列表
     * <p> 示例值：
     */
    private ProgressRecordSimplify[] progressRecordList;
    /**
     * 最后一次进度百分比更新时间 毫秒
     * <p> 示例值：1618500278663
     */
    private String progressRatePercentLastUpdatedTime;
    /**
     * 最后一次状态更新时间 毫秒
     * <p> 示例值：1618500278663
     */
    private String progressRateStatusLastUpdatedTime;
    /**
     * 最后一次在侧边栏新增或者编辑进展的时间 毫秒
     * <p> 示例值：1618500278663
     */
    private String progressRecordLastUpdatedTime;
    /**
     * 最后一次编辑进展记录/备注的时间 毫秒
     * <p> 示例值：1618500278663
     */
    private String progressReportLastUpdatedTime;
    /**
     * 最后一次打分更新时间 毫秒
     * <p> 示例值：1618500278663
     */
    private String scoreLastUpdatedTime;
    /**
     * 截止时间 毫秒
     * <p> 示例值：1618500278663
     */
    private String deadline;
    /**
     * 该Objective提到的人员列表
     * <p> 示例值：
     */
    private OkrObjectiveAlignedObjectiveOwner[] mentionedUserList;

    /**
     * Objective ID
     * <p> 示例值：1231231231231
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 权限
     * <p> 示例值：0
     *
     * @param permission
     * @return
     */
    public Builder permission(Integer permission) {
      this.permission = permission;
      return this;
    }

    /**
     * 权限
     * <p> 示例值：0
     *
     * @param permission {@link com.lark.oapi.service.okr.v1.enums.OkrObjectivePermissionEnum}
     * @return
     */
    public Builder permission(
        com.lark.oapi.service.okr.v1.enums.OkrObjectivePermissionEnum permission) {
      this.permission = permission.getValue();
      return this;
    }


    /**
     * Objective 内容
     * <p> 示例值：Objective 内容
     *
     * @param content
     * @return
     */
    public Builder content(String content) {
      this.content = content;
      return this;
    }


    /**
     * Objective 进度记录内容
     * <p> 示例值：Objective 进度记录内容
     *
     * @param progressReport
     * @return
     */
    public Builder progressReport(String progressReport) {
      this.progressReport = progressReport;
      return this;
    }


    /**
     * Objective 分数（0 - 100）
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
     * Objective的权重（0 - 100）
     * <p> 示例值：33.33
     *
     * @param weight
     * @return
     */
    public Builder weight(Double weight) {
      this.weight = weight;
      return this;
    }


    /**
     * Objective进度
     * <p> 示例值：
     *
     * @param progressRate
     * @return
     */
    public Builder progressRate(OkrObjectiveProgressRate progressRate) {
      this.progressRate = progressRate;
      return this;
    }


    /**
     * Objective KeyResult 列表
     * <p> 示例值：
     *
     * @param krList
     * @return
     */
    public Builder krList(OkrObjectiveKr[] krList) {
      this.krList = krList;
      return this;
    }


    /**
     * 对齐到该Objective的Objective列表
     * <p> 示例值：
     *
     * @param alignedObjectiveList
     * @return
     */
    public Builder alignedObjectiveList(OkrObjectiveAlignedObjective[] alignedObjectiveList) {
      this.alignedObjectiveList = alignedObjectiveList;
      return this;
    }


    /**
     * 该Objective对齐到的Objective列表
     * <p> 示例值：
     *
     * @param aligningObjectiveList
     * @return
     */
    public Builder aligningObjectiveList(OkrObjectiveAlignedObjective[] aligningObjectiveList) {
      this.aligningObjectiveList = aligningObjectiveList;
      return this;
    }


    /**
     * 该Objective的进度列表
     * <p> 示例值：
     *
     * @param progressRecordList
     * @return
     */
    public Builder progressRecordList(ProgressRecordSimplify[] progressRecordList) {
      this.progressRecordList = progressRecordList;
      return this;
    }


    /**
     * 最后一次进度百分比更新时间 毫秒
     * <p> 示例值：1618500278663
     *
     * @param progressRatePercentLastUpdatedTime
     * @return
     */
    public Builder progressRatePercentLastUpdatedTime(String progressRatePercentLastUpdatedTime) {
      this.progressRatePercentLastUpdatedTime = progressRatePercentLastUpdatedTime;
      return this;
    }


    /**
     * 最后一次状态更新时间 毫秒
     * <p> 示例值：1618500278663
     *
     * @param progressRateStatusLastUpdatedTime
     * @return
     */
    public Builder progressRateStatusLastUpdatedTime(String progressRateStatusLastUpdatedTime) {
      this.progressRateStatusLastUpdatedTime = progressRateStatusLastUpdatedTime;
      return this;
    }


    /**
     * 最后一次在侧边栏新增或者编辑进展的时间 毫秒
     * <p> 示例值：1618500278663
     *
     * @param progressRecordLastUpdatedTime
     * @return
     */
    public Builder progressRecordLastUpdatedTime(String progressRecordLastUpdatedTime) {
      this.progressRecordLastUpdatedTime = progressRecordLastUpdatedTime;
      return this;
    }


    /**
     * 最后一次编辑进展记录/备注的时间 毫秒
     * <p> 示例值：1618500278663
     *
     * @param progressReportLastUpdatedTime
     * @return
     */
    public Builder progressReportLastUpdatedTime(String progressReportLastUpdatedTime) {
      this.progressReportLastUpdatedTime = progressReportLastUpdatedTime;
      return this;
    }


    /**
     * 最后一次打分更新时间 毫秒
     * <p> 示例值：1618500278663
     *
     * @param scoreLastUpdatedTime
     * @return
     */
    public Builder scoreLastUpdatedTime(String scoreLastUpdatedTime) {
      this.scoreLastUpdatedTime = scoreLastUpdatedTime;
      return this;
    }


    /**
     * 截止时间 毫秒
     * <p> 示例值：1618500278663
     *
     * @param deadline
     * @return
     */
    public Builder deadline(String deadline) {
      this.deadline = deadline;
      return this;
    }


    /**
     * 该Objective提到的人员列表
     * <p> 示例值：
     *
     * @param mentionedUserList
     * @return
     */
    public Builder mentionedUserList(OkrObjectiveAlignedObjectiveOwner[] mentionedUserList) {
      this.mentionedUserList = mentionedUserList;
      return this;
    }


    public OkrObjective build() {
      return new OkrObjective(this);
    }
  }
}
