// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.search.v2.model;
import com.google.gson.annotations.SerializedName;

public class SchemaDisplayOption {
    @SerializedName("display_label")
    private String displayLabel;
    @SerializedName("display_type")
    private String displayType;

    public String getDisplayLabel() {
        return this.displayLabel;
    }

    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
    }

    public String getDisplayType() {
        return this.displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

}