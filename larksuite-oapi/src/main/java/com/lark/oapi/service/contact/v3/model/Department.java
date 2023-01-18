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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;

public class Department {
    /**
     * 部门名称
     * <p> 示例值：DemoName
     */
    @SerializedName("name")
    private String name;
    /**
     * 国际化的部门名称
     * <p> 示例值：
     */
    @SerializedName("i18n_name")
    private DepartmentI18nName i18nName;
    /**
     * 父部门的ID;;* 在根部门下创建新部门，该参数值为 “0”
     * <p> 示例值：D067
     */
    @SerializedName("parent_department_id")
    private String parentDepartmentId;
    /**
     * 本部门的自定义部门ID;;注意：除需要满足正则规则外，同时不能以`od-`开头
     * <p> 示例值：D096
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 部门的open_id，类型与通过请求的查询参数传入的department_id_type相同
     * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
     */
    @SerializedName("open_department_id")
    private String openDepartmentId;
    /**
     * 部门主管用户ID
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("leader_user_id")
    private String leaderUserId;
    /**
     * 部门群ID
     * <p> 示例值：oc_5ad11d72b830411d72b836c20
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 部门的排序，即部门在其同级部门的展示顺序
     * <p> 示例值：100
     */
    @SerializedName("order")
    private String order;
    /**
     * 部门单位自定义ID列表，当前只支持一个
     * <p> 示例值：custom_unit_id
     */
    @SerializedName("unit_ids")
    private String[] unitIds;
    /**
     * 部门下用户的个数
     * <p> 示例值：100
     */
    @SerializedName("member_count")
    private Integer memberCount;
    /**
     * 部门状态
     * <p> 示例值：
     */
    @SerializedName("status")
    private DepartmentStatus status;
    /**
     * 是否创建部门群，默认不创建
     * <p> 示例值：false
     */
    @SerializedName("create_group_chat")
    private Boolean createGroupChat;
    /**
     * 部门负责人
     * <p> 示例值：
     */
    @SerializedName("leaders")
    private DepartmentLeader[] leaders;
    /**
     * 部门群雇员类型限制。[]空列表时，表示为无任何雇员类型。类型字段可包含以下值，支持多个类型值；若有多个，用英文','分隔：;1、正式员工;2、实习生;3、外包;4、劳务;5、顾问;6、其他自定义类型字段，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)。
     * <p> 示例值：[1,2,3]
     */
    @SerializedName("group_chat_employee_types")
    private Integer[] groupChatEmployeeTypes;
    /**
     * 部门HRBP
     * <p> 示例值：
     */
    @SerializedName("department_hrbps")
    private String[] departmentHrbps;

    // builder 开始
    public Department() {
    }

