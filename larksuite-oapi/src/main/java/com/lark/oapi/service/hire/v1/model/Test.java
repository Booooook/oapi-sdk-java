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

public class Test {

  /**
   * 笔试 ID
   * <p> 示例值：6963784391454918956
   */
  @SerializedName("test_id")
  private String testId;
  /**
   * 投递 ID
   * <p> 示例值：6920544531948800269
   */
  @SerializedName("application_id")
  private String applicationId;
  /**
   * 试卷 ID
   * <p> 示例值：6963549885526346028
   */
  @SerializedName("test_paper_id")
  private String testPaperId;
  /**
   * 试卷名称
   * <p> 示例值：数据结构测验
   */
  @SerializedName("test_paper_name")
  private String testPaperName;
  /**
   * 试卷来源 ID
   * <p> 示例值：5
   */
  @SerializedName("test_paper_source_id")
  private String testPaperSourceId;
  /**
   * 试卷来源名称
   * <p> 示例值：
   */
  @SerializedName("test_paper_source_name")
  private I18n testPaperSourceName;
  /**
   * 笔试答复状态
   * <p> 示例值：1
   */
  @SerializedName("reply_status")
  private Integer replyStatus;
  /**
   * 笔试状态
   * <p> 示例值：1
   */
  @SerializedName("test_status")
  private Integer testStatus;
  /**
   * 笔试时间
   * <p> 示例值：
   */
  @SerializedName("test_schedule")
  private TestSchedule testSchedule;
  /**
   * 笔试作答完成时间
   * <p> 示例值：1608725989000
   */
  @SerializedName("test_complete_time")
  private String testCompleteTime;
  /**
   * 笔试报告链接列表
   * <p> 示例值：
   */
  @SerializedName("report_url_list")
  private String[] reportUrlList;
  /**
   * 笔试详细成绩
   * <p> 示例值：
   */
  @SerializedName("result_detail_list")
  private TestResultDetail[] resultDetailList;
  /**
   * 笔试结果上传时间（手动录入的笔试成绩具有）
   * <p> 示例值：1608725989000
   */
  @SerializedName("result_upload_time")
  private String resultUploadTime;
  /**
   * 阅卷得分
   * <p> 示例值：60
   */
  @SerializedName("score")
  private String score;
  /**
   * 阅卷结果提交时间（若重复提交，则为最新提交时间）
   * <p> 示例值：1608725989000
   */
  @SerializedName("score_submit_time")
  private String scoreSubmitTime;
  /**
   * 阅卷人，值类型由 user_id_type 查询参数决定
   * <p> 示例值：ou_266ed047ed37f24554e5a0afdbb15556
   */
  @SerializedName("reviewer")
  private String reviewer;
  /**
   * 笔试创建时间
   * <p> 示例值：1608725989000
   */
  @SerializedName("created_at")
  private String createdAt;

  // builder 开始
  public Test() {
  }

