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

public class GetInstance {

  @SerializedName("approval_name")
  private String approvalName;
  @SerializedName("start_time")
  private String startTime;
  @SerializedName("end_time")
  private String endTime;
  @SerializedName("user_id")
  private String userId;
  @SerializedName("open_id")
  private String openId;
  @SerializedName("serial_number")
  private String serialNumber;
  @SerializedName("department_id")
  private String departmentId;
  @SerializedName("status")
  private String status;
  @SerializedName("uuid")
  private String uuid;
  @SerializedName("form")
  private String form;
  @SerializedName("task_list")
  private InstanceTask[] taskList;
  @SerializedName("comment_list")
  private InstanceComment[] commentList;
  @SerializedName("timeline")
  private InstanceTimeline[] timeline;
  @SerializedName("modified_instance_code")
  private String modifiedInstanceCode;
  @SerializedName("reverted_instance_code")
  private String revertedInstanceCode;
  @SerializedName("approval_code")
  private String approvalCode;
  @SerializedName("reverted")
  private Boolean reverted;

  public String getApprovalName() {
    return this.approvalName;
  }

  public void setApprovalName(String approvalName) {
    this.approvalName = approvalName;
  }

  public String getStartTime() {
    return this.startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return this.endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getUserId() {
    return this.userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getOpenId() {
    return this.openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public String getSerialNumber() {
    return this.serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String getDepartmentId() {
    return this.departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getUuid() {
    return this.uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getForm() {
    return this.form;
  }

  public void setForm(String form) {
    this.form = form;
  }

  public InstanceTask[] getTaskList() {
    return this.taskList;
  }

  public void setTaskList(InstanceTask[] taskList) {
    this.taskList = taskList;
  }

  public InstanceComment[] getCommentList() {
    return this.commentList;
  }

  public void setCommentList(InstanceComment[] commentList) {
    this.commentList = commentList;
  }

  public InstanceTimeline[] getTimeline() {
    return this.timeline;
  }

  public void setTimeline(InstanceTimeline[] timeline) {
    this.timeline = timeline;
  }

  public String getModifiedInstanceCode() {
    return this.modifiedInstanceCode;
  }

  public void setModifiedInstanceCode(String modifiedInstanceCode) {
    this.modifiedInstanceCode = modifiedInstanceCode;
  }

  public String getRevertedInstanceCode() {
    return this.revertedInstanceCode;
  }

  public void setRevertedInstanceCode(String revertedInstanceCode) {
    this.revertedInstanceCode = revertedInstanceCode;
  }

  public String getApprovalCode() {
    return this.approvalCode;
  }

  public void setApprovalCode(String approvalCode) {
    this.approvalCode = approvalCode;
  }

  public Boolean getReverted() {
    return this.reverted;
  }

  public void setReverted(Boolean reverted) {
    this.reverted = reverted;
  }

}