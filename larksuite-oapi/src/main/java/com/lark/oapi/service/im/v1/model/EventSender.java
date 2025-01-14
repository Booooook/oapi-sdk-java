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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class EventSender {
    /**
     * 用户 ID
     * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
     */
    @SerializedName("sender_id")
    private UserId senderId;
    /**
     * 消息发送者类型。目前只支持用户(user)发送的消息。
     * <p> 示例值：user
     */
    @SerializedName("sender_type")
    private String senderType;
    /**
     * tenant key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
     * <p> 示例值：736588c9260f175e
     */
    @SerializedName("tenant_key")
    private String tenantKey;

    // builder 开始
    public EventSender() {
    }

    public EventSender(Builder builder) {
        /**
         * 用户 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         */
        this.senderId = builder.senderId;
        /**
         * 消息发送者类型。目前只支持用户(user)发送的消息。
         * <p> 示例值：user
         */
        this.senderType = builder.senderType;
        /**
         * tenant key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        this.tenantKey = builder.tenantKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UserId getSenderId() {
        return this.senderId;
    }

    public void setSenderId(UserId senderId) {
        this.senderId = senderId;
    }

    public String getSenderType() {
        return this.senderType;
    }

    public void setSenderType(String senderType) {
        this.senderType = senderType;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public static class Builder {
        /**
         * 用户 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         */
        private UserId senderId;
        /**
         * 消息发送者类型。目前只支持用户(user)发送的消息。
         * <p> 示例值：user
         */
        private String senderType;
        /**
         * tenant key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        private String tenantKey;

        /**
         * 用户 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         *
         * @param senderId
         * @return
         */
        public Builder senderId(UserId senderId) {
            this.senderId = senderId;
            return this;
        }


        /**
         * 消息发送者类型。目前只支持用户(user)发送的消息。
         * <p> 示例值：user
         *
         * @param senderType
         * @return
         */
        public Builder senderType(String senderType) {
            this.senderType = senderType;
            return this;
        }


        /**
         * tenant key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         *
         * @param tenantKey
         * @return
         */
        public Builder tenantKey(String tenantKey) {
            this.tenantKey = tenantKey;
            return this;
        }


        public EventSender build() {
            return new EventSender(this);
        }
    }
}
