// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class SpreadsheetsValuesUpdateReqBody {
    @SerializedName("valueRange")
    private ValueRange valueRange;

    public ValueRange getValueRange() {
        return this.valueRange;
    }

    public void setValueRange(ValueRange valueRange) {
        this.valueRange = valueRange;
    }

}