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

public class InterviewAssessmentTemplateArgs {
    /**
     * 结论题
     * <p> 示例值：
     */
    @SerializedName("conclusion_dimension")
    private InterviewAssessmentDimension conclusionDimension;
    /**
     * 得分题
     * <p> 示例值：
     */
    @SerializedName("score_dimension")
    private InterviewAssessmentDimension scoreDimension;
    /**
     * 记录题
     * <p> 示例值：
     */
    @SerializedName("content_dimension")
    private InterviewAssessmentDimension contentDimension;
    /**
     * 自定义题目
     * <p> 示例值：
     */
    @SerializedName("custom_dimension_list")
    private InterviewAssessmentDimension[] customDimensionList;

    // builder 开始
    public InterviewAssessmentTemplateArgs() {
    }

    public InterviewAssessmentTemplateArgs(Builder builder) {
        /**
         * 结论题
         * <p> 示例值：
         */
        this.conclusionDimension = builder.conclusionDimension;
        /**
         * 得分题
         * <p> 示例值：
         */
        this.scoreDimension = builder.scoreDimension;
        /**
         * 记录题
         * <p> 示例值：
         */
        this.contentDimension = builder.contentDimension;
        /**
         * 自定义题目
         * <p> 示例值：
         */
        this.customDimensionList = builder.customDimensionList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public InterviewAssessmentDimension getConclusionDimension() {
        return this.conclusionDimension;
    }

    public void setConclusionDimension(InterviewAssessmentDimension conclusionDimension) {
        this.conclusionDimension = conclusionDimension;
    }

    public InterviewAssessmentDimension getScoreDimension() {
        return this.scoreDimension;
    }

    public void setScoreDimension(InterviewAssessmentDimension scoreDimension) {
        this.scoreDimension = scoreDimension;
    }

    public InterviewAssessmentDimension getContentDimension() {
        return this.contentDimension;
    }

    public void setContentDimension(InterviewAssessmentDimension contentDimension) {
        this.contentDimension = contentDimension;
    }

    public InterviewAssessmentDimension[] getCustomDimensionList() {
        return this.customDimensionList;
    }

    public void setCustomDimensionList(InterviewAssessmentDimension[] customDimensionList) {
        this.customDimensionList = customDimensionList;
    }

    public static class Builder {
        /**
         * 结论题
         * <p> 示例值：
         */
        private InterviewAssessmentDimension conclusionDimension;
        /**
         * 得分题
         * <p> 示例值：
         */
        private InterviewAssessmentDimension scoreDimension;
        /**
         * 记录题
         * <p> 示例值：
         */
        private InterviewAssessmentDimension contentDimension;
        /**
         * 自定义题目
         * <p> 示例值：
         */
        private InterviewAssessmentDimension[] customDimensionList;

        /**
         * 结论题
         * <p> 示例值：
         *
         * @param conclusionDimension
         * @return
         */
        public Builder conclusionDimension(InterviewAssessmentDimension conclusionDimension) {
            this.conclusionDimension = conclusionDimension;
            return this;
        }


        /**
         * 得分题
         * <p> 示例值：
         *
         * @param scoreDimension
         * @return
         */
        public Builder scoreDimension(InterviewAssessmentDimension scoreDimension) {
            this.scoreDimension = scoreDimension;
            return this;
        }


        /**
         * 记录题
         * <p> 示例值：
         *
         * @param contentDimension
         * @return
         */
        public Builder contentDimension(InterviewAssessmentDimension contentDimension) {
            this.contentDimension = contentDimension;
            return this;
        }


        /**
         * 自定义题目
         * <p> 示例值：
         *
         * @param customDimensionList
         * @return
         */
        public Builder customDimensionList(InterviewAssessmentDimension[] customDimensionList) {
            this.customDimensionList = customDimensionList;
            return this;
        }


        public InterviewAssessmentTemplateArgs build() {
            return new InterviewAssessmentTemplateArgs(this);
        }
    }
}
