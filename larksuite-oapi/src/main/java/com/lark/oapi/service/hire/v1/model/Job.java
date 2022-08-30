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

public class Job {

  /**
   * 职位 ID
   * <p> 示例值：6001
   */
  @SerializedName("id")
  private String id;
  /**
   * 职位名称
   * <p> 示例值：测试职位
   */
  @SerializedName("title")
  private String title;
  /**
   * 职位描述
   * <p> 示例值：职位描述文本
   */
  @SerializedName("description")
  private String description;
  /**
   * 职位编号
   * <p> 示例值：R18
   */
  @SerializedName("code")
  private String code;
  /**
   * 职位要求
   * <p> 示例值：职位要求文本
   */
  @SerializedName("requirement")
  private String requirement;
  /**
   * 雇佣类型
   * <p> 示例值：
   */
  @SerializedName("recruitment_type")
  private JobRecruitmentType recruitmentType;
  /**
   * 部门
   * <p> 示例值：
   */
  @SerializedName("department")
  private JobDepartment department;
  /**
   * 工作地点
   * <p> 示例值：
   */
  @SerializedName("city")
  private JobCity city;
  /**
   * 最低职级
   * <p> 示例值：
   */
  @SerializedName("min_job_level")
  private JobLevel minJobLevel;
  /**
   * 最高职级
   * <p> 示例值：
   */
  @SerializedName("max_job_level")
  private JobLevel maxJobLevel;
  /**
   * 职位亮点
   * <p> 示例值：
   */
  @SerializedName("highlight_list")
  private JobHighlight[] highlightList;
  /**
   * 职位序列
   * <p> 示例值：
   */
  @SerializedName("job_category")
  private JobCategory jobCategory;
  /**
   * 职位类别
   * <p> 示例值：
   */
  @SerializedName("job_type")
  private JobType jobType;
  /**
   * 启用状态
   * <p> 示例值：1
   */
  @SerializedName("active_status")
  private Integer activeStatus;
  /**
   * 创建人ID，若为空则为系统或其他对接系统创建
   * <p> 示例值：ou-xxx
   */
  @SerializedName("create_user_id")
  private String createUserId;
  /**
   * 创建时间
   * <p> 示例值：1617170925462
   */
  @SerializedName("create_time")
  private Integer createTime;
  /**
   * 更新时间
   * <p> 示例值：1617170925462
   */
  @SerializedName("update_time")
  private Integer updateTime;
  /**
   * 招聘流程类型
   * <p> 示例值：1
   */
  @SerializedName("process_type")
  private Integer processType;
  /**
   * 招聘流程 ID
   * <p> 示例值：1
   */
  @SerializedName("process_id")
  private String processId;
  /**
   * 招聘流程中文名称
   * <p> 示例值：流程中文名
   */
  @SerializedName("process_name")
  private String processName;
  /**
   * 招聘流程英文名称
   * <p> 示例值：流程英文名
   */
  @SerializedName("process_en_name")
  private String processEnName;
  /**
   * 自定义字段列表
   * <p> 示例值：
   */
  @SerializedName("customized_data_list")
  private JobCustomizedData[] customizedDataList;
  /**
   * 职能分类
   * <p> 示例值：
   */
  @SerializedName("job_function")
  private IdNameObject jobFunction;
  /**
   * 职位项目
   * <p> 示例值：
   */
  @SerializedName("subject")
  private IdNameObject subject;
  /**
   * 招聘数量
   * <p> 示例值：100
   */
  @SerializedName("head_count")
  private Integer headCount;
  /**
   * 工作年限
   * <p> 示例值：1
   */
  @SerializedName("experience")
  private Integer experience;
  /**
   * 到期日期
   * <p> 示例值：1622484739955
   */
  @SerializedName("expiry_time")
  private Integer expiryTime;
  /**
   * 最低薪资，单位:k
   * <p> 示例值：10
   */
  @SerializedName("min_salary")
  private Integer minSalary;
  /**
   * 最高薪资，单位:k
   * <p> 示例值：20
   */
  @SerializedName("max_salary")
  private Integer maxSalary;
  /**
   * 学历要求
   * <p> 示例值：1
   */
  @SerializedName("required_degree")
  private Integer requiredDegree;
  /**
   * 工作地点列表
   * <p> 示例值：
   */
  @SerializedName("city_list")
  private CodeNameObject[] cityList;

  // builder 开始
  public Job() {
  }