    public Department(Builder builder) {
        /**
         * 部门名称
         * <p> 示例值：DemoName
         */
        this.name = builder.name;
        /**
         * 国际化的部门名称
         * <p> 示例值：
         */
        this.i18nName = builder.i18nName;
        /**
         * 父部门的ID;;* 在根部门下创建新部门，该参数值为 “0”
         * <p> 示例值：D067
         */
        this.parentDepartmentId = builder.parentDepartmentId;
        /**
         * 本部门的自定义部门ID;;注意：除需要满足正则规则外，同时不能以`od-`开头
         * <p> 示例值：D096
         */
        this.departmentId = builder.departmentId;
        /**
         * 部门的open_id，类型与通过请求的查询参数传入的department_id_type相同
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        this.openDepartmentId = builder.openDepartmentId;
        /**
         * 部门主管用户ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.leaderUserId = builder.leaderUserId;
        /**
         * 部门群ID
         * <p> 示例值：oc_5ad11d72b830411d72b836c20
         */
        this.chatId = builder.chatId;
        /**
         * 部门的排序，即部门在其同级部门的展示顺序
         * <p> 示例值：100
         */
        this.order = builder.order;
        /**
         * 部门单位自定义ID列表，当前只支持一个
         * <p> 示例值：custom_unit_id
         */
        this.unitIds = builder.unitIds;
        /**
         * 部门下用户的个数
         * <p> 示例值：100
         */
        this.memberCount = builder.memberCount;
        /**
         * 部门状态
         * <p> 示例值：
         */
        this.status = builder.status;
        /**
         * 是否创建部门群，默认不创建
         * <p> 示例值：false
         */
        this.createGroupChat = builder.createGroupChat;
        /**
         * 部门负责人
         * <p> 示例值：
         */
        this.leaders = builder.leaders;
        /**
         * 部门群雇员类型限制。[]空列表时，表示为无任何雇员类型。类型字段可包含以下值，支持多个类型值；若有多个，用英文','分隔：;1、正式员工;2、实习生;3、外包;4、劳务;5、顾问;6、其他自定义类型字段，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)。
         * <p> 示例值：[1,2,3]
         */
        this.groupChatEmployeeTypes = builder.groupChatEmployeeTypes;
        /**
         * 部门HRBP
         * <p> 示例值：
         */
        this.departmentHrbps = builder.departmentHrbps;
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

    public DepartmentI18nName getI18nName() {
        return this.i18nName;
    }

    public void setI18nName(DepartmentI18nName i18nName) {
        this.i18nName = i18nName;
    }

    public String getParentDepartmentId() {
        return this.parentDepartmentId;
    }

    public void setParentDepartmentId(String parentDepartmentId) {
        this.parentDepartmentId = parentDepartmentId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOpenDepartmentId() {
        return this.openDepartmentId;
    }

    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public String getLeaderUserId() {
        return this.leaderUserId;
    }

    public void setLeaderUserId(String leaderUserId) {
        this.leaderUserId = leaderUserId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getOrder() {
        return this.order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String[] getUnitIds() {
        return this.unitIds;
    }

    public void setUnitIds(String[] unitIds) {
        this.unitIds = unitIds;
    }

    public Integer getMemberCount() {
        return this.memberCount;
    }

    public void setMemberCount(Integer memberCount) {
        this.memberCount = memberCount;
    }

    public DepartmentStatus getStatus() {
        return this.status;
    }

    public void setStatus(DepartmentStatus status) {
        this.status = status;
    }

    public Boolean getCreateGroupChat() {
        return this.createGroupChat;
    }

    public void setCreateGroupChat(Boolean createGroupChat) {
        this.createGroupChat = createGroupChat;
    }

    public DepartmentLeader[] getLeaders() {
        return this.leaders;
    }

    public void setLeaders(DepartmentLeader[] leaders) {
        this.leaders = leaders;
    }

    public Integer[] getGroupChatEmployeeTypes() {
        return this.groupChatEmployeeTypes;
    }

    public void setGroupChatEmployeeTypes(Integer[] groupChatEmployeeTypes) {
        this.groupChatEmployeeTypes = groupChatEmployeeTypes;
    }

    public String[] getDepartmentHrbps() {
        return this.departmentHrbps;
    }

    public void setDepartmentHrbps(String[] departmentHrbps) {
        this.departmentHrbps = departmentHrbps;
    }

    public static class Builder {
        /**
         * 部门名称
         * <p> 示例值：DemoName
         */
        private String name;
        /**
         * 国际化的部门名称
         * <p> 示例值：
         */
        private DepartmentI18nName i18nName;
        /**
         * 父部门的ID;;* 在根部门下创建新部门，该参数值为 “0”
         * <p> 示例值：D067
         */
        private String parentDepartmentId;
        /**
         * 本部门的自定义部门ID;;注意：除需要满足正则规则外，同时不能以`od-`开头
         * <p> 示例值：D096
         */
        private String departmentId;
        /**
         * 部门的open_id，类型与通过请求的查询参数传入的department_id_type相同
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         */
        private String openDepartmentId;
        /**
         * 部门主管用户ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String leaderUserId;
        /**
         * 部门群ID
         * <p> 示例值：oc_5ad11d72b830411d72b836c20
         */
        private String chatId;
        /**
         * 部门的排序，即部门在其同级部门的展示顺序
         * <p> 示例值：100
         */
        private String order;
        /**
         * 部门单位自定义ID列表，当前只支持一个
         * <p> 示例值：custom_unit_id
         */
        private String[] unitIds;
        /**
         * 部门下用户的个数
         * <p> 示例值：100
         */
        private Integer memberCount;
        /**
         * 部门状态
         * <p> 示例值：
         */
        private DepartmentStatus status;
        /**
         * 是否创建部门群，默认不创建
         * <p> 示例值：false
         */
        private Boolean createGroupChat;
        /**
         * 部门负责人
         * <p> 示例值：
         */
        private DepartmentLeader[] leaders;
        /**
         * 部门群雇员类型限制。[]空列表时，表示为无任何雇员类型。类型字段可包含以下值，支持多个类型值；若有多个，用英文','分隔：;1、正式员工;2、实习生;3、外包;4、劳务;5、顾问;6、其他自定义类型字段，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)。
         * <p> 示例值：[1,2,3]
         */
        private Integer[] groupChatEmployeeTypes;
        /**
         * 部门HRBP
         * <p> 示例值：
         */
        private String[] departmentHrbps;

        /**
         * 部门名称
         * <p> 示例值：DemoName
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 国际化的部门名称
         * <p> 示例值：
         *
         * @param i18nName
         * @return
         */
        public Builder i18nName(DepartmentI18nName i18nName) {
            this.i18nName = i18nName;
            return this;
        }


        /**
         * 父部门的ID;;* 在根部门下创建新部门，该参数值为 “0”
         * <p> 示例值：D067
         *
         * @param parentDepartmentId
         * @return
         */
        public Builder parentDepartmentId(String parentDepartmentId) {
            this.parentDepartmentId = parentDepartmentId;
            return this;
        }


        /**
         * 本部门的自定义部门ID;;注意：除需要满足正则规则外，同时不能以`od-`开头
         * <p> 示例值：D096
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 部门的open_id，类型与通过请求的查询参数传入的department_id_type相同
         * <p> 示例值：od-4e6ac4d14bcd5071a37a39de902c7141
         *
         * @param openDepartmentId
         * @return
         */
        public Builder openDepartmentId(String openDepartmentId) {
            this.openDepartmentId = openDepartmentId;
            return this;
        }


        /**
         * 部门主管用户ID
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param leaderUserId
         * @return
         */
        public Builder leaderUserId(String leaderUserId) {
            this.leaderUserId = leaderUserId;
            return this;
        }


        /**
         * 部门群ID
         * <p> 示例值：oc_5ad11d72b830411d72b836c20
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * 部门的排序，即部门在其同级部门的展示顺序
         * <p> 示例值：100
         *
         * @param order
         * @return
         */
        public Builder order(String order) {
            this.order = order;
            return this;
        }


        /**
         * 部门单位自定义ID列表，当前只支持一个
         * <p> 示例值：custom_unit_id
         *
         * @param unitIds
         * @return
         */
        public Builder unitIds(String[] unitIds) {
            this.unitIds = unitIds;
            return this;
        }


        /**
         * 部门下用户的个数
         * <p> 示例值：100
         *
         * @param memberCount
         * @return
         */
        public Builder memberCount(Integer memberCount) {
            this.memberCount = memberCount;
            return this;
        }


        /**
         * 部门状态
         * <p> 示例值：
         *
         * @param status
         * @return
         */
        public Builder status(DepartmentStatus status) {
            this.status = status;
            return this;
        }


        /**
         * 是否创建部门群，默认不创建
         * <p> 示例值：false
         *
         * @param createGroupChat
         * @return
         */
        public Builder createGroupChat(Boolean createGroupChat) {
            this.createGroupChat = createGroupChat;
            return this;
        }


        /**
         * 部门负责人
         * <p> 示例值：
         *
         * @param leaders
         * @return
         */
        public Builder leaders(DepartmentLeader[] leaders) {
            this.leaders = leaders;
            return this;
        }


        /**
         * 部门群雇员类型限制。[]空列表时，表示为无任何雇员类型。类型字段可包含以下值，支持多个类型值；若有多个，用英文','分隔：;1、正式员工;2、实习生;3、外包;4、劳务;5、顾问;6、其他自定义类型字段，可通过下方接口获取到该租户的自定义员工类型的名称，参见[获取人员类型](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/contact-v3/employee_type_enum/list)。
         * <p> 示例值：[1,2,3]
         *
         * @param groupChatEmployeeTypes
         * @return
         */
        public Builder groupChatEmployeeTypes(Integer[] groupChatEmployeeTypes) {
            this.groupChatEmployeeTypes = groupChatEmployeeTypes;
            return this;
        }


        /**
         * 部门HRBP
         * <p> 示例值：
         *
         * @param departmentHrbps
         * @return
         */
        public Builder departmentHrbps(String[] departmentHrbps) {
            this.departmentHrbps = departmentHrbps;
            return this;
        }


        public Department build() {
            return new Department(this);
        }
    }
}
