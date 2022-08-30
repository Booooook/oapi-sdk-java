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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class CellValue {

  /**
   * 元素类型
   * <p> 示例值：text
   */
  @SerializedName("type")
  private String type;
  /**
   * <p> 示例值：
   */
  @SerializedName("text")
  private Text text;
  /**
   * <p> 示例值：
   */
  @SerializedName("mention_user")
  private MentionUser mentionUser;
  /**
   * <p> 示例值：
   */
  @SerializedName("mention_document")
  private MentionDocument mentionDocument;
  /**
   * <p> 示例值：
   */
  @SerializedName("value")
  private ValueElement value;
  /**
   * <p> 示例值：
   */
  @SerializedName("date_time")
  private DateTime dateTime;
  /**
   * <p> 示例值：
   */
  @SerializedName("file")
  private File file;
  /**
   * <p> 示例值：
   */
  @SerializedName("image")
  private Image image;
  /**
   * <p> 示例值：
   */
  @SerializedName("link")
  private Link link;
  /**
   * <p> 示例值：
   */
  @SerializedName("reminder")
  private Reminder reminder;
  /**
   * <p> 示例值：
   */
  @SerializedName("formula")
  private Formula formula;

  // builder 开始
  public CellValue() {
  }

  public CellValue(Builder builder) {
    /**
     * 元素类型
     * <p> 示例值：text
     */
    this.type = builder.type;
    /**
     *
     * <p> 示例值：
     */
    this.text = builder.text;
    /**
     *
     * <p> 示例值：
     */
    this.mentionUser = builder.mentionUser;
    /**
     *
     * <p> 示例值：
     */
    this.mentionDocument = builder.mentionDocument;
    /**
     *
     * <p> 示例值：
     */
    this.value = builder.value;
    /**
     *
     * <p> 示例值：
     */
    this.dateTime = builder.dateTime;
    /**
     *
     * <p> 示例值：
     */
    this.file = builder.file;
    /**
     *
     * <p> 示例值：
     */
    this.image = builder.image;
    /**
     *
     * <p> 示例值：
     */
    this.link = builder.link;
    /**
     *
     * <p> 示例值：
     */
    this.reminder = builder.reminder;
    /**
     *
     * <p> 示例值：
     */
    this.formula = builder.formula;
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

  public Text getText() {
    return this.text;
  }

  public void setText(Text text) {
    this.text = text;
  }

  public MentionUser getMentionUser() {
    return this.mentionUser;
  }

  public void setMentionUser(MentionUser mentionUser) {
    this.mentionUser = mentionUser;
  }

  public MentionDocument getMentionDocument() {
    return this.mentionDocument;
  }

  public void setMentionDocument(MentionDocument mentionDocument) {
    this.mentionDocument = mentionDocument;
  }

  public ValueElement getValue() {
    return this.value;
  }

  public void setValue(ValueElement value) {
    this.value = value;
  }

  public DateTime getDateTime() {
    return this.dateTime;
  }

  public void setDateTime(DateTime dateTime) {
    this.dateTime = dateTime;
  }

  public File getFile() {
    return this.file;
  }

  public void setFile(File file) {
    this.file = file;
  }

  public Image getImage() {
    return this.image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public Link getLink() {
    return this.link;
  }

  public void setLink(Link link) {
    this.link = link;
  }

  public Reminder getReminder() {
    return this.reminder;
  }

  public void setReminder(Reminder reminder) {
    this.reminder = reminder;
  }

  public Formula getFormula() {
    return this.formula;
  }

  public void setFormula(Formula formula) {
    this.formula = formula;
  }

  public static class Builder {

    /**
     * 元素类型
     * <p> 示例值：text
     */
    private String type;
    /**
     * <p> 示例值：
     */
    private Text text;
    /**
     * <p> 示例值：
     */
    private MentionUser mentionUser;
    /**
     * <p> 示例值：
     */
    private MentionDocument mentionDocument;
    /**
     * <p> 示例值：
     */
    private ValueElement value;
    /**
     * <p> 示例值：
     */
    private DateTime dateTime;
    /**
     * <p> 示例值：
     */
    private File file;
    /**
     * <p> 示例值：
     */
    private Image image;
    /**
     * <p> 示例值：
     */
    private Link link;
    /**
     * <p> 示例值：
     */
    private Reminder reminder;
    /**
     * <p> 示例值：
     */
    private Formula formula;

    /**
     * 元素类型
     * <p> 示例值：text
     *
     * @param type
     * @return
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param text
     * @return
     */
    public Builder text(Text text) {
      this.text = text;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param mentionUser
     * @return
     */
    public Builder mentionUser(MentionUser mentionUser) {
      this.mentionUser = mentionUser;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param mentionDocument
     * @return
     */
    public Builder mentionDocument(MentionDocument mentionDocument) {
      this.mentionDocument = mentionDocument;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param value
     * @return
     */
    public Builder value(ValueElement value) {
      this.value = value;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param dateTime
     * @return
     */
    public Builder dateTime(DateTime dateTime) {
      this.dateTime = dateTime;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param file
     * @return
     */
    public Builder file(File file) {
      this.file = file;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param image
     * @return
     */
    public Builder image(Image image) {
      this.image = image;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param link
     * @return
     */
    public Builder link(Link link) {
      this.link = link;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param reminder
     * @return
     */
    public Builder reminder(Reminder reminder) {
      this.reminder = reminder;
      return this;
    }


    /**
     * <p> 示例值：
     *
     * @param formula
     * @return
     */
    public Builder formula(Formula formula) {
      this.formula = formula;
      return this;
    }


    public CellValue build() {
      return new CellValue(this);
    }
  }
}