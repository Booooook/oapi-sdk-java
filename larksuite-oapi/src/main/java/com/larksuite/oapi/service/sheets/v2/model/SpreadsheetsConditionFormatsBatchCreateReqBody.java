// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.sheets.v2.model;
import com.google.gson.annotations.SerializedName;

public class SpreadsheetsConditionFormatsBatchCreateReqBody {
    @SerializedName("sheet_condition_formats")
    private SheetConditionFormat[] sheetConditionFormats;

    public SheetConditionFormat[] getSheetConditionFormats() {
        return this.sheetConditionFormats;
    }

    public void setSheetConditionFormats(SheetConditionFormat[] sheetConditionFormats) {
        this.sheetConditionFormats = sheetConditionFormats;
    }

}
