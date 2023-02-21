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
import com.lark.oapi.core.annotation.Query;

public class ListRoomLevelReq {
    /**
     * 层级ID，当需要获取租户下层级列表时，room_level_id可传空
     * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
     */
    @Query
    @SerializedName("room_level_id")
    private String roomLevelId;
    /**
     * 分页尺寸大小
     * <p> 示例值：10
     */
    @Query
    @SerializedName("page_size")
    private Integer pageSize;
    /**
     * 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
     * <p> 示例值：
     */
    @Query
    @SerializedName("page_token")
    private String pageToken;

    // builder 开始
    public ListRoomLevelReq() {
    }

    public ListRoomLevelReq(Builder builder) {
        /**
         * 层级ID，当需要获取租户下层级列表时，room_level_id可传空
         * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
         */
        this.roomLevelId = builder.roomLevelId;
        /**
         * 分页尺寸大小
         * <p> 示例值：10
         */
        this.pageSize = builder.pageSize;
        /**
         * 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
         * <p> 示例值：
         */
        this.pageToken = builder.pageToken;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRoomLevelId() {
        return this.roomLevelId;
    }

    public void setRoomLevelId(String roomLevelId) {
        this.roomLevelId = roomLevelId;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageToken() {
        return this.pageToken;
    }

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    public static class Builder {
        private String roomLevelId; // 层级ID，当需要获取租户下层级列表时，room_level_id可传空
        private Integer pageSize; // 分页尺寸大小
        private String pageToken; // 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果


        /**
         * 层级ID，当需要获取租户下层级列表时，room_level_id可传空
         * <p> 示例值：omb_4ad1a2c7a2fbc5fc9570f38456931293
         *
         * @param roomLevelId
         * @return
         */
        public Builder roomLevelId(String roomLevelId) {
            this.roomLevelId = roomLevelId;
            return this;
        }


        /**
         * 分页尺寸大小
         * <p> 示例值：10
         *
         * @param pageSize
         * @return
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }


        /**
         * 分页标记,第一次请求不填,表示从头开始遍历.下次遍历可采用该 page_token获取查询结果
         * <p> 示例值：
         *
         * @param pageToken
         * @return
         */
        public Builder pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        public ListRoomLevelReq build() {
            return new ListRoomLevelReq(this);
        }
    }
}