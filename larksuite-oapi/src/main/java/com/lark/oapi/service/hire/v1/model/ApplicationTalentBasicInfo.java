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

public class ApplicationTalentBasicInfo {

  /**
   * 名字
   * <p> 示例值：
   */
  @SerializedName("name")
  private String name;
  /**
   * 手机
   * <p> 示例值：
   */
  @SerializedName("mobile")
  private String mobile;
  /**
   * 手机国家代码
   * <p> 示例值：
   */
  @SerializedName("mobile_country_code")
  private String mobileCountryCode;
  /**
   * 邮箱
   * <p> 示例值：
   */
  @SerializedName("email")
  private String email;
  /**
   * 工作年限
   * <p> 示例值：
   */
  @SerializedName("experience_years")
  private Integer experienceYears;
  /**
   * 年龄
   * <p> 示例值：
   */
  @SerializedName("age")
  private Integer age;
  /**
   * 国籍
   * <p> 示例值：
   */
  @SerializedName("nationality")
  private Nationality nationality;
  /**
   * 性别
   * <p> 示例值：
   */
  @SerializedName("gender")
  private Integer gender;
  /**
   * 现居住城市
   * <p> 示例值：
   */
  @SerializedName("current_city")
  private City currentCity;
  /**
   * 家乡所在城市
   * <p> 示例值：
   */
  @SerializedName("hometown_city")
  private City hometownCity;
  /**
   * 首选城市
   * <p> 示例值：
   */
  @SerializedName("preferred_city_list")
  private City[] preferredCityList;
  /**
   * 手机国家代码
   * <p> 示例值：
   */
  @SerializedName("mobile_code")
  private String mobileCode;
  /**
   * 证件类型
   * <p> 示例值：
   */
  @SerializedName("identification_type")
  private Integer identificationType;
  /**
   * 证件号码
   * <p> 示例值：
   */
  @SerializedName("identification_number")
  private String identificationNumber;

  // builder 开始
  public ApplicationTalentBasicInfo() {
  }