  public Job(Builder builder) {
    /**
     * 职位 ID
     * <p> 示例值：6001
     */
    this.id = builder.id;
    /**
     * 职位名称
     * <p> 示例值：测试职位
     */
    this.title = builder.title;
    /**
     * 职位描述
     * <p> 示例值：职位描述文本
     */
    this.description = builder.description;
    /**
     * 职位编号
     * <p> 示例值：R18
     */
    this.code = builder.code;
    /**
     * 职位要求
     * <p> 示例值：职位要求文本
     */
    this.requirement = builder.requirement;
    /**
     * 雇佣类型
     * <p> 示例值：
     */
    this.recruitmentType = builder.recruitmentType;
    /**
     * 部门
     * <p> 示例值：
     */
    this.department = builder.department;
    /**
     * 工作地点
     * <p> 示例值：
     */
    this.city = builder.city;
    /**
     * 最低职级
     * <p> 示例值：
     */
    this.minJobLevel = builder.minJobLevel;
    /**
     * 最高职级
     * <p> 示例值：
     */
    this.maxJobLevel = builder.maxJobLevel;
    /**
     * 职位亮点
     * <p> 示例值：
     */
    this.highlightList = builder.highlightList;
    /**
     * 职位序列
     * <p> 示例值：
     */
    this.jobCategory = builder.jobCategory;
    /**
     * 职位类别
     * <p> 示例值：
     */
    this.jobType = builder.jobType;
    /**
     * 启用状态
     * <p> 示例值：1
     */
    this.activeStatus = builder.activeStatus;
    /**
     * 创建人ID，若为空则为系统或其他对接系统创建
     * <p> 示例值：ou-xxx
     */
    this.createUserId = builder.createUserId;
    /**
     * 创建时间
     * <p> 示例值：1617170925462
     */
    this.createTime = builder.createTime;
    /**
     * 更新时间
     * <p> 示例值：1617170925462
     */
    this.updateTime = builder.updateTime;
    /**
     * 招聘流程类型
     * <p> 示例值：1
     */
    this.processType = builder.processType;
    /**
     * 招聘流程 ID
     * <p> 示例值：1
     */
    this.processId = builder.processId;
    /**
     * 招聘流程中文名称
     * <p> 示例值：流程中文名
     */
    this.processName = builder.processName;
    /**
     * 招聘流程英文名称
     * <p> 示例值：流程英文名
     */
    this.processEnName = builder.processEnName;
    /**
     * 自定义字段列表
     * <p> 示例值：
     */
    this.customizedDataList = builder.customizedDataList;
    /**
     * 职能分类
     * <p> 示例值：
     */
    this.jobFunction = builder.jobFunction;
    /**
     * 职位项目
     * <p> 示例值：
     */
    this.subject = builder.subject;
    /**
     * 招聘数量
     * <p> 示例值：100
     */
    this.headCount = builder.headCount;
    /**
     * 工作年限
     * <p> 示例值：1
     */
    this.experience = builder.experience;
    /**
     * 到期日期
     * <p> 示例值：1622484739955
     */
    this.expiryTime = builder.expiryTime;
    /**
     * 最低薪资，单位:k
     * <p> 示例值：10
     */
    this.minSalary = builder.minSalary;
    /**
     * 最高薪资，单位:k
     * <p> 示例值：20
     */
    this.maxSalary = builder.maxSalary;
    /**
     * 学历要求
     * <p> 示例值：1
     */
    this.requiredDegree = builder.requiredDegree;
    /**
     * 工作地点列表
     * <p> 示例值：
     */
    this.cityList = builder.cityList;
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

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getRequirement() {
    return this.requirement;
  }

  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }

  public JobRecruitmentType getRecruitmentType() {
    return this.recruitmentType;
  }

  public void setRecruitmentType(JobRecruitmentType recruitmentType) {
    this.recruitmentType = recruitmentType;
  }

  public JobDepartment getDepartment() {
    return this.department;
  }

  public void setDepartment(JobDepartment department) {
    this.department = department;
  }

  public JobCity getCity() {
    return this.city;
  }

  public void setCity(JobCity city) {
    this.city = city;
  }

  public JobLevel getMinJobLevel() {
    return this.minJobLevel;
  }

  public void setMinJobLevel(JobLevel minJobLevel) {
    this.minJobLevel = minJobLevel;
  }

  public JobLevel getMaxJobLevel() {
    return this.maxJobLevel;
  }

