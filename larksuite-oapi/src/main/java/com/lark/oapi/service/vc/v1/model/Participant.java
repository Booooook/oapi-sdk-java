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

public class Participant {
    /**
     * 参会者
     * <p> 示例值：kehan
     */
    @SerializedName("participant_name")
    private String participantName;
    /**
     * 部门
     * <p> 示例值：development
     */
    @SerializedName("department")
    private String department;
    /**
     * 用户ID
     * <p> 示例值：8efq90
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 工号
     * <p> 示例值：202205789
     */
    @SerializedName("employee_id")
    private String employeeId;
    /**
     * 电话
     * <p> 示例值：021-883889
     */
    @SerializedName("phone")
    private String phone;
    /**
     * 邮箱
     * <p> 示例值：xxxx@163.com
     */
    @SerializedName("email")
    private String email;
    /**
     * 设备
     * <p> 示例值：windows
     */
    @SerializedName("device")
    private String device;
    /**
     * 客户端版本
     * <p> 示例值：5.26.0-alpha.38
     */
    @SerializedName("app_version")
    private String appVersion;
    /**
     * 公网IP
     * <p> 示例值：27.xx.xx.183
     */
    @SerializedName("public_ip")
    private String publicIp;
    /**
     * 内网IP
     * <p> 示例值：192.xx.xx.13
     */
    @SerializedName("internal_ip")
    private String internalIp;
    /**
     * 代理服务
     * <p> 示例值：false
     */
    @SerializedName("use_rtc_proxy")
    private Boolean useRtcProxy;
    /**
     * 位置
     * <p> 示例值：东莞
     */
    @SerializedName("location")
    private String location;
    /**
     * 网络类型
     * <p> 示例值：wifi
     */
    @SerializedName("network_type")
    private String networkType;
    /**
     * 连接类型
     * <p> 示例值：udp
     */
    @SerializedName("protocol")
    private String protocol;
    /**
     * 麦克风
     * <p> 示例值：麦克风阵列 (Realtek(R) Audio)
     */
    @SerializedName("microphone")
    private String microphone;
    /**
     * 扬声器
     * <p> 示例值：扬声器 (Realtek(R) Audio)
     */
    @SerializedName("speaker")
    private String speaker;
    /**
     * 摄像头
     * <p> 示例值：HD Camera
     */
    @SerializedName("camera")
    private String camera;
    /**
     * 音频
     * <p> 示例值：true
     */
    @SerializedName("audio")
    private Boolean audio;
    /**
     * 视频
     * <p> 示例值：true
     */
    @SerializedName("video")
    private Boolean video;
    /**
     * 共享
     * <p> 示例值：false
     */
    @SerializedName("sharing")
    private Boolean sharing;
    /**
     * 入会时间
     * <p> 示例值：2022.12.23 11:16:59 (GMT+08:00)
     */
    @SerializedName("join_time")
    private String joinTime;
    /**
     * 离会时间
     * <p> 示例值：2022.12.23 11:18:51 (GMT+08:00)
     */
    @SerializedName("leave_time")
    private String leaveTime;
    /**
     * 参会时长
     * <p> 示例值：00:01:52
     */
    @SerializedName("time_in_meeting")
    private String timeInMeeting;
    /**
     * 离会原因
     * <p> 示例值：主持人结束会议
     */
    @SerializedName("leave_reason")
    private String leaveReason;

    // builder 开始
    public Participant() {
    }

