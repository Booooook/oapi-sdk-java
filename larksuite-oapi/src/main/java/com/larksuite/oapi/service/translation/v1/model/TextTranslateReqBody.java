// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.translation.v1.model;
import com.google.gson.annotations.SerializedName;

public class TextTranslateReqBody {
    @SerializedName("source_language")
    private String sourceLanguage;
    @SerializedName("text")
    private String text;
    @SerializedName("target_language")
    private String targetLanguage;
    @SerializedName("glossary")
    private Term[] glossary;

    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    public void setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
    }

    public Term[] getGlossary() {
        return this.glossary;
    }

    public void setGlossary(Term[] glossary) {
        this.glossary = glossary;
    }

}