  public void setMaxJobLevel(JobLevel maxJobLevel) {
    this.maxJobLevel = maxJobLevel;
  }

  public JobHighlight[] getHighlightList() {
    return this.highlightList;
  }

  public void setHighlightList(JobHighlight[] highlightList) {
    this.highlightList = highlightList;
  }

  public JobCategory getJobCategory() {
    return this.jobCategory;
  }

  public void setJobCategory(JobCategory jobCategory) {
    this.jobCategory = jobCategory;
  }

  public JobType getJobType() {
    return this.jobType;
  }

  public void setJobType(JobType jobType) {
    this.jobType = jobType;
  }

  public Integer getActiveStatus() {
    return this.activeStatus;
  }

  public void setActiveStatus(Integer activeStatus) {
    this.activeStatus = activeStatus;
  }

  public String getCreateUserId() {
    return this.createUserId;
  }

  public void setCreateUserId(String createUserId) {
    this.createUserId = createUserId;
  }

  public Integer getCreateTime() {
    return this.createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public Integer getUpdateTime() {
    return this.updateTime;
  }

  public void setUpdateTime(Integer updateTime) {
    this.updateTime = updateTime;
  }

  public Integer getProcessType() {
    return this.processType;
  }

  public void setProcessType(Integer processType) {
    this.processType = processType;
  }

  public String getProcessId() {
    return this.processId;
  }

  public void setProcessId(String processId) {
    this.processId = processId;
  }

  public String getProcessName() {
    return this.processName;
  }

  public void setProcessName(String processName) {
    this.processName = processName;
  }

  public String getProcessEnName() {
    return this.processEnName;
  }

  public void setProcessEnName(String processEnName) {
    this.processEnName = processEnName;
  }

  public JobCustomizedData[] getCustomizedDataList() {
    return this.customizedDataList;
  }

  public void setCustomizedDataList(JobCustomizedData[] customizedDataList) {
    this.customizedDataList = customizedDataList;
  }

  public IdNameObject getJobFunction() {
    return this.jobFunction;
  }

  public void setJobFunction(IdNameObject jobFunction) {
    this.jobFunction = jobFunction;
  }

  public IdNameObject getSubject() {
    return this.subject;
  }

  public void setSubject(IdNameObject subject) {
    this.subject = subject;
  }

  public Integer getHeadCount() {
    return this.headCount;
  }

  public void setHeadCount(Integer headCount) {
    this.headCount = headCount;
  }

  public Integer getExperience() {
    return this.experience;
  }

  public void setExperience(Integer experience) {
    this.experience = experience;
  }

  public Integer getExpiryTime() {
    return this.expiryTime;
  }

  public void setExpiryTime(Integer expiryTime) {
    this.expiryTime = expiryTime;
  }

  public Integer getMinSalary() {
    return this.minSalary;
  }

  public void setMinSalary(Integer minSalary) {
    this.minSalary = minSalary;
  }

  public Integer getMaxSalary() {
    return this.maxSalary;
  }

  public void setMaxSalary(Integer maxSalary) {
    this.maxSalary = maxSalary;
  }

  public Integer getRequiredDegree() {
    return this.requiredDegree;
  }

  public void setRequiredDegree(Integer requiredDegree) {
    this.requiredDegree = requiredDegree;
  }

  public CodeNameObject[] getCityList() {
    return this.cityList;
  }

  public void setCityList(CodeNameObject[] cityList) {
    this.cityList = cityList;
  }

  public static class Builder {

    /**
     * 职位 ID
     * <p> 示例值：6001
     */
    private String id;
    /**
     * 职位名称
     * <p> 示例值：测试职位
     */
    private String title;
    /**
     * 职位描述
     * <p> 示例值：职位描述文本
     */
    private String description;
    /**
     * 职位编号
     * <p> 示例值：R18
     */
    private String code;
    /**
     * 职位要求
     * <p> 示例值：职位要求文本
     */
    private String requirement;
    /**
     * 雇佣类型
     * <p> 示例值：
     */
    private JobRecruitmentType recruitmentType;
    /**
     * 部门
     * <p> 示例值：
     */
    private JobDepartment department;
    /**
     * 工作地点
     * <p> 示例值：
     */
    private JobCity city;
    /**
     * 最低职级
     * <p> 示例值：
     */
    private JobLevel minJobLevel;
    /**
     * 最高职级
     * <p> 示例值：
     */
    private JobLevel maxJobLevel;
    /**
     * 职位亮点
     * <p> 示例值：
     */
    private JobHighlight[] highlightList;
    /**
     * 职位序列
     * <p> 示例值：
     */
    private JobCategory jobCategory;
    /**
     * 职位类别
     * <p> 示例值：
     */
    private JobType jobType;
    /**
     * 启用状态
     * <p> 示例值：1
     */
    private Integer activeStatus;
    /**
     * 创建人ID，若为空则为系统或其他对接系统创建
     * <p> 示例值：ou-xxx
     */
    private String createUserId;
    /**
     * 创建时间
     * <p> 示例值：1617170925462
     */
    private Integer createTime;
    /**
     * 更新时间
     * <p> 示例值：1617170925462
     */
    private Integer updateTime;
    /**
     * 招聘流程类型
     * <p> 示例值：1
     */
    private Integer processType;
    /**
     * 招聘流程 ID
     * <p> 示例值：1
     */
    private String processId;
    /**
     * 招聘流程中文名称
     * <p> 示例值：流程中文名
     */
    private String processName;
    /**
     * 招聘流程英文名称
     * <p> 示例值：流程英文名
     */
    private String processEnName;
    /**
     * 自定义字段列表
     * <p> 示例值：
     */
    private JobCustomizedData[] customizedDataList;
    /**
     * 职能分类
     * <p> 示例值：
     */
    private IdNameObject jobFunction;
    /**
     * 职位项目
     * <p> 示例值：
     */
    private IdNameObject subject;
    /**
     * 招聘数量
     * <p> 示例值：100
     */
    private Integer headCount;
    /**
     * 工作年限
     * <p> 示例值：1
     */
    private Integer experience;
    /**
     * 到期日期
     * <p> 示例值：1622484739955
     */
    private Integer expiryTime;
    /**
     * 最低薪资，单位:k
     * <p> 示例值：10
     */
    private Integer minSalary;
    /**
     * 最高薪资，单位:k
     * <p> 示例值：20
     */
    private Integer maxSalary;
    /**
     * 学历要求
     * <p> 示例值：1
     */
    private Integer requiredDegree;
    /**
     * 工作地点列表
     * <p> 示例值：
     */
    private CodeNameObject[] cityList;

    /**
     * 职位 ID
     * <p> 示例值：6001
     *
     * @param id
     * @return
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }


    /**
     * 职位名称
     * <p> 示例值：测试职位
     *
     * @param title
     * @return
     */
    public Builder title(String title) {
      this.title = title;
      return this;
    }


    /**
     * 职位描述
     * <p> 示例值：职位描述文本
     *
     * @param description
     * @return
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }


    /**
     * 职位编号
     * <p> 示例值：R18
     *
     * @param code
     * @return
     */
    public Builder code(String code) {
      this.code = code;
      return this;
    }


    /**
     * 职位要求
     * <p> 示例值：职位要求文本
     *
     * @param requirement
     * @return
     */
    public Builder requirement(String requirement) {
      this.requirement = requirement;
      return this;
    }


    /**
     * 雇佣类型
     * <p> 示例值：
     *
     * @param recruitmentType
     * @return
     */
    public Builder recruitmentType(JobRecruitmentType recruitmentType) {
      this.recruitmentType = recruitmentType;
      return this;
    }


    /**
     * 部门
     * <p> 示例值：
     *
     * @param department
     * @return
     */
    public Builder department(JobDepartment department) {
      this.department = department;
      return this;
    }


    /**
     * 工作地点
     * <p> 示例值：
     *
     * @param city
     * @return
     */
    public Builder city(JobCity city) {
      this.city = city;
      return this;
    }


    /**
     * 最低职级
     * <p> 示例值：
     *
     * @param minJobLevel
     * @return
     */
    public Builder minJobLevel(JobLevel minJobLevel) {
      this.minJobLevel = minJobLevel;
      return this;
    }


    /**
     * 最高职级
     * <p> 示例值：
     *
     * @param maxJobLevel
     * @return
     */
    public Builder maxJobLevel(JobLevel maxJobLevel) {
      this.maxJobLevel = maxJobLevel;
      return this;
    }


    /**
     * 职位亮点
     * <p> 示例值：
     *
     * @param highlightList
     * @return
     */
    public Builder highlightList(JobHighlight[] highlightList) {
      this.highlightList = highlightList;
      return this;
    }


    /**
     * 职位序列
     * <p> 示例值：
     *
     * @param jobCategory
     * @return
     */
    public Builder jobCategory(JobCategory jobCategory) {
      this.jobCategory = jobCategory;
      return this;
    }


    /**
     * 职位类别
     * <p> 示例值：
     *
     * @param jobType
     * @return
     */
    public Builder jobType(JobType jobType) {
      this.jobType = jobType;
      return this;
    }


    /**
     * 启用状态
     * <p> 示例值：1
     *
     * @param activeStatus
     * @return
     */
    public Builder activeStatus(Integer activeStatus) {
      this.activeStatus = activeStatus;
      return this;
    }


    /**
     * 创建人ID，若为空则为系统或其他对接系统创建
     * <p> 示例值：ou-xxx
     *
     * @param createUserId
     * @return
     */
    public Builder createUserId(String createUserId) {
      this.createUserId = createUserId;
      return this;
    }


    /**
     * 创建时间
     * <p> 示例值：1617170925462
     *
     * @param createTime
     * @return
     */
    public Builder createTime(Integer createTime) {
      this.createTime = createTime;
      return this;
    }


    /**
     * 更新时间
     * <p> 示例值：1617170925462
     *
     * @param updateTime
     * @return
     */
    public Builder updateTime(Integer updateTime) {
      this.updateTime = updateTime;
      return this;
    }


    /**
     * 招聘流程类型
     * <p> 示例值：1
     *
     * @param processType
     * @return
     */
    public Builder processType(Integer processType) {
      this.processType = processType;
      return this;
    }


    /**
     * 招聘流程 ID
     * <p> 示例值：1
     *
     * @param processId
     * @return
     */
    public Builder processId(String processId) {
      this.processId = processId;
      return this;
    }


    /**
     * 招聘流程中文名称
     * <p> 示例值：流程中文名
     *
     * @param processName
     * @return
     */
    public Builder processName(String processName) {
      this.processName = processName;
      return this;
    }


    /**
     * 招聘流程英文名称
     * <p> 示例值：流程英文名
     *
     * @param processEnName
     * @return
     */
    public Builder processEnName(String processEnName) {
      this.processEnName = processEnName;
      return this;
    }


    /**
     * 自定义字段列表
     * <p> 示例值：
     *
     * @param customizedDataList
     * @return
     */
    public Builder customizedDataList(JobCustomizedData[] customizedDataList) {
      this.customizedDataList = customizedDataList;
      return this;
    }


    /**
     * 职能分类
     * <p> 示例值：
     *
     * @param jobFunction
     * @return
     */
    public Builder jobFunction(IdNameObject jobFunction) {
      this.jobFunction = jobFunction;
      return this;
    }


    /**
     * 职位项目
     * <p> 示例值：
     *
     * @param subject
     * @return
     */
    public Builder subject(IdNameObject subject) {
      this.subject = subject;
      return this;
    }


    /**
     * 招聘数量
     * <p> 示例值：100
     *
     * @param headCount
     * @return
     */
    public Builder headCount(Integer headCount) {
      this.headCount = headCount;
      return this;
    }


    /**
     * 工作年限
     * <p> 示例值：1
     *
     * @param experience
     * @return
     */
    public Builder experience(Integer experience) {
      this.experience = experience;
      return this;
    }


    /**
     * 到期日期
     * <p> 示例值：1622484739955
     *
     * @param expiryTime
     * @return
     */
    public Builder expiryTime(Integer expiryTime) {
      this.expiryTime = expiryTime;
      return this;
    }


    /**
     * 最低薪资，单位:k
     * <p> 示例值：10
     *
     * @param minSalary
     * @return
     */
    public Builder minSalary(Integer minSalary) {
      this.minSalary = minSalary;
      return this;
    }


    /**
     * 最高薪资，单位:k
     * <p> 示例值：20
     *
     * @param maxSalary
     * @return
     */
    public Builder maxSalary(Integer maxSalary) {
      this.maxSalary = maxSalary;
      return this;
    }


    /**
     * 学历要求
     * <p> 示例值：1
     *
     * @param requiredDegree
     * @return
     */
    public Builder requiredDegree(Integer requiredDegree) {
      this.requiredDegree = requiredDegree;
      return this;
    }


    /**
     * 工作地点列表
     * <p> 示例值：
     *
     * @param cityList
     * @return
     */
    public Builder cityList(CodeNameObject[] cityList) {
      this.cityList = cityList;
      return this;
    }


    public Job build() {
      return new Job(this);
    }
  }
}