    public Participant(Builder builder) {
        /**
         * 参会者
         * <p> 示例值：kehan
         */
        this.participantName = builder.participantName;
        /**
         * 部门
         * <p> 示例值：development
         */
        this.department = builder.department;
        /**
         * 用户ID
         * <p> 示例值：8efq90
         */
        this.userId = builder.userId;
        /**
         * 工号
         * <p> 示例值：202205789
         */
        this.employeeId = builder.employeeId;
        /**
         * 电话
         * <p> 示例值：021-883889
         */
        this.phone = builder.phone;
        /**
         * 邮箱
         * <p> 示例值：xxxx@163.com
         */
        this.email = builder.email;
        /**
         * 设备
         * <p> 示例值：windows
         */
        this.device = builder.device;
        /**
         * 客户端版本
         * <p> 示例值：5.26.0-alpha.38
         */
        this.appVersion = builder.appVersion;
        /**
         * 公网IP
         * <p> 示例值：27.xx.xx.183
         */
        this.publicIp = builder.publicIp;
        /**
         * 内网IP
         * <p> 示例值：192.xx.xx.13
         */
        this.internalIp = builder.internalIp;
        /**
         * 代理服务
         * <p> 示例值：false
         */
        this.useRtcProxy = builder.useRtcProxy;
        /**
         * 位置
         * <p> 示例值：东莞
         */
        this.location = builder.location;
        /**
         * 网络类型
         * <p> 示例值：wifi
         */
        this.networkType = builder.networkType;
        /**
         * 连接类型
         * <p> 示例值：udp
         */
        this.protocol = builder.protocol;
        /**
         * 麦克风
         * <p> 示例值：麦克风阵列 (Realtek(R) Audio)
         */
        this.microphone = builder.microphone;
        /**
         * 扬声器
         * <p> 示例值：扬声器 (Realtek(R) Audio)
         */
        this.speaker = builder.speaker;
        /**
         * 摄像头
         * <p> 示例值：HD Camera
         */
        this.camera = builder.camera;
        /**
         * 音频
         * <p> 示例值：true
         */
        this.audio = builder.audio;
        /**
         * 视频
         * <p> 示例值：true
         */
        this.video = builder.video;
        /**
         * 共享
         * <p> 示例值：false
         */
        this.sharing = builder.sharing;
        /**
         * 入会时间
         * <p> 示例值：2022.12.23 11:16:59 (GMT+08:00)
         */
        this.joinTime = builder.joinTime;
        /**
         * 离会时间
         * <p> 示例值：2022.12.23 11:18:51 (GMT+08:00)
         */
        this.leaveTime = builder.leaveTime;
        /**
         * 参会时长
         * <p> 示例值：00:01:52
         */
        this.timeInMeeting = builder.timeInMeeting;
        /**
         * 离会原因
         * <p> 示例值：主持人结束会议
         */
        this.leaveReason = builder.leaveReason;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getParticipantName() {
        return this.participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDevice() {
        return this.device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getPublicIp() {
        return this.publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public String getInternalIp() {
        return this.internalIp;
    }

    public void setInternalIp(String internalIp) {
        this.internalIp = internalIp;
    }

    public Boolean getUseRtcProxy() {
        return this.useRtcProxy;
    }

    public void setUseRtcProxy(Boolean useRtcProxy) {
        this.useRtcProxy = useRtcProxy;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getMicrophone() {
        return this.microphone;
    }

    public void setMicrophone(String microphone) {
        this.microphone = microphone;
    }

    public String getSpeaker() {
        return this.speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getCamera() {
        return this.camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public Boolean getAudio() {
        return this.audio;
    }

    public void setAudio(Boolean audio) {
        this.audio = audio;
    }

    public Boolean getVideo() {
        return this.video;
    }

    public void setVideo(Boolean video) {
        this.video = video;
    }

    public Boolean getSharing() {
        return this.sharing;
    }

    public void setSharing(Boolean sharing) {
        this.sharing = sharing;
    }

    public String getJoinTime() {
        return this.joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getLeaveTime() {
        return this.leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getTimeInMeeting() {
        return this.timeInMeeting;
    }

    public void setTimeInMeeting(String timeInMeeting) {
        this.timeInMeeting = timeInMeeting;
    }

    public String getLeaveReason() {
        return this.leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public static class Builder {
        /**
         * 参会者
         * <p> 示例值：kehan
         */
        private String participantName;
        /**
         * 部门
         * <p> 示例值：development
         */
        private String department;
        /**
         * 用户ID
         * <p> 示例值：8efq90
         */
        private String userId;
        /**
         * 工号
         * <p> 示例值：202205789
         */
        private String employeeId;
        /**
         * 电话
         * <p> 示例值：021-883889
         */
        private String phone;
        /**
         * 邮箱
         * <p> 示例值：xxxx@163.com
         */
        private String email;
        /**
         * 设备
         * <p> 示例值：windows
         */
        private String device;
        /**
         * 客户端版本
         * <p> 示例值：5.26.0-alpha.38
         */
        private String appVersion;
        /**
         * 公网IP
         * <p> 示例值：27.xx.xx.183
         */
        private String publicIp;
        /**
         * 内网IP
         * <p> 示例值：192.xx.xx.13
         */
        private String internalIp;
        /**
         * 代理服务
         * <p> 示例值：false
         */
        private Boolean useRtcProxy;
        /**
         * 位置
         * <p> 示例值：东莞
         */
        private String location;
        /**
         * 网络类型
         * <p> 示例值：wifi
         */
        private String networkType;
        /**
         * 连接类型
         * <p> 示例值：udp
         */
        private String protocol;
        /**
         * 麦克风
         * <p> 示例值：麦克风阵列 (Realtek(R) Audio)
         */
        private String microphone;
        /**
         * 扬声器
         * <p> 示例值：扬声器 (Realtek(R) Audio)
         */
        private String speaker;
        /**
         * 摄像头
         * <p> 示例值：HD Camera
         */
        private String camera;
        /**
         * 音频
         * <p> 示例值：true
         */
        private Boolean audio;
        /**
         * 视频
         * <p> 示例值：true
         */
        private Boolean video;
        /**
         * 共享
         * <p> 示例值：false
         */
        private Boolean sharing;
        /**
         * 入会时间
         * <p> 示例值：2022.12.23 11:16:59 (GMT+08:00)
         */
        private String joinTime;
        /**
         * 离会时间
         * <p> 示例值：2022.12.23 11:18:51 (GMT+08:00)
         */
        private String leaveTime;
        /**
         * 参会时长
         * <p> 示例值：00:01:52
         */
        private String timeInMeeting;
        /**
         * 离会原因
         * <p> 示例值：主持人结束会议
         */
        private String leaveReason;

        /**
         * 参会者
         * <p> 示例值：kehan
         *
         * @param participantName
         * @return
         */
        public Builder participantName(String participantName) {
            this.participantName = participantName;
            return this;
        }


        /**
         * 部门
         * <p> 示例值：development
         *
         * @param department
         * @return
         */
        public Builder department(String department) {
            this.department = department;
            return this;
        }


        /**
         * 用户ID
         * <p> 示例值：8efq90
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 工号
         * <p> 示例值：202205789
         *
         * @param employeeId
         * @return
         */
        public Builder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }


        /**
         * 电话
         * <p> 示例值：021-883889
         *
         * @param phone
         * @return
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }


        /**
         * 邮箱
         * <p> 示例值：xxxx@163.com
         *
         * @param email
         * @return
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }


        /**
         * 设备
         * <p> 示例值：windows
         *
         * @param device
         * @return
         */
        public Builder device(String device) {
            this.device = device;
            return this;
        }


        /**
         * 客户端版本
         * <p> 示例值：5.26.0-alpha.38
         *
         * @param appVersion
         * @return
         */
        public Builder appVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }


        /**
         * 公网IP
         * <p> 示例值：27.xx.xx.183
         *
         * @param publicIp
         * @return
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            return this;
        }


        /**
         * 内网IP
         * <p> 示例值：192.xx.xx.13
         *
         * @param internalIp
         * @return
         */
        public Builder internalIp(String internalIp) {
            this.internalIp = internalIp;
            return this;
        }


        /**
         * 代理服务
         * <p> 示例值：false
         *
         * @param useRtcProxy
         * @return
         */
        public Builder useRtcProxy(Boolean useRtcProxy) {
            this.useRtcProxy = useRtcProxy;
            return this;
        }


        /**
         * 位置
         * <p> 示例值：东莞
         *
         * @param location
         * @return
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }


        /**
         * 网络类型
         * <p> 示例值：wifi
         *
         * @param networkType
         * @return
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }


        /**
         * 连接类型
         * <p> 示例值：udp
         *
         * @param protocol
         * @return
         */
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }


        /**
         * 麦克风
         * <p> 示例值：麦克风阵列 (Realtek(R) Audio)
         *
         * @param microphone
         * @return
         */
        public Builder microphone(String microphone) {
            this.microphone = microphone;
            return this;
        }


        /**
         * 扬声器
         * <p> 示例值：扬声器 (Realtek(R) Audio)
         *
         * @param speaker
         * @return
         */
        public Builder speaker(String speaker) {
            this.speaker = speaker;
            return this;
        }


        /**
         * 摄像头
         * <p> 示例值：HD Camera
         *
         * @param camera
         * @return
         */
        public Builder camera(String camera) {
            this.camera = camera;
            return this;
        }


        /**
         * 音频
         * <p> 示例值：true
         *
         * @param audio
         * @return
         */
        public Builder audio(Boolean audio) {
            this.audio = audio;
            return this;
        }


        /**
         * 视频
         * <p> 示例值：true
         *
         * @param video
         * @return
         */
        public Builder video(Boolean video) {
            this.video = video;
            return this;
        }


        /**
         * 共享
         * <p> 示例值：false
         *
         * @param sharing
         * @return
         */
        public Builder sharing(Boolean sharing) {
            this.sharing = sharing;
            return this;
        }


        /**
         * 入会时间
         * <p> 示例值：2022.12.23 11:16:59 (GMT+08:00)
         *
         * @param joinTime
         * @return
         */
        public Builder joinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }


        /**
         * 离会时间
         * <p> 示例值：2022.12.23 11:18:51 (GMT+08:00)
         *
         * @param leaveTime
         * @return
         */
        public Builder leaveTime(String leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }


        /**
         * 参会时长
         * <p> 示例值：00:01:52
         *
         * @param timeInMeeting
         * @return
         */
        public Builder timeInMeeting(String timeInMeeting) {
            this.timeInMeeting = timeInMeeting;
            return this;
        }


        /**
         * 离会原因
         * <p> 示例值：主持人结束会议
         *
         * @param leaveReason
         * @return
         */
        public Builder leaveReason(String leaveReason) {
            this.leaveReason = leaveReason;
            return this;
        }


        public Participant build() {
            return new Participant(this);
        }
    }
}