  public ApplicationTalentBasicInfo(Builder builder) {
    /**
     * 名字
     * <p> 示例值：
     */
    this.name = builder.name;
    /**
     * 手机
     * <p> 示例值：
     */
    this.mobile = builder.mobile;
    /**
     * 手机国家代码
     * <p> 示例值：
     */
    this.mobileCountryCode = builder.mobileCountryCode;
    /**
     * 邮箱
     * <p> 示例值：
     */
    this.email = builder.email;
    /**
     * 工作年限
     * <p> 示例值：
     */
    this.experienceYears = builder.experienceYears;
    /**
     * 年龄
     * <p> 示例值：
     */
    this.age = builder.age;
    /**
     * 国籍
     * <p> 示例值：
     */
    this.nationality = builder.nationality;
    /**
     * 性别
     * <p> 示例值：
     */
    this.gender = builder.gender;
    /**
     * 现居住城市
     * <p> 示例值：
     */
    this.currentCity = builder.currentCity;
    /**
     * 家乡所在城市
     * <p> 示例值：
     */
    this.hometownCity = builder.hometownCity;
    /**
     * 首选城市
     * <p> 示例值：
     */
    this.preferredCityList = builder.preferredCityList;
    /**
     * 手机国家代码
     * <p> 示例值：
     */
    this.mobileCode = builder.mobileCode;
    /**
     * 证件类型
     * <p> 示例值：
     */
    this.identificationType = builder.identificationType;
    /**
     * 证件号码
     * <p> 示例值：
     */
    this.identificationNumber = builder.identificationNumber;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getMobileCountryCode() {
    return this.mobileCountryCode;
  }

  public void setMobileCountryCode(String mobileCountryCode) {
    this.mobileCountryCode = mobileCountryCode;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getExperienceYears() {
    return this.experienceYears;
  }

  public void setExperienceYears(Integer experienceYears) {
    this.experienceYears = experienceYears;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Nationality getNationality() {
    return this.nationality;
  }

  public void setNationality(Nationality nationality) {
    this.nationality = nationality;
  }

  public Integer getGender() {
    return this.gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

  public City getCurrentCity() {
    return this.currentCity;
  }

  public void setCurrentCity(City currentCity) {
    this.currentCity = currentCity;
  }

  public City getHometownCity() {
    return this.hometownCity;
  }

  public void setHometownCity(City hometownCity) {
    this.hometownCity = hometownCity;
  }

  public City[] getPreferredCityList() {
    return this.preferredCityList;
  }

  public void setPreferredCityList(City[] preferredCityList) {
    this.preferredCityList = preferredCityList;
  }

  public String getMobileCode() {
    return this.mobileCode;
  }

  public void setMobileCode(String mobileCode) {
    this.mobileCode = mobileCode;
  }

  public Integer getIdentificationType() {
    return this.identificationType;
  }

  public void setIdentificationType(Integer identificationType) {
    this.identificationType = identificationType;
  }

  public String getIdentificationNumber() {
    return this.identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public static class Builder {

    /**
     * 名字
     * <p> 示例值：
     */
    private String name;
    /**
     * 手机
     * <p> 示例值：
     */
    private String mobile;
    /**
     * 手机国家代码
     * <p> 示例值：
     */
    private String mobileCountryCode;
    /**
     * 邮箱
     * <p> 示例值：
     */
    private String email;
    /**
     * 工作年限
     * <p> 示例值：
     */
    private Integer experienceYears;
    /**
     * 年龄
     * <p> 示例值：
     */
    private Integer age;
    /**
     * 国籍
     * <p> 示例值：
     */
    private Nationality nationality;
    /**
     * 性别
     * <p> 示例值：
     */
    private Integer gender;
    /**
     * 现居住城市
     * <p> 示例值：
     */
    private City currentCity;
    /**
     * 家乡所在城市
     * <p> 示例值：
     */
    private City hometownCity;
    /**
     * 首选城市
     * <p> 示例值：
     */
    private City[] preferredCityList;
    /**
     * 手机国家代码
     * <p> 示例值：
     */
    private String mobileCode;
    /**
     * 证件类型
     * <p> 示例值：
     */
    private Integer identificationType;
    /**
     * 证件号码
     * <p> 示例值：
     */
    private String identificationNumber;

    /**
     * 名字
     * <p> 示例值：
     *
     * @param name
     * @return
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }


    /**
     * 手机
     * <p> 示例值：
     *
     * @param mobile
     * @return
     */
    public Builder mobile(String mobile) {
      this.mobile = mobile;
      return this;
    }


    /**
     * 手机国家代码
     * <p> 示例值：
     *
     * @param mobileCountryCode
     * @return
     */
    public Builder mobileCountryCode(String mobileCountryCode) {
      this.mobileCountryCode = mobileCountryCode;
      return this;
    }


    /**
     * 邮箱
     * <p> 示例值：
     *
     * @param email
     * @return
     */
    public Builder email(String email) {
      this.email = email;
      return this;
    }


    /**
     * 工作年限
     * <p> 示例值：
     *
     * @param experienceYears
     * @return
     */
    public Builder experienceYears(Integer experienceYears) {
      this.experienceYears = experienceYears;
      return this;
    }


    /**
     * 年龄
     * <p> 示例值：
     *
     * @param age
     * @return
     */
    public Builder age(Integer age) {
      this.age = age;
      return this;
    }


    /**
     * 国籍
     * <p> 示例值：
     *
     * @param nationality
     * @return
     */
    public Builder nationality(Nationality nationality) {
      this.nationality = nationality;
      return this;
    }


    /**
     * 性别
     * <p> 示例值：
     *
     * @param gender
     * @return
     */
    public Builder gender(Integer gender) {
      this.gender = gender;
      return this;
    }


    /**
     * 现居住城市
     * <p> 示例值：
     *
     * @param currentCity
     * @return
     */
    public Builder currentCity(City currentCity) {
      this.currentCity = currentCity;
      return this;
    }


    /**
     * 家乡所在城市
     * <p> 示例值：
     *
     * @param hometownCity
     * @return
     */
    public Builder hometownCity(City hometownCity) {
      this.hometownCity = hometownCity;
      return this;
    }


    /**
     * 首选城市
     * <p> 示例值：
     *
     * @param preferredCityList
     * @return
     */
    public Builder preferredCityList(City[] preferredCityList) {
      this.preferredCityList = preferredCityList;
      return this;
    }


    /**
     * 手机国家代码
     * <p> 示例值：
     *
     * @param mobileCode
     * @return
     */
    public Builder mobileCode(String mobileCode) {
      this.mobileCode = mobileCode;
      return this;
    }


    /**
     * 证件类型
     * <p> 示例值：
     *
     * @param identificationType
     * @return
     */
    public Builder identificationType(Integer identificationType) {
      this.identificationType = identificationType;
      return this;
    }


    /**
     * 证件号码
     * <p> 示例值：
     *
     * @param identificationNumber
     * @return
     */
    public Builder identificationNumber(String identificationNumber) {
      this.identificationNumber = identificationNumber;
      return this;
    }


    public ApplicationTalentBasicInfo build() {
      return new ApplicationTalentBasicInfo(this);
    }
  }
}
