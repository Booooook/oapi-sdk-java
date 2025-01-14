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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class SubscribeUser {
    /**
     * 审批人/预定人id
     * <p> 示例值：ou_a27b07a9071d90577c0177bcec98f856
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 预订人姓名
     * <p> 示例值：
     */
    @SerializedName("user_name")
    private String userName;

    // builder 开始
    public SubscribeUser() {
    }

    public SubscribeUser(Builder builder) {
        /**
         * 审批人/预定人id
         * <p> 示例值：ou_a27b07a9071d90577c0177bcec98f856
         */
        this.userId = builder.userId;
        /**
         * 预订人姓名
         * <p> 示例值：
         */
        this.userName = builder.userName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public static class Builder {
        /**
         * 审批人/预定人id
         * <p> 示例值：ou_a27b07a9071d90577c0177bcec98f856
         */
        private String userId;
        /**
         * 预订人姓名
         * <p> 示例值：
         */
        private String userName;

        /**
         * 审批人/预定人id
         * <p> 示例值：ou_a27b07a9071d90577c0177bcec98f856
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 预订人姓名
         * <p> 示例值：
         *
         * @param userName
         * @return
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }


        public SubscribeUser build() {
            return new SubscribeUser(this);
        }
    }
}