  public Test(Builder builder) {
    /**
     * 笔试 ID
     * <p> 示例值：6963784391454918956
     */
    this.testId = builder.testId;
    /**
     * 投递 ID
     * <p> 示例值：6920544531948800269
     */
    this.applicationId = builder.applicationId;
    /**
     * 试卷 ID
     * <p> 示例值：6963549885526346028
     */
    this.testPaperId = builder.testPaperId;
    /**
     * 试卷名称
     * <p> 示例值：数据结构测验
     */
    this.testPaperName = builder.testPaperName;
    /**
     * 试卷来源 ID
     * <p> 示例值：5
     */
    this.testPaperSourceId = builder.testPaperSourceId;
    /**
     * 试卷来源名称
     * <p> 示例值：
     */
    this.testPaperSourceName = builder.testPaperSourceName;
    /**
     * 笔试答复状态
     * <p> 示例值：1
     */
    this.replyStatus = builder.replyStatus;
    /**
     * 笔试状态
     * <p> 示例值：1
     */
    this.testStatus = builder.testStatus;
    /**
     * 笔试时间
     * <p> 示例值：
     */
    this.testSchedule = builder.testSchedule;
    /**
     * 笔试作答完成时间
     * <p> 示例值：1608725989000
     */
    this.testCompleteTime = builder.testCompleteTime;
    /**
     * 笔试报告链接列表
     * <p> 示例值：
     */
    this.reportUrlList = builder.reportUrlList;
    /**
     * 笔试详细成绩
     * <p> 示例值：
     */
    this.resultDetailList = builder.resultDetailList;
    /**
     * 笔试结果上传时间（手动录入的笔试成绩具有）
     * <p> 示例值：1608725989000
     */
    this.resultUploadTime = builder.resultUploadTime;
    /**
     * 阅卷得分
     * <p> 示例值：60
     */
    this.score = builder.score;
    /**
     * 阅卷结果提交时间（若重复提交，则为最新提交时间）
     * <p> 示例值：1608725989000
     */
    this.scoreSubmitTime = builder.scoreSubmitTime;
    /**
     * 阅卷人，值类型由 user_id_type 查询参数决定
     * <p> 示例值：ou_266ed047ed37f24554e5a0afdbb15556
     */
    this.reviewer = builder.reviewer;
    /**
     * 笔试创建时间
     * <p> 示例值：1608725989000
     */
    this.createdAt = builder.createdAt;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getTestId() {
    return this.testId;
  }

  public void setTestId(String testId) {
    this.testId = testId;
  }

  public String getApplicationId() {
    return this.applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public String getTestPaperId() {
    return this.testPaperId;
  }

  public void setTestPaperId(String testPaperId) {
    this.testPaperId = testPaperId;
  }

  public String getTestPaperName() {
    return this.testPaperName;
  }

  public void setTestPaperName(String testPaperName) {
    this.testPaperName = testPaperName;
  }

  public String getTestPaperSourceId() {
    return this.testPaperSourceId;
  }

  public void setTestPaperSourceId(String testPaperSourceId) {
    this.testPaperSourceId = testPaperSourceId;
  }

  public I18n getTestPaperSourceName() {
    return this.testPaperSourceName;
  }

  public void setTestPaperSourceName(I18n testPaperSourceName) {
    this.testPaperSourceName = testPaperSourceName;
  }

  public Integer getReplyStatus() {
    return this.replyStatus;
  }

  public void setReplyStatus(Integer replyStatus) {
    this.replyStatus = replyStatus;
  }

  public Integer getTestStatus() {
    return this.testStatus;
  }

  public void setTestStatus(Integer testStatus) {
    this.testStatus = testStatus;
  }

  public TestSchedule getTestSchedule() {
    return this.testSchedule;
  }

  public void setTestSchedule(TestSchedule testSchedule) {
    this.testSchedule = testSchedule;
  }

  public String getTestCompleteTime() {
    return this.testCompleteTime;
  }

  public void setTestCompleteTime(String testCompleteTime) {
    this.testCompleteTime = testCompleteTime;
  }

  public String[] getReportUrlList() {
    return this.reportUrlList;
  }

  public void setReportUrlList(String[] reportUrlList) {
    this.reportUrlList = reportUrlList;
  }

  public TestResultDetail[] getResultDetailList() {
    return this.resultDetailList;
  }

  public void setResultDetailList(TestResultDetail[] resultDetailList) {
    this.resultDetailList = resultDetailList;
  }

  public String getResultUploadTime() {
    return this.resultUploadTime;
  }

  public void setResultUploadTime(String resultUploadTime) {
    this.resultUploadTime = resultUploadTime;
  }

  public String getScore() {
    return this.score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public String getScoreSubmitTime() {
    return this.scoreSubmitTime;
  }

  public void setScoreSubmitTime(String scoreSubmitTime) {
    this.scoreSubmitTime = scoreSubmitTime;
  }

  public String getReviewer() {
    return this.reviewer;
  }

  public void setReviewer(String reviewer) {
    this.reviewer = reviewer;
  }

  public String getCreatedAt() {
    return this.createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public static class Builder {

    /**
     * 笔试 ID
     * <p> 示例值：6963784391454918956
     */
    private String testId;
    /**
     * 投递 ID
     * <p> 示例值：6920544531948800269
     */
    private String applicationId;
    /**
     * 试卷 ID
     * <p> 示例值：6963549885526346028
     */
    private String testPaperId;
    /**
     * 试卷名称
     * <p> 示例值：数据结构测验
     */
    private String testPaperName;
    /**
     * 试卷来源 ID
     * <p> 示例值：5
     */
    private String testPaperSourceId;
    /**
     * 试卷来源名称
     * <p> 示例值：
     */
    private I18n testPaperSourceName;
    /**
     * 笔试答复状态
     * <p> 示例值：1
     */
    private Integer replyStatus;
    /**
     * 笔试状态
     * <p> 示例值：1
     */
    private Integer testStatus;
    /**
     * 笔试时间
     * <p> 示例值：
     */
    private TestSchedule testSchedule;
    /**
     * 笔试作答完成时间
     * <p> 示例值：1608725989000
     */
    private String testCompleteTime;
    /**
     * 笔试报告链接列表
     * <p> 示例值：
     */
    private String[] reportUrlList;
    /**
     * 笔试详细成绩
     * <p> 示例值：
     */
    private TestResultDetail[] resultDetailList;
    /**
     * 笔试结果上传时间（手动录入的笔试成绩具有）
     * <p> 示例值：1608725989000
     */
    private String resultUploadTime;
    /**
     * 阅卷得分
     * <p> 示例值：60
     */
    private String score;
    /**
     * 阅卷结果提交时间（若重复提交，则为最新提交时间）
     * <p> 示例值：1608725989000
     */
    private String scoreSubmitTime;
    /**
     * 阅卷人，值类型由 user_id_type 查询参数决定
     * <p> 示例值：ou_266ed047ed37f24554e5a0afdbb15556
     */
    private String reviewer;
    /**
     * 笔试创建时间
     * <p> 示例值：1608725989000
     */
    private String createdAt;

    /**
     * 笔试 ID
     * <p> 示例值：6963784391454918956
     *
     * @param testId
     * @return
     */
    public Builder testId(String testId) {
      this.testId = testId;
      return this;
    }


    /**
     * 投递 ID
     * <p> 示例值：6920544531948800269
     *
     * @param applicationId
     * @return
     */
    public Builder applicationId(String applicationId) {
      this.applicationId = applicationId;
      return this;
    }


    /**
     * 试卷 ID
     * <p> 示例值：6963549885526346028
     *
     * @param testPaperId
     * @return
     */
    public Builder testPaperId(String testPaperId) {
      this.testPaperId = testPaperId;
      return this;
    }


    /**
     * 试卷名称
     * <p> 示例值：数据结构测验
     *
     * @param testPaperName
     * @return
     */
    public Builder testPaperName(String testPaperName) {
      this.testPaperName = testPaperName;
      return this;
    }


    /**
     * 试卷来源 ID
     * <p> 示例值：5
     *
     * @param testPaperSourceId
     * @return
     */
    public Builder testPaperSourceId(String testPaperSourceId) {
      this.testPaperSourceId = testPaperSourceId;
      return this;
    }


    /**
     * 试卷来源名称
     * <p> 示例值：
     *
     * @param testPaperSourceName
     * @return
     */
    public Builder testPaperSourceName(I18n testPaperSourceName) {
      this.testPaperSourceName = testPaperSourceName;
      return this;
    }


    /**
     * 笔试答复状态
     * <p> 示例值：1
     *
     * @param replyStatus
     * @return
     */
    public Builder replyStatus(Integer replyStatus) {
      this.replyStatus = replyStatus;
      return this;
    }


    /**
     * 笔试状态
     * <p> 示例值：1
     *
     * @param testStatus
     * @return
     */
    public Builder testStatus(Integer testStatus) {
      this.testStatus = testStatus;
      return this;
    }


    /**
     * 笔试时间
     * <p> 示例值：
     *
     * @param testSchedule
     * @return
     */
    public Builder testSchedule(TestSchedule testSchedule) {
      this.testSchedule = testSchedule;
      return this;
    }


    /**
     * 笔试作答完成时间
     * <p> 示例值：1608725989000
     *
     * @param testCompleteTime
     * @return
     */
    public Builder testCompleteTime(String testCompleteTime) {
      this.testCompleteTime = testCompleteTime;
      return this;
    }


    /**
     * 笔试报告链接列表
     * <p> 示例值：
     *
     * @param reportUrlList
     * @return
     */
    public Builder reportUrlList(String[] reportUrlList) {
      this.reportUrlList = reportUrlList;
      return this;
    }


    /**
     * 笔试详细成绩
     * <p> 示例值：
     *
     * @param resultDetailList
     * @return
     */
    public Builder resultDetailList(TestResultDetail[] resultDetailList) {
      this.resultDetailList = resultDetailList;
      return this;
    }


    /**
     * 笔试结果上传时间（手动录入的笔试成绩具有）
     * <p> 示例值：1608725989000
     *
     * @param resultUploadTime
     * @return
     */
    public Builder resultUploadTime(String resultUploadTime) {
      this.resultUploadTime = resultUploadTime;
      return this;
    }


    /**
     * 阅卷得分
     * <p> 示例值：60
     *
     * @param score
     * @return
     */
    public Builder score(String score) {
      this.score = score;
      return this;
    }


    /**
     * 阅卷结果提交时间（若重复提交，则为最新提交时间）
     * <p> 示例值：1608725989000
     *
     * @param scoreSubmitTime
     * @return
     */
    public Builder scoreSubmitTime(String scoreSubmitTime) {
      this.scoreSubmitTime = scoreSubmitTime;
      return this;
    }


    /**
     * 阅卷人，值类型由 user_id_type 查询参数决定
     * <p> 示例值：ou_266ed047ed37f24554e5a0afdbb15556
     *
     * @param reviewer
     * @return
     */
    public Builder reviewer(String reviewer) {
      this.reviewer = reviewer;
      return this;
    }


    /**
     * 笔试创建时间
     * <p> 示例值：1608725989000
     *
     * @param createdAt
     * @return
     */
    public Builder createdAt(String createdAt) {
      this.createdAt = createdAt;
      return this;
    }


    public Test build() {
      return new Test(this);
    }
  }
}
