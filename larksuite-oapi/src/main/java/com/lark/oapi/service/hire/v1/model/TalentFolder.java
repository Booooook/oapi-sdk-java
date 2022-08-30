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

public class TalentFolder {

  /**
   * 外部ID
   * <p> 示例值：
   */
  @SerializedName("external_id")
  private String externalId;
  /**
   * 名字
   * <p> 示例值：人才文件夹A1
   */
  @SerializedName("name")
  private String name;
  /**
   * 父ID
   * <p> 示例值：
   */
  @SerializedName("parent_id")
  private String parentId;
  /**
   * 创建人 ID
   * <p> 示例值：
   */
  @SerializedName("creator_id")
  private String creatorId;
  /**
   * 文件夹ID
   * <p> 示例值：7041806543797995820
   */
  @SerializedName("folder_id")
  private String folderId;
  /**
   * 所有者ID
   * <p> 示例值：ou_85bb308c57f597471cd2bb5b4f580245
   */
  @SerializedName("owner_id")
  private String ownerId;

  // builder 开始
  public TalentFolder() {
  }

  public TalentFolder(Builder builder) {
    /**
     * 外部ID
     * <p> 示例值：
     */
    this.externalId = builder.externalId;
    /**
     * 名字
     * <p> 示例值：人才文件夹A1
     */
    this.name = builder.name;
    /**
     * 父ID
     * <p> 示例值：
     */
    this.parentId = builder.parentId;
    /**
     * 创建人 ID
     * <p> 示例值：
     */
    this.creatorId = builder.creatorId;
    /**
     * 文件夹ID
     * <p> 示例值：7041806543797995820
     */
    this.folderId = builder.folderId;
    /**
     * 所有者ID
     * <p> 示例值：ou_85bb308c57f597471cd2bb5b4f580245
     */
    this.ownerId = builder.ownerId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getExternalId() {
    return this.externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getParentId() {
    return this.parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public String getCreatorId() {
    return this.creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public String getFolderId() {
    return this.folderId;
  }

  public void setFolderId(String folderId) {
    this.folderId = folderId;
  }

  public String getOwnerId() {
    return this.ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public static class Builder {

    /**
     * 外部ID
     * <p> 示例值：
     */
    private String externalId;
    /**
     * 名字
     * <p> 示例值：人才文件夹A1
     */
    private String name;
    /**
     * 父ID
     * <p> 示例值：
     */
    private String parentId;
    /**
     * 创建人 ID
     * <p> 示例值：
     */
    private String creatorId;
    /**
     * 文件夹ID
     * <p> 示例值：7041806543797995820
     */
    private String folderId;
    /**
     * 所有者ID
     * <p> 示例值：ou_85bb308c57f597471cd2bb5b4f580245
     */
    private String ownerId;

    /**
     * 外部ID
     * <p> 示例值：
     *
     * @param externalId
     * @return
     */
    public Builder externalId(String externalId) {
      this.externalId = externalId;
      return this;
    }


    /**
     * 名字
     * <p> 示例值：人才文件夹A1
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 父ID
     * <p> 示例值：
     *
     * @param parentId
     * @return
     */
    public Builder parentId(String parentId) {
      this.parentId = parentId;
      return this;
    }


    /**
     * 创建人 ID
     * <p> 示例值：
     *
     * @param creatorId
     * @return
     */
    public Builder creatorId(String creatorId) {
      this.creatorId = creatorId;
      return this;
    }


    /**
     * 文件夹ID
     * <p> 示例值：7041806543797995820
     *
     * @param folderId
     * @return
     */
    public Builder folderId(String folderId) {
      this.folderId = folderId;
      return this;
    }


    /**
     * 所有者ID
     * <p> 示例值：ou_85bb308c57f597471cd2bb5b4f580245
     *
     * @param ownerId
     * @return
     */
    public Builder ownerId(String ownerId) {
      this.ownerId = ownerId;
      return this;
    }


    public TalentFolder build() {
      return new TalentFolder(this);
    }
  }
}